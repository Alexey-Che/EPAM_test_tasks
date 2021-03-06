package com.company.doandlearn.basics_of_oop.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class Directory {

    private String path;
    private List<File> files;

    public Directory(String path, List<File> files) {
        this.path = path;
        this.files = files;
    }

    public Directory(String path) {
        this.path = path;
        this.files = new ArrayList<>();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "path='" + path + '\'' +
                ", files=" + files +
                '}';
    }

    /**
     * remove file
     * @param fileName file to remove
     */
    @Deprecated
    public void removeFile(String fileName) {
        files.removeIf(file -> file.getName().equalsIgnoreCase(fileName));
        /*files.removeIf(file -> file.getName().equalsIgnoreCase(fileName));*/

        /*Iterator<File> iterator = files.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().getName().equalsIgnoreCase(fileName)) {   // ok
                iterator.remove();
            }
        }*/
        /*for (File file:files) {
            if(file.getName().equalsIgnoreCase(fileName)) {    //
                files.remove(file);   // java.util.ConcurrentModificationException
            }
        }*/
        /*for (int i = 0; i < files.size(); i++) {
            if(files.get(i).getName().equalsIgnoreCase(fileName)) {
                files.remove(i);   // ok
            }
        }*/
    }
}
