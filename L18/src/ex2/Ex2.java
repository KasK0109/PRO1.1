package ex2;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.ArrayList;

public class Ex2 {

    /**
     *
     * Tests all the methods.
     */
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(12);
        ints.add(0);
        ints.add(45);
        ints.add(7);
        ints.add(-16);
        ints.add(0);
        ints.add(23);
        ints.add(-10);
//        ints.addAll(Arrays.asList(12, 0, 45, 7, -16, 0, 23, -10));
        System.out.println("ints: " + ints);
        System.out.println();

        // Test of sum() method: correct sum is 61.
        int total = sum1(ints);
        System.out.println("Sum: " + total);
        System.out.println();

        // Test of minimum() method: correct minimum is -16.
        int min = minimum(ints);
        System.out.println("Minimum: " + min);
        System.out.println();

        // Test of maximum() method: correct maximum is 45.
        int max = maximum(ints);
        System.out.println("Maximum: " + max);
        System.out.println();

        // Test of average() method: correct average is 7.625.
        double average = average(ints);
        System.out.println("Average: " + average);
        System.out.println();

        // Test of zeroes() method: correct number of zeroes is 2.
        int zeroes = zeroes(ints);
        System.out.println("Zeroes: " + zeroes);
        System.out.println();

        // Test of evens() method: correct result is [12, 0, -16, 0, -10].
        ArrayList<Integer> evens = evens(ints);
        System.out.println("Evens: " + evens);
        System.out.println();
    }

    // sum made with for statement
    public static int sum1(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            sum = sum + number;
        }
        return sum;
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public static int minimum(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int number : list) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int maximum(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static double average(ArrayList<Integer> list) {
        double average = 0;
        int count = 0;
        for (int number : list) {
            average += number;
            count++;
        }
        return average/count;
    }

    public static int zeroes(ArrayList<Integer> list) {
        int zeroes = 0;
        for (int number : list) {
            if (number == 0) {
                zeroes++;
            }
        }
        return zeroes;
    }

    public static ArrayList<Integer> evens(ArrayList<Integer> list) {
        ArrayList<Integer> evens = new ArrayList<>();
        for (int number : list) {
            if (number % 2 == 0) {
                evens.add(number);
            }
        }
        return evens;
    }

}
