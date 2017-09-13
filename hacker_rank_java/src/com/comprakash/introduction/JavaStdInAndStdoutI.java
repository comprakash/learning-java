package com.comprakash.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaStdInAndStdoutI {

    public static void main(String[] args) throws IOException {
        theirImplementation();

	    // My Implementation
        //JavaStdInAndStdoutI javaStdInAndStdoutI = new JavaStdInAndStdoutI();
        //javaStdInAndStdoutI.myImplementation();
    }

    private static void theirImplementation() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scan.close();
    }

    private void myImplementation() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(input.readLine());
        int second = Integer.parseInt(input.readLine());
        int third = Integer.parseInt(input.readLine());
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        input.close();
    }
}
