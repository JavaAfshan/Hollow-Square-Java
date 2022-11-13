
import java.util.Scanner;
public class MainClass {

	public static void main(String args[])
	{
Scanner myObj=new Scanner(System.in);
		/*(Square of Asterisks) Write an application that prompts the user to enter the size of the side
of a square, then displays a hollow square of that size made of asterisks. Your program should work
for squares of all side lengths between 1 and 20.*/
			    System.out.println("Enter the length of the square");
			    int length=myObj.nextInt();
			    for(int i=0;i<length;i++)
			    {
			    	for(int j=0;j<length;j++)
			    	{
			    		if(i==0||i==(length-1)||j==0||j==(length-1))
			    			System.out.print(" * ");
			    		else
			    			System.out.print("    ");
			    	}
			    	System.out.print("\n");		
			    }
	
	}
}