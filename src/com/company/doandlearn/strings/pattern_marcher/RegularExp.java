package com.company.doandlearn.strings.pattern_marcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

/*
    Eng:
    Create an application that parses text (text is stored in a string) and allows
    perform three different operations with text: sort paragraphs by number
    suggestions; in each sentence, sort words by length; sort
    tokens in a sentence in descending order of occurrences of a given character,
    and in case of equality - alphabetically.
    Rus:
   Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее
   выполнять с текстом три различных операции: отсортировать абзацы по количеству
   предложений; в каждом предложении отсортировать слова по длине; отсортировать
   лексемы в предложении по убыванию количества вхождений заданного символа,
   а в случае равенства – по алфавиту.
 */

public class RegularExp {

    private static void makeTextOperation(String text) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = "- Enter \"1\" for sorting paragraphs by amount of sentences; \n" +
                "- Enter \"2\" for sorting sentences by long words;\n" +
                "- Enter \"3\" for sorting leksem by discending \n" +
                "for end enter \"exit\"\n";
        String choice = "";
        System.out.println(start);
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    sortParagraphs(text);
                    break;
                case "2":
                    sortWords(text);
                    break;
                case "3":
                    sortLexemes(text);
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }

    private static void sortParagraphs(String text) {
        String[] paragraphs = text.split("\n");
        int[] counterSentences = new int[paragraphs.length];
        int maxLengthParagraph = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitSentences(paragraphs[i]);
            counterSentences[i] = sentences.length;
            if (maxLengthParagraph < sentences.length) {
                maxLengthParagraph = sentences.length;
            }
        }
        for (int i = 1; i <= maxLengthParagraph; i++) {
            for (int j = 0; j < counterSentences.length; j++) {
                if (i == counterSentences[j]) {
                    System.out.println(paragraphs[j]);
                }
            }
        }
        System.out.println();
    }

    private static void sortWords(String text) {
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        if (words[m].length() > words[m + 1].length()) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        }
                    }
                }

                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void sortLexemes(String text) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter simbol for sorting leksem by discending: ");
        String letter = reader.readLine();
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        int countRight = 0;
                        int countLeft = 0;
                        for (int n = 0; n < words[m].length(); n++) {
                            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countLeft++;
                            }
                        }
                        for (int n = 0; n < words[m + 1].length(); n++) {
                            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countRight++;
                            }
                        }
                        if (countLeft < countRight) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        } else if (countLeft == countRight) {
                            String[] forCompare = {words[m], words[m + 1]};
                            Arrays.sort(forCompare);
                            words[m] = forCompare[0];
                            words[m + 1] = forCompare[1];
                        }
                    }
                }
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static String[] splitSentences(String text) {
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(text);
    }

    private static String[] splitWords(String sentence) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(sentence);
    }

    public static void main(String[] args) throws IOException {
        String text = "Paragraph#1. This is first sentence. Count of sentences is 3.\n" +
                "Paragraph#2. Flowers: chrysanthemums, roses and daisies - all are buitiful! Do u mind? Really?! Count of sentences is 5.\n" +
                "Paragraph#3. Again and again. Bla Bla Bla Bla this costs $5 & and I want an ice-cream. Count of sentences is 4.\n" +
                "Paragraph#4. Internationalization (sometimes shortened to \"I18N , meaning \"I - eighteen letters -N\") is the process of planning and implementing products and services so that they can easily be adapted to specific local languages and cultures, a process called localization. Count of sentences is 3.\n" +
                "Paragraph#5. \tCount of sentences is 2.\n" +
                "Paragraph#6 and Count of sentences is 1.";
        makeTextOperation(text);
    }
}