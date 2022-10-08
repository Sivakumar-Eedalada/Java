                   //Basic calculator// 
           //written by E.siva kumar. FS05//

package calc; // it is a collection of classes like a folder.
import java.util.Scanner; //default java utility package to perform scan operation
public class SimpleCalc { // it is the collection of fields and methods 

	public static void main(String[] args) { // this is the actual main method from where the actual program begins.
	    int result; //initializing final result 
        
	Scanner sc = new Scanner(System.in); //initializing scanner class to take input form keyboard
		System.out.println(""); //to add a line Gap
	    System.out.println("                Welcome to Calculator App              "); //appears welcome message on screen
		System.out.println("");//to add a line Gap
		System.out.println("Please enter Your First Number"); //To ask user to enter the first number.
        int a = sc.nextInt(); //Reads the Integer data from Keyboard.
		
		System.out.println(""); //to add a line Gap
		System.out.println("Please enter Your Second Number"); //to Ask user to enter the second number
        int b = sc.nextInt(); //Reads the integer data from Keyboard
				
		System.out.println(""); //to add a line Gap
		System.out.println("Please enter Operator"); //to ask user to enter the operator
        char operator = sc.next().charAt(0); //Reads the arithmetic operator
       	System.out.println(""); // add a line gap
		
		//**here i use if-else if condition**//
	   if(operator =='+') // ** Actual calculator logic starts from here**//
		{
			result = a+b; // add given inputs and store the value in result
			System.out.println("The result is: "+result); //print result
			
		}
	   else if (operator =='-') //else check is it a subtraction operator
	    {
		    result = a-b; // perform subtraction operation store the value in result
		    System.out.println("The result is : "+result); //print result
		   
	    }
	   else if (operator =='*') //else check is it a multiplication operator
	    {
		    result = a*b; //perform multiplication store the value in result
		    System.out.println("The result is : "+result);// print result
		   
	    }
	   else if (operator =='/') //else check is it a division operator
	    {
		    result = a/b; // perform division operation store the value in result
		    System.out.println("The result is : "+result); //print result
	    }  
	   else if (operator =='%') // else if check is it a modular operation
	    {
			result = a%b; //perform modular operation store the value in result
			System.out.println("The result is : "+result); //print result
		   
	    }
	   else // if any other operator 
	    {
	         System.out.println("invalid Operator"); //ask the user to enter valid operator
	    }
	}

}          //*****Thankyou odin school*****//

