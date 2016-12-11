import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
public class ACD_JAVAB2_Session_3_Assignment_2 {
	
	public static void main(String[] args)throws IOException {
	//Bypassing checked exception  
		// Java statement to assign the value true to the boolean variable same ,
		// when the String  variable S1  has the same contents as the String  variable S2 , and false otherwise
		// Java statement to assign the value true to the boolean variable same , when the String  variable S1
		//has the same contents as the String  variable S2 , 
		//and false otherwise
		
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		

		
		System.out.println("Enter S1: "); // first string input from user
		String S1 = br.readLine();
		System.out.println("Enter S2: "); //second string input from user
		String S2 = br.readLine();
		boolean same = false;
		if (S1.matches(S2))  // using matches method for comparing string
		{
			same=true;
		}
		
		
		System.out.println("Result ="+same); //result as output
		
		

	}

}
