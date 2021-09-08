package Puzzles;

import java.nio.charset.StandardCharsets;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Integer[] listNumbers= new Integer[4];
        listNumbers[0] = 20;
        listNumbers[1] = 12;
        listNumbers[2] = 45;
        listNumbers[3] = 7;


        Main main = new Main();
        int x = main.search(45, listNumbers);
        System.out.println(x);

        String test = "Hello";
        test.getBytes(StandardCharsets.UTF_8);
        System.out.println(test);


    }

    public int search(Integer n, Integer[] list) {
        for (int i = 0; i < list.length; i++) {
            if (Objects.equals(n, list[i])) {
                return i;
            }
        }
        return -1;
    }

}
