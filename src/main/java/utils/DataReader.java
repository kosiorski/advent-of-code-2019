package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DataReader {

    public static List<Integer> initializeDataIntegers(String filePath) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(new File(filePath)));
        StringTokenizer st = new StringTokenizer(in.readLine(), ",");

        List<Integer> result = new ArrayList<>();

        while (st.hasMoreTokens()) {
            result.add(Integer.valueOf(st.nextToken()));
        }
        return result;
    }

    public static List<String> initializeDataStrings(String filePath) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(new File(filePath)));
        StringTokenizer st = new StringTokenizer(in.readLine(), ",");

        List<String> result = new ArrayList<>();

        while (st.hasMoreTokens()) {
            result.add(st.nextToken());
        }
        return result;
    }
}
