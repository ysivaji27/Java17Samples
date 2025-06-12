package org.java.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinimizeCost {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().trim().split("\\s+");
       // List<Integer> numberArray = Arrays.stream(br.readLine().trim().split("\\s+")).map(Integer::parseInt).limit(size).toList();
         int size = Integer.parseInt(input[0]);
        int transforms = Integer.parseInt(input[1]);
        String[] numbers = br.readLine().trim().split("\\s+");
        long[] arr = new long[size];
        for (int i = 0; i <size; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }

        for(int i = 0; i < transforms; i++) {

        }

    }
}
