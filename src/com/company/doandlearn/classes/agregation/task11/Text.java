package com.company.doandlearn.classes.agregation.task11;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private Sentence heading;
    private List<Sentence> sentences;

    public Text(Sentence heading, List<Sentence> sentences) {
        this.heading = heading;
        this.sentences = sentences;
    }

    public Text(Sentence heading, Sentence sentence) {
        this.heading = heading;
        this.sentences = new ArrayList<>();
        this.sentences.add(sentence);
    }

    public void addSentence(Sentence sentence) {
        this.sentences.add(sentence);
    }

    public void printText() {
        System.out.println("\t\t\t\t" + heading + "\n");
        sentences.forEach(System.out::println);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t\t\t\t");
        stringBuilder.append(heading);
        stringBuilder.append("\n\n");
        for (Sentence sentence:sentences) {
            stringBuilder.append(sentence);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
