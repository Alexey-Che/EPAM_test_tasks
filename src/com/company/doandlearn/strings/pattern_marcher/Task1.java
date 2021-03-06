package com.company.doandlearn.strings.pattern_marcher;

import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task1 {

    private static final String TEXT = "Paragraph#1. This is first sentence. Count of sentences is 3.\n" +
            "Paragraph#2. Flowers: chrysanthemums, roses and daisies - all are buitiful! Do u mind? Really?! Count of sentences is 5.\n" +
            "Paragraph#3. Again and again. Bla Bla Bla Bla this costs $5 & and I want an ice-cream. Count of sentences is 4.\n" +
            "Paragraph#4. Internationalization (sometimes shortened to \"I18N , meaning \"I - eighteen letters -N\") is the process of planning and implementing products and services so that they can easily be adapted to specific local languages and cultures, a process called localization. Count of sentences is 3.\n" +
            "Paragraph#5. \tCount of sentences is 2.\n" +
            "Paragraph#6 and Count of sentences is 1.";

    public static void main(String[] args) {
        Task1 k = new Task1();
        k.go();
    }

    public void go() {
        String start = "- Enter \"1\" for sorting paragraphs by amount of sentences; \n" +
                "- Enter \"2\" for sorting sentences by long words;\n" +
                "- Enter \"3\" for sorting leksem by discending \n" +
                "for end enter \"exit\"\n";
        System.out.println(start);
        String choice = "";
        while (!choice.equalsIgnoreCase("exit")) {
            choice = ReadFromScanner.readStringFromScanner("enter number or exit");
            switch (choice) {
                case "1":
                    sortParagraphs(TEXT);
                    break;
                case "2":
                    sortWords(TEXT);
                    break;
                case "3":
                    sortLexemes(TEXT);
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }

    private String[] splitOnParagraphs(String text) {
        return text.split("\n");
    }

    private void sortParagraphs(String text) {
        String[] paragraphs = splitOnParagraphs(text);
        int[] counterSentences = new int[paragraphs.length];
        int maxLengthParagraph = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitSentenses(paragraphs[i]);
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
    private String[] sortLexeme(String[] words, String letters) {
        for (int k = words.length - 1; k >= 0; k--) {
            for (int m = 0; m < k; m++) {
                int countRight = 0;
                int countLeft = 0;
                for (int n = 0; n < words[m].length(); n++) {
                    if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letters) == 0) {
                        countLeft++;
                    }
                }
                for (int n = 0; n < words[m + 1].length(); n++) {
                    if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letters) == 0) {
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
        return words;
    }

    private void sortLexemes(String text) {
        String letter = ReadFromScanner.readStringFromScanner("Enter simbol for sorting leksem by discending: ");
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentenses(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);
                sortLexeme(words, letter);
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private String[] sortWord(String[] word) {
        for (int k = word.length - 1; k >= 0; k--) {
            for (int m = 0; m < k; m++) {
                if (word[m].length() > word[m + 1].length()) {
                    String tmp = word[m];
                    word[m] = word[m + 1];
                    word[m + 1] = tmp;
                }
            }
        }
        return word;
    }

    private void sortWords(String text) {
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentenses(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);
                sortWord(words);
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private String[] splitSentenses(String text) {
        String[] sentense = text.split("\\.*[.!?]\\s*");
        return sentense;
    }

    private String[] splitWords(String sentence) {
        sentence = sentence.replaceAll("[!?,:;]", "");
        String[] words = sentence.split("\\s+");
        return words;
    }
}
