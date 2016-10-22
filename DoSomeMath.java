/* *********************************************************************************************************** *
 *                                             Liam McKenzie                                                   *      
 *  A starting Java program in which user will input a value, select the operation, and then the second value. * 
 * 																											   * 
 *  ********************************************************************************************************** */

import java.io.*;
import java.util.Scanner;

@SuppressWarnings("unused")
public class DoSomeMath {
	public static void main(String[] args){
		
		//Initiate Scanner
		@SuppressWarnings("resource")
		Scanner getVal = new Scanner(System.in);
		
		
		//Get first value... assign to firstVal
		System.out.println("Enter your first number: ");
		String firstVal = getVal.nextLine();
		
		//Get math operation and assign to mathOp
				System.out.println("Enter math operation '+', '-', '*', '/', '%': ");
				String mathOp = getVal.nextLine();
				
		
		//Get second value... assign to secVal
		System.out.println("Enter your second number: ");
		String secVal = getVal.nextLine();
		
		
		//Make firstVal and secVal to int
		int fVi = Integer.parseInt(firstVal);
		int sVi = Integer.parseInt(secVal);
		
		//sum diff prod quot modulo
		int sum = fVi + sVi;
		
		//if-statement to do mathOp
		
		if (mathOp.equals("+")){
			System.out.println(firstVal + " + " + secVal + " = " + sum);
		}
		
	}

}
