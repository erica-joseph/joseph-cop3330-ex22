import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App {
    public static void main(String[] args) {
        //initiate scannner
        Scanner sc = new Scanner(System.in);
//input
        System.out.print("Enter the first number ");
        int first = sc.nextInt();
        System.out.print("Enter the second number ");
        int second = sc.nextInt();
        System.out.print("Enter the third number ");
        int third = sc.nextInt();

        if(first>=second && first >=third){
            System.out.print(first +"is the largest number");
        }
        else if(second >= first && second >= third){
            System.out.print(second +"is the largest number");
        }
        else if(third >= first && second >= second){
            System.out.print(third +" is the largest number");
        }
    }
}