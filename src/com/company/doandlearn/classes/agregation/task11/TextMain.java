package com.company.doandlearn.classes.agregation.task11;

public class TextMain {

    public static void main(String[] args) {

        Sentence sentence1 = new Sentence(new Word("Girl"));
        sentence1.addWord(new Word("eats"));
        sentence1.addWord(new Word("apple"));
        Sentence heading = new Sentence(new Word("Harry"));
        heading.addWord(new Word("Potter"));
        Sentence sentence2 = new Sentence(new Word("She"));
        sentence2.addWord(new Word("is"));
        sentence2.addWords("crazy", "bitch");
        Text text = new Text(heading, sentence1);
        text.addSentence(sentence2);
        System.out.println(text);
    }
}
