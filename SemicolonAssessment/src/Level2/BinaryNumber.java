package Level2;

import java.util.Scanner;

public class BinaryNumber { // Question 1

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Binary Number: ");
            int binary = input.nextInt();
            int binaryEquivalent = binary;
            int decimalNumber = 0;
            int position = 0;

            while (binary > 0) {
                int digit = binary % 10;
                decimalNumber += digit * (int) Math.pow(2, position);
                binary /= 10;
                position++;
            }
            System.out.println("The decimal equivalent of " + binaryEquivalent + " is " + decimalNumber + ".");
        }
    }

