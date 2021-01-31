/*
Реализуйте метод, вычисляющий факториал заданного натурального числа
 */
package com.company;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {

    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.valueOf(1);
        for(int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Введите число для вычисления факториала: ");
        n = sc.nextInt();
        System.out.println("Факториал числа: " + factorial(n));
    }
}
