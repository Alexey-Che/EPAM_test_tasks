package com.company.doandlearn.classes.agregation.task1;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private Word heading;
    private List<Sentence> sentences;

    public Text(Word heading, List<Sentence> sentences) {
        this.heading = heading;
        this.sentences = sentences;
    }

    public Text(Word heading, Sentence sentence) {
        this.heading = heading;
        this.sentences = new ArrayList<>();
        this.sentences.add(sentence);
    }

    public void addSentence(Sentence sentence) {
        this.sentences.add(sentence);
    }

    public void printText() {
        System.out.println("\t\t\t\t"+ getHeading()+"\n");
        sentences.forEach(System.out::println);

    }

    public Word getHeading() {
        return heading;
    }

    public void setHeading(Word heading) {
        this.heading = heading;
    }
}
