package org.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HouseProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        char[] result = input.toCharArray();
        boolean isPossible = true;

        for (int i = 0; i < n - 1; i++) {
            if (result[i] == 'H' && result[i + 1] == 'H') {
                // Two houses are adjacent, can't separate
                isPossible = false;
                break;
            }
        }

        if (!isPossible) {
            System.out.println("NO");
            return;
        }

        // Maximize fences: Replace all '.' with 'B'
        for (int i = 0; i < n; i++) {
            if (result[i] == '.') {
                result[i] = 'B';
            }
        }

        System.out.println("YES");
        System.out.println(new String(result));
    }
}
