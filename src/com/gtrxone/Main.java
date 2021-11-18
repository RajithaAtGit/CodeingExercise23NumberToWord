package com.gtrxone;

public class Main {

    public static void main(String[] args) {

        numberToWords(0);

    }

    public static void numberToWords(int number) {
            int reverseNum = reverse(number);
        if (reverseNum >= 0) {

            int deff = getDigitCount(number)-getDigitCount(reverseNum);
//            System.out.println("number "+ getDigitCount(number));
//            System.out.println("numberRE " + getDigitCount(reverseNum));
//            System.out.println(deff);
            do {
                int digit = reverseNum % 10;
                switch (digit) {
                    case 0 -> System.out.println("Zero");
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                }
                if (deff != 0 && getDigitCount(reverseNum)==1){
                    int i =1;
                        while (i <= deff) {
                            System.out.println("Zero");
                            i++;
                    }
                }
                reverseNum /= 10;
            } while (reverseNum != 0);
        } else {
            System.out.println("Invalid Value");
        }

    }

    public static int reverse(int number) {
        int reversce = 0;
        while (true) {
            reversce += number % 10;
            number /= 10;
            if (number == 0) {
                break;
            }
            reversce *= 10;
        }
        return reversce;
    }

    public static int getDigitCount(int number) {
        if (number == 0) {
            return 1;
        } else if (number >= 0) {

            int digitCount = 0;
            while (number > 0) {
                number /= 10;
                digitCount++;
            }
            return digitCount;
        }
        return -1;
    }
}
