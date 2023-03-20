package IterateThroughArrayList;

import java.util.ArrayList;

public class IterateThroughArrayList {
    public static void main(String[] args) {
    }

    public static String iterateThrough(ArrayList<String> list) {
        StringBuilder sb = new StringBuilder();

        for (String item : list) {
            sb.append(item).append(" ");
        }

        return String.valueOf(sb);
    }
}