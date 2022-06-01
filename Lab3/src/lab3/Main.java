package lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please Enter 5 Values:");

        //1st Value
        double firstValue = Double.parseDouble(keyboard.nextLine());

        //2nd Value
        double secondValue = Double.parseDouble(keyboard.nextLine());
        //3rd Value
        double thirdValue = Double.parseDouble(keyboard.nextLine());
        //4th Value
        double fourthValue = Double.parseDouble(keyboard.nextLine());
        //5th Value
        double fifthValue = Double.parseDouble(keyboard.nextLine());

        //Smallest Number
        if (firstValue <= secondValue && firstValue <= thirdValue && firstValue <= fourthValue && firstValue <= fifthValue) {
            System.out.println(firstValue + " is the minimum number.");
        }
        else if (secondValue <= firstValue && secondValue <= thirdValue && secondValue <= fourthValue && secondValue <= fifthValue) {
            System.out.println(secondValue + " is the minimum number.");
        }
        else if (thirdValue <= firstValue && thirdValue <= secondValue && thirdValue <= fourthValue && thirdValue <= fifthValue) {
            System.out.println(thirdValue + " is the minimum number.");
        }
        else if (fourthValue <= firstValue && fourthValue <= secondValue && fourthValue <= thirdValue && fourthValue <= fifthValue) {
            System.out.println(fourthValue + " is the minimum number.");
        }
            else {
                System.out.println(fifthValue + " is the minimum number.");
        }

        //Largest Number
        if (firstValue >= secondValue && firstValue >= thirdValue && firstValue >= fourthValue && firstValue >= fifthValue) {
            System.out.println(firstValue + " is the maximum number.");
        }
        else if (secondValue >= firstValue && secondValue >= thirdValue && secondValue >= fourthValue && secondValue >= fifthValue) {
            System.out.println(secondValue + " is the maximum number.");
        }
        else if (thirdValue >= firstValue && thirdValue >= secondValue && thirdValue >= fourthValue && thirdValue >= fifthValue) {
            System.out.println(thirdValue + " is the maximum number.");
        }
        else if (fourthValue >= firstValue && fourthValue >= secondValue && fourthValue >= thirdValue && fourthValue >= fifthValue) {
            System.out.println(fourthValue + " is the maximum number.");
        }
        else {
            System.out.println(fifthValue + " is the maximum number.");
        }

        //The Average
        double average = (firstValue + secondValue + thirdValue + fourthValue + fifthValue) / 5 ;
        System.out.println("The Average is: " + average);

        //The Standard Deviation Part 1
        double firstValueSd = firstValue - average;
        firstValueSd = firstValueSd * firstValueSd;

        double secondValueSd = secondValue - average;
        secondValueSd = secondValueSd * secondValueSd;

        double thirdValueSd = thirdValue - average;
        thirdValueSd = thirdValueSd * thirdValueSd;

        double fourthValueSd = fourthValue - average;
        fourthValueSd = fourthValueSd * fourthValueSd;

        double fifthValueSd = fifthValue - average;
        fifthValueSd = fifthValueSd * fifthValueSd;

        //The Standard Deviation Part 2
        double sumOfSd = firstValueSd + secondValueSd + thirdValueSd + fourthValueSd + fifthValueSd;
        double sumOfSdDivided = sumOfSd / 5;
        double finalSd = Math.sqrt(sumOfSdDivided);
        System.out.println("The Standard Deviation is: " + finalSd);
    }
}