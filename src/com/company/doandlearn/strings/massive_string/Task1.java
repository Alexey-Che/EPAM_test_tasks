package com.company.doandlearn.strings.massive_string;

public class Task1 {
    public static void main(String[] args) {
        Task1 k = new Task1();
        k.go();
    }

    public void go() {
        String[] camelCase = {"alekseiIsALittleBug", "alekseiIsALittleBug", "alekseiIsALittleBug"};
        String[] snakeCase = convertToSnakeCase(camelCase);
        System.out.println(String.join(", ", camelCase));
        System.out.println(String.join(", ", snakeCase));
    }

    public String[] convertToSnakeCase(String[] a) {
        String[] snakeCase = new String[a.length];
        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < a[i].length(); j++) {
                char letter = a[i].toCharArray()[j];
                if (Character.isLowerCase(letter)) {
                    stringBuilder.append(letter);
                } else {
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i]=stringBuilder.toString();
        }
        return snakeCase;
    }

}
