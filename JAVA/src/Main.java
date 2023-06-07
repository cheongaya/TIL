// Created on iPad.
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("Code App Test 22");

        System.out.println("한국어 테스트");

        ArrayList<String> names = new ArrayList<>();
        names.add("kca");
        names.add("jbs");

        System.out.println(names);

        ArrayList<String> colors = new ArrayList<>();
        // add() method
        colors.add("Black");
        colors.add("White");
        colors.add(0, "Green");
        colors.add("Red");

        // set() method
        colors.set(0, "Blue");

        System.out.println(colors);
    }
}