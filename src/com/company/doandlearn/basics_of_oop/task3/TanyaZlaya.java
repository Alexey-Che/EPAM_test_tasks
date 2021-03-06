package com.company.doandlearn.basics_of_oop.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TanyaZlaya {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "holiday");
        map.put(2, "weekend");
        map.put(3, "holiday");
        String search = "holiday";
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(search)) {
                result.add(entry.getKey());
            }
        }
        System.out.println(result);


    }
}
