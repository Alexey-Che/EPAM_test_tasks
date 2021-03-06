package com.company.doandlearn.classes.agregation.task11;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private List<Word> words;

    public Sentence(List<Word> words) {
        this.words = words;
    }

    public Sentence(Word word) {
        this.words = new ArrayList<>();
        this.words.add(word);
    }

    public void addWords(String ... wordsStr) {
        for (String word:wordsStr) {
            words.add(new Word(word));
        }
    }

    public void addWord(Word word) {
        this.words.add(word);
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Word word:words) {
            text.append(word);
            text.append(" ");
        }
        text.append("\b.");
        return text.toString();
    }
}
