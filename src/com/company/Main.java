package com.company;
import java.util.Scanner;

public class Main {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter number of Units : ");

            int numbersOfUnit = scanner.nextInt();

            float totalAmount = BillCalculator(numbersOfUnit);

            System.out.println("Total Amount = " + totalAmount);

            System.out.println("You pay "+ totalAmount + " within 15 days ?");

            System.out.println("Enter 0 for No & 1 for Yes");

            int response = scanner.nextInt();

            if(response == 1)

                System.out.println("The Adjusted Amount = " + totalAmount*0.90 + "(You got 10% Discount.)");

            else System.out.println("The Adjusted Amount = " + totalAmount*1.05 + "(5% surcharge added.)");

        }

        private static float BillCalculator(int numbersOfUnit) {

            float ans;

            if(numbersOfUnit <= 200){

                ans = (float) (2.5*numbersOfUnit);

            }

            else if(numbersOfUnit <= 500){

                ans = (float) ((numbersOfUnit - 200)*3.5 + 200*2.5);

            }

            else {

                ans = (float) (200*2.5 + 300*3.5 + (numbersOfUnit - 500)*5);

            }

            return ans;

        }

    }