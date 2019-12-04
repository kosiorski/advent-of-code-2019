package pl.kosiorski.adventofcode2019.day1;

import java.io.IOException;
import java.util.List;

import static utils.DataReader.initializeDataIntegers;

public class Day1 {
    public static void main(String[] args) throws IOException {

        final String filePath = "src/main/java/pl/kosiorski/adventofcode2019/day1/input-day1.txt";
        List<Integer> input = initializeDataIntegers(filePath);

        System.out.println(countTotalFuelForList(input));
    }


    private static int countTotalFuelForList(List<Integer> input) {
        return input.stream().mapToInt(Day1::countTotalFuel).sum();
    }


    private static int countTotalFuel(Integer integer) {

        int current = integer;
        int result = 0;

        while (countFuel(current) >= 0) {
            current = countFuel(current);
            result += current;
        }
        return result;
    }

    private static int countFuel(Integer integer) {
        return (int) Math.floor((integer / 3) - 2);
    }
}
