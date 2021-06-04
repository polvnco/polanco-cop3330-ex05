/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;


import java.util.Scanner;

public class ex05
{
    public static void main( String[] args )
    {
        System.out.print("What is the first number? ");
        Scanner firstNum = new Scanner(System.in);
        String x = firstNum.nextLine();
        System.out.print("What is the second number? ");
        Scanner secondNum = new Scanner(System.in);
        String y = secondNum.nextLine();

        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;




        System.out.print(
                a + " " + "+" + " "  + b + " "  + "=" + " "  + c + "\n" + a + " " + "-" + " "  + b + " "  + "=" + " "  + d + "\n" +
                a + " " + "*" + " "  + b + " "  + "=" + " "  + e + "\n" + a + " " + "/" + " "  + b + " "  + "=" + " "  + f );


    }
}
