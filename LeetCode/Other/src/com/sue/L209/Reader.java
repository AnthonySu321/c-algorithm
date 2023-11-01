package com.sue.L209;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** Class for buffered reading int and double values */
public class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}

class TestPerformance {

    public static String generateInput(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            sb.append(i).append(" ");
        }
        return sb.toString();
    }

    public static void testReader(int count) throws IOException {
        long startTime = System.currentTimeMillis();

        Reader.init(new ByteArrayInputStream(generateInput(count).getBytes()));
        for (int i = 0; i < count; i++) {
            int n = Reader.nextInt();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("使用 Reader 耗时: " + (endTime - startTime) + "ms");
    }

    public static void testScanner(int count) {
        long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(generateInput(count));
        for (int i = 0; i < count; i++) {
            int n = scanner.nextInt();
        }
        scanner.close();

        long endTime = System.currentTimeMillis();
        System.out.println("使用 Scanner 耗时: " + (endTime - startTime) + "ms");
    }

    public static void main(String[] args) throws IOException {
        int count = 10000000;  // 可以调整这个数值来改变输入数据的大小
        testReader(count);
        testScanner(count);
    }
}
