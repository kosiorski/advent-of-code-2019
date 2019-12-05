package pl.kosiorski.adventofcode2019.day4;

import java.util.stream.IntStream;

public class Day4 {
    public static void main(String[] args) {

        final int beginning = 136760;
        final int end = 595730;


        System.out.println(IntStream.range(beginning, end).filter(Day4::part1).count());
        System.out.println(IntStream.range(beginning, end).filter(Day4::part2).count());
    }

    private static boolean part1(int password) {

        char[] numbers = Integer.toString(password).toCharArray();

        boolean isIncreasing = true;
        boolean isEqual = false;

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i + 1] < numbers[i]) isIncreasing = false;
            if (numbers[i + 1] == numbers[i]) isEqual = true;
        }
        return isIncreasing && isEqual;
    }


    private static boolean part2(int password) {

        char[] numbers = Integer.toString(password).toCharArray();

        boolean isIncreasing = true;
        boolean isEqual = false;
        boolean groupsEquals = false;

        int similar = 0;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i - 1] == numbers[i]) {
                similar++;
                if (i == 5 && similar == 1) {
                    groupsEquals = true;
                }
            } else {
                if (similar == 1) {
                    groupsEquals = true;
                }
                similar = 0;
            }

            if (numbers[i - 1] > numbers[i]) isIncreasing = false;
            if (numbers[i - 1] == numbers[i]) isEqual = true;
        }
        return isIncreasing && isEqual && groupsEquals;
    }
}
