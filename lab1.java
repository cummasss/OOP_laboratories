package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner getter = new Scanner(System.in);
        int n, m, a, b, checker;
        int res = 0;
        int constanta = 1129%3;
        int znammennuk = 0, chislivnuk = 0;
        System.out.print("Enter n: ");
        n = getter.nextInt();
        System.out.print("Enter m: ");
        m = getter.nextInt();
        System.out.print("Enter a: ");
        a = getter.nextInt();
        System.out.print("Enter b: ");
        b = getter.nextInt();
        for (int i = a; i < n; i++){
            checker = i - constanta;
            if (checker != 0) {
                for (int j = b; j < m; j++) {
                    chislivnuk = i - j;
                    znammennuk = i - constanta;
                    res += chislivnuk / znammennuk;
                }
            } else {
                System.out.print("In spite of that i = "+i+" and C = "+constanta+" give zero in znammennuk");
                System.out.print(", we can't numerate it");
            }
        }
        System.out.println(res);
    }
}
