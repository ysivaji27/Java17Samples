package org.java.test;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;

class SpecialSumFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read array size
        int n = 10;// Integer.parseInt(br.readLine());
        String[] input ="2 1 3 9 2 4 -10 -9 1 3".split("\\s+"); // br.readLine().split("\\s+");

        int[] arr = new int[n];
        long[] prefixSum = new long[n + 1]; // prefixSum[i] = sum of first i elements

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
            System.out.println("arr[" + i + "] = " + arr[i]+" prefixSum[" + (i + 1) + "] = " + (prefixSum[i] + arr[i])); // Debugging output
            prefixSum[i + 1] = prefixSum[i] + arr[i];
        }

        long maxSpecialSum = Long.MIN_VALUE;

        // Try every index as a starting point
        for (int i = 0; i < n; i++) {
            int groupSize = 1;
            int currentIndex = i;
            long sum = 0;

            // Accumulate using prefix sums
            while (currentIndex + groupSize <= n) {
                int end = currentIndex + groupSize;
                System.out.println("Current Index: " + currentIndex + ", Group Size: " + groupSize + ", End: " + end); // Debugging output
                System.out.println("Adding sum from prefixSum[" + end + "] - prefixSum[" + currentIndex + "] = " +prefixSum[end]  +" : "+ prefixSum[currentIndex]+" : "+ (prefixSum[end] - prefixSum[currentIndex])); // Debugging output
                sum += prefixSum[end] - prefixSum[currentIndex];
                currentIndex = end;
                groupSize++;
            }

            maxSpecialSum = Math.max(maxSpecialSum, sum);
        }

        System.out.println(maxSpecialSum);
    }
}

    