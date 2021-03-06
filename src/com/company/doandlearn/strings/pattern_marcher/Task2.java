package com.company.doandlearn.strings.pattern_marcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    private static final String xml = "<notes>\n" +
            "    <note id = \"1\">\n" +
            "        <to>Вася</to>\n" +
            "        <from>Света</from>\n" +
            "        <heading>Напоминание</heading>\n" +
            "        <body>Позвони мне завтра!</body>\n" +
            "    </note>\n" +
            "    <note id = \"2\">\n" +
            "        <to>Петя</to>\n" +
            "        <from>Маша</from>\n" +
            "        <heading>Важное напоминание</heading>\n" +
            "        <body/>\n" +
            "    </note>\n" +
            " </notes> \n";

    public static void main(String[] args) {
        Task2 k = new Task2();
        k.go();
        //System.out.println(k.getClass());
    }

    public void go() {
        System.out.println(xmlAnalyze(xml));
    }

    private String xmlAnalyze(String xml) {
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pOpen = Pattern.compile("<\\w.+?>");
        Pattern pClose = Pattern.compile("</\\w+>");
        Pattern pBody = Pattern.compile(">.+?<");
        Pattern pEmpty = Pattern.compile("<\\w.+?/>");
        String [] strings = xml.split("\n\\s*");
        for (String line : strings) {
            Matcher mOpen = pOpen.matcher(line);
            Matcher mClose = pClose.matcher(line);
            Matcher mBody = pBody.matcher(line);
            Matcher mEmpty = pEmpty.matcher(line);
            if (mEmpty.find()) {
                stringBuilder.append(mEmpty.group());
                stringBuilder.append(" - tag without body\n");
            } else if (mOpen.find()) {
                stringBuilder.append(mOpen.group());
                stringBuilder.append(" - opened tag\n");
            }
            if (mBody.find()) {
                stringBuilder.append(mBody.group().substring(1));
                stringBuilder.append("\b - tag consists\n");
            }
            if (mClose.find()) {
                stringBuilder.append(mClose.group());
                stringBuilder.append(" - closed tag\n");
            }
        }
        return stringBuilder.toString();
    }
}
