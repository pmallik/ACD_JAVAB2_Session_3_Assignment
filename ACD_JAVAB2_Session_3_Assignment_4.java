import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class ACD_JAVAB2_Session_3_Assignment_4 {
	String studentname;
	String studentGrade;
	String englishmarks;
	String hindimarks;
	String  mathsmarks;
	

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		System.out.println("First Student Input " );
		ACD_JAVAB2_Session_3_Assignment_4 student1 = GetInput();
		int totalmarks = Integer.parseInt(student1.englishmarks) + Integer.parseInt(student1.hindimarks) + Integer.parseInt(student1.mathsmarks);
		System.out.println("First Student Name: " + student1.studentname.toString() + " Grade :" + student1.studentGrade + " Total Marks : " + totalmarks );
		
		
		System.out.println("Second Student Input " );
		ACD_JAVAB2_Session_3_Assignment_4 student2= GetInput();
		
		 totalmarks = Integer.parseInt(student2.englishmarks) + Integer.parseInt(student2.hindimarks) + Integer.parseInt(student2.mathsmarks);
		 System.out.println("Second Student Name: " + student2.studentname.toString() + " Grade :" + student2.studentGrade + " Total Marks : " + totalmarks );
		
		System.out.println("Third Student Input " );
		ACD_JAVAB2_Session_3_Assignment_4 student3= GetInput();
		
		 totalmarks = Integer.parseInt(student2.englishmarks) + Integer.parseInt(student3.hindimarks) + Integer.parseInt(student3.mathsmarks);
		 System.out.println("Third Student Name: " + student3.studentname.toString() + " Grade :" + student3.studentGrade + " Total Marks : " + totalmarks );
		
		

	}
	
	private static String valueOf(String englishmarks2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static ACD_JAVAB2_Session_3_Assignment_4 GetInput() throws IOException
	{
		ACD_JAVAB2_Session_3_Assignment_4 obj1 = new ACD_JAVAB2_Session_3_Assignment_4();
		//GetInput(obj1);
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		System.out.println("Enter  studentname: "); // first string input from user
		obj1.studentname = br.readLine();
		 System.out.println("Enter  student Grade: "); // first string input from user
		 obj1.studentGrade = br.readLine();
		 System.out.println("Enter englishmarks: "); // first string input from user
		 obj1.englishmarks = br.readLine();
		 System.out.println("Enter hindimarks: "); // first string input from user
		 obj1.hindimarks = br.readLine();
		 System.out.println("Enter mathsmarks: "); // first string input from user
		 obj1.mathsmarks = br.readLine();
		 
		 return obj1;
		
		
	}
	

}
