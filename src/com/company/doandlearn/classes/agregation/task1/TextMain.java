package com.company.doandlearn.classes.agregation.task1;

import java.util.Arrays;

public class TextMain {

    public static void main(String[] args) {

        Word heading = new Word("Harry Potter and the Sorcerer's Stone");
        String line1 = "Mr. and Mrs. Dursley, of number four, Privet Drive, were proud to say that they were\n"+
                "perfectly normal, thank you very much. They were the last people you'd expectto be involved\n"+
                "in anything strange or mysterious, because they just didn't hold with such nonsense.\n";
        Sentence sentence = new Sentence(line1);
        Text harry = new Text(heading, sentence);
        String line2 = "Mr. Dursley was the director of a firm called Grunnings, which made drills. He was\n"+
                "a big, beefy man with hardly any neck, although he did have a very large mustache. Mrs. Dursley\n"+
                "was thin and blonde and had nearly twice the usual amount of neck, which came in very useful\n"+
                "as she spent so much of her time craning over garden fences, spying on the neighbors. The Dursleys\n"+
                "had a small son called Dudley and in their opinion there was no finer boy anywhere.\n";
        String line3 = "The Dursleys had everything they wanted, but they also had a secret, and their greatest\n"+
                "was that somebody would discover it. They didn't think they could bear it if anyone found out\n"+
                "about the Potters. Mrs. Potter was Mrs. Dursley's sister, but they hadn't met for several years;\n"+
                "in fact, Mrs. Dursley pretended she didn't have a sister, because her sister and her good-for-nothing\n"+
                "husband were as unDursleyish as it was possible to be. The Dursleys shuddered to think what the \n"+
                "neighbors would say if the Potters arrived in the street. The Dursleys knew that the Potters had\n"+
                "a small son, too, but they had never even seen him. This boy was another good reason for keeping\n"+
                "the Potters away; they didn't want Dudley mixing with a child like that.";
        harry.addSentence(new Sentence(line2));
        harry.addSentence(new Sentence(line3));
        harry.printText();
    }
}
