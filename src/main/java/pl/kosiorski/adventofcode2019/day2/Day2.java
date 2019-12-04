package pl.kosiorski.adventofcode2019.day2;

import java.util.ArrayList;
import java.util.List;

import static utils.DataReader.initializeDataIntegers;

public class Day2 {
    public static void main(String[] args) throws Exception {

        final String filePath = "src/main/java/pl/kosiorski/adventofcode2019/day2/input-day2.txt";

        List<Integer> inputToFirstPart = initializeDataIntegers(filePath);
        System.out.println("First part result: " + part1(inputToFirstPart, 12, 2));

        List<Integer> inputToSecondPart = initializeDataIntegers(filePath);
        System.out.println("Second part result: " + part2(inputToSecondPart));
    }


    private static int part2(List<Integer> input) {

        int result = 0;

        for (int noun = 0; noun <= 99; noun++)
            for (int verb = 0; verb <= 99; verb++) {

                List<Integer> copiedArray = new ArrayList<>(input);

                if (part1(copiedArray, noun, verb) == 19690720)
                    result = 100 * noun + verb;
            }
        return result;
    }

    private static int part1(List<Integer> data, int noun, int verb) {

        data.set(1, noun);
        data.set(2, verb);

        int current = 0;

        do {
            int position1 = data.get(current + 1);
            int position2 = data.get(current + 2);
            int savePosition = data.get(current + 3);


            switch (data.get(current)) {

                case 1:
                    int result1 = (data.get(position1)) + (data.get(position2));
                    data.set(savePosition, result1);
                    current += 4;
                    break;

                case 2:
                    int result2 = (data.get(position1)) * (data.get(position2));
                    data.set(savePosition, result2);
                    current += 4;
                    break;

                case 99:
                    break;

                default:
                    System.out.println("Error");
                    break;
            }
        }
        while (data.get(current) != 99);

        return data.get(0);
    }
}