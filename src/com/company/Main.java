package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime(int number) {
        if (number < 0 || number == 0 || number == 1) {
            return -1;
        } else if(number == 2) {
            return 2;
        }
        boolean theLargestPrimeFlag = false;
        int theLargestPrime = -1;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        theLargestPrimeFlag = false;
                        break;
                    } else {
                        theLargestPrimeFlag = true;
                    }
                }
                if (theLargestPrimeFlag && i > theLargestPrime || i > theLargestPrime && i == 2) {
                    theLargestPrime = i;
                }
            }
        }
        if (theLargestPrime == -1) {
            return -1;
        } else {
            return theLargestPrime;
        }
    }


}
