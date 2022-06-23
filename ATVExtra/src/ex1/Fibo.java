package ex1;

import java.util.Scanner;

public class Fibo {


	    public static void Fibonacci (int i) {
	        double num1 = 0, num2 = 1;
	        int counter = 0;
	        while (counter < i) {
	            System.out.print(num1 + " ");
	            double num3 = num2 + num1;
	            num1 = num2;
	            num2 = num3;
	            counter = counter + 1;
	        }
	    }

	    public static void main(String args[]) {
	        System.out.println("Quanto tempo voce quer que seja sua sequencia Fibonacci ?");
	        Scanner sc = new Scanner(System.in);
	        int i = sc.nextInt();
	        Fibonacci(i);
	    }
	}

