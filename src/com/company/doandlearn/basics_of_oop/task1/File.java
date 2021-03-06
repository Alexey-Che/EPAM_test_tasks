package com.company.doandlearn.basics_of_oop.task1;

public abstract class File {

    private String name;
    private Directory directory;

    public File(String name, Directory directory) {
        this.name = name;
        this.directory = directory;
    }

    public String getName() {
        return name;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }
}
