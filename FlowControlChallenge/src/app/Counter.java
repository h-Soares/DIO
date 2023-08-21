package app;

import exceptions.InvalidParametersException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter parameter one: ");
            int parameterOne = scan.nextInt();
            System.out.print("Enter parameter two: ");
            int parameterTwo = scan.nextInt();

            count(parameterOne, parameterTwo);
        }catch(InputMismatchException e) {
            System.out.println("Parameters must be integers");
        }catch(InvalidParametersException e) {
            System.out.println(e.getMessage());
        }
        scan.close();
    }
    static void count(int parameterOne, int parameterTwo) throws InvalidParametersException {
        if(parameterOne > parameterTwo)
            throw new InvalidParametersException("Parameter two must be greater than parameter one");

        for(int i = 1; i <= parameterTwo - parameterOne; i++) {
            System.out.println("Number " + i);
        }
    }
}