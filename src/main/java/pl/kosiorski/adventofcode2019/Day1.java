package pl.kosiorski.adventofcode2019;

import java.util.Arrays;
import java.util.List;

public class Day1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                129880,
                115705,
                118585,
                124631,
                81050,
                138183,
                61173,
                95354,
                130788,
                89082,
                75554,
                110104,
                140528,
                71783,
                125889,
                126602,
                73089,
                76822,
                51774,
                85940,
                81004,
                149584,
                145921,
                105570,
                142370,
                80823,
                147779,
                115651,
                70250,
                67763,
                128192,
                51298,
                134963,
                73510,
                90976,
                141216,
                65134,
                140468,
                143998,
                101711,
                88477,
                53335,
                138328,
                141186,
                149804,
                64950,
                53107,
                54648,
                97557,
                85927,
                125038,
                80514,
                64912,
                140591,
                114229,
                57089,
                123464,
                127572,
                137169,
                146550,
                51138,
                115504,
                128034,
                147244,
                108107,
                101205,
                51498,
                136829,
                140171,
                59441,
                144489,
                139384,
                145841,
                96771,
                116821,
                88599,
                126780,
                65012,
                67621,
                129699,
                149639,
                97590,
                147527,
                117462,
                146709,
                60527,
                107643,
                92956,
                72177,
                92285,
                62475,
                63099,
                66904,
                77268,
                62945,
                134364,
                106924,
                117842,
                130016,
                123712

        );

        System.out.println(countTotalFuelForList(numbers));
    }


    private static int countTotalFuelForList(List<Integer> input) {
        return input.stream().mapToInt(Day1::countTotalFuel).sum();
    }


    private static int countTotalFuel(Integer integer) {

        int temp = integer;
        int result = 0;

        while (countFuel(temp) >= 0) {
            temp = countFuel(temp);
            result += temp;
        }
        return result;
    }

    private static int countFuel(Integer integer) {
        return (int) Math.floor((integer / 3) - 2);
    }
}
