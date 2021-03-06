package com.company.doandlearn.basics_of_oop.task1;

public class TextFile extends File {

    private String text;

    public TextFile(String name, Directory directory, String text) {
        super(name, directory);
        this.text = text;
        directory.addFile(this);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addText(String text) {
        this.text = this.text.concat(text);
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "text='" + text + '\'' +
                '}';
    }
}
