import java.io.*;
import java.util.*;

public class CheckPositiveNegative {

	public static void main(String[] args) {
	
	System.out.println("Enter a number");
	
	Scanner sc = new Scanner(System.in);
	
	int num  = sc.nextInt();
	
	if(num < 0) 
	
		System.out.println(num+" is negative number");
	
	else if(num > 0)
	
		System.out.println(num+" is positive number");
	}

}
