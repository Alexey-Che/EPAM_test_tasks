package com.company.doandlearn.strings.massive_string;

public class Task2 {
    public static void main(String[] args) {
        Task2 k = new Task2();
        k.go();
    }

    public void go() {
        String stringa = "word word hello world force it word. ";
        System.out.println(stringa.replace("word", "letter"));
        String string = "word tatiusya hi word hello maaark word dog word house";
        //System.out.println(string.replace("word", "letter"));
        String letter = changeWordOnLetter(string);
        System.out.println(letter);

    }

    public String changeWordOnLetter(String a) {
        StringBuilder stringBuilder = new StringBuilder();
        String letter;
        for (int i=0;i<a.length();i++) {
            if (i + 3 < a.length() && a.charAt(i) == 'w'
                    && a.charAt(i + 1) == 'o'
                    && a.charAt(i + 2) == 'r'
                    && a.charAt(i + 3) == 'd') {
                stringBuilder.append("letter");
                i += 3;
            } else {
                stringBuilder.append(a.charAt(i));
            }
        }
        letter = stringBuilder.toString();
        return letter;
    }
}
