package com.company.doandlearn.basics_of_oop.task1;

public class FileMain {

    public static void main(String[] args) {

        Directory directory = new Directory("C:\\");
        File textFile = new TextFile("text", directory,
                "But on the edge of town");
        //directory.addFile(textFile);
        System.out.println(directory);
        textFile.setName("text3");
        System.out.println(textFile);
        if (textFile instanceof TextFile) {
            ((TextFile)textFile).addText(" , drills were driven out of his mind by something else.");
        }
        System.out.println(textFile);

        File textFile2 = new TextFile("text2", directory,
                "But on the edge of town");

        System.out.println("----------------------");
        System.out.println(directory);

        directory.removeFile("text2");
        System.out.println(directory);
    }
}
