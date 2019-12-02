package pl.kosiorski.adventofcode2019;

public class Day2 {
    public static void main(String[] args) {


//        String input = "1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,10,19,1,6,19,23,1,10,23,27,2,27,13,31,1,31,6,35,2,6,35,39,1,39,5,43,1,6,43,47,2,6,47,51,1,51,5,55,2,55,9,59,1,6,59,63,1,9,63,67,1,67,10,71,2,9,71,75,1,6,75,79,1,5,79,83,2,83,10,87,1,87,5,91,1,91,9,95,1,6,95,99,2,99,10,103,1,103,5,107,2,107,6,111,1,111,5,115,1,9,115,119,2,119,10,123,1,6,123,127,2,13,127,131,1,131,6,135,1,135,10,139,1,13,139,143,1,143,13,147,1,5,147,151,1,151,2,155,1,155,5,0,99,2,0,14,0";
//        int[] dataArray = initializeData(input);


        int[] test1 = {1, 9, 10, 3, 2, 3, 11, 0, 99, 30, 40, 50};
        int[] test2 = {2, 4, 4, 5, 99, 0};
        int[] test3 = {2,3,0,3,3,99};


        int[] result1 = solveProblem(test3);

        for (int current : result1) {
            System.out.print(current + ", ");
        }

    }


    private static int[] solveProblem(int[] data) {

        for (int i = 0; i < data.length; i += 4) {

            int opcode = data[i];

            if (opcode == 99) {
                break;
            }

            int position1 = data[i + 1];
            int position2 = data[i + 2];
            int savePosition = data[i + 3];


            if (opcode == 1) {
                data[savePosition] = data[position1] + data[position2];

            } else if (opcode == 2) {
                data[savePosition] = data[position1] * data[position2];
            }
        }


        return data;
    }


//    private static int[] initializeData(String input) {
//        String[] arrOfStrings = input.split(",");
//        int[] arrOfIntegers = new int[arrOfStrings.length];
//        for (int i = 0; i < arrOfStrings.length; i++) {
//            arrOfIntegers[i] = Integer.parseInt(arrOfStrings[i]);
//        }
//        return arrOfIntegers;
//    }
}
