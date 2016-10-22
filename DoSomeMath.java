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
		String firstVal = getVal.nextLine().trim();
		
		//Get math operation and assign to mathOp
				System.out.println("Enter math operation '+', '-', '*', '/', '%', '^': ");
				String mathOp = getVal.nextLine().trim();
				
		
		//Get second value... assign to secVal
		System.out.println("Enter your second number: ");
		String secVal = getVal.nextLine().trim();
		
		
		//Make firstVal and secVal to double
		double fVd = Double.parseDouble(firstVal);
		double sVd = Double.parseDouble(secVal);
		
		//sum diff prod quot modulo
		double sum = fVd + sVd;
		double diff = fVd - sVd;
		double prod = fVd * sVd;
		double quot = fVd / sVd;
		double mod = fVd % sVd;
		double exp = Math.pow(fVd, sVd);
		
		//if-statement to do mathOp
		
		if (mathOp.equals("+")){
			System.out.println(firstVal + " + " + secVal + " = " + sum);
		
		}else if(mathOp.equals("-")){
			System.out.println(firstVal + " - " + secVal + " = " + diff);
					
		}else if(mathOp.equals("*")){
			System.out.println(firstVal + " * " + secVal + " = " + prod);
			
		}else if(mathOp.equals("/")){
			System.out.println(firstVal + " / " + secVal + " = " + quot);
			
		}else if(mathOp.equals("%")){
			System.out.println(firstVal + " % " + secVal + " = " + mod);
			
		}else if(mathOp.equals("^")){
			System.out.println(firstVal + " ^ " + secVal + " = " + exp);
		}
		
	}

}
