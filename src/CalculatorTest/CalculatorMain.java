package CalculatorTest;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in två tal hihi: ");


        Calculator calc = new Calculator(scan.nextDouble(), scan.nextDouble());

        calc.addition();
        calc.divided();
        calc.subtraction();
        calc.multiply();






    }
}
