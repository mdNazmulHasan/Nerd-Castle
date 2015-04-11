import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class MainActivity {

	public static void main(String[] args) {
		ArrayList<Student> stdntData=new ArrayList<Student>();
		int age ,sum=0;
		String id = null,name;
		String b="q";
		 Student s;
	      int i;
		 Scanner scanIn = new Scanner(System.in);
	       while(true){
	    	  
	    	   System.out.println("Enter your id");
		       id = scanIn.nextLine();
	    	   if(id.equals(b)){
	    		   System.out.println("Closed input");
	    		   break; 
	       }else{
	    	  
	    	  
		       System.out.println("Enter your name");
		       name = scanIn.nextLine();
		       System.out.println("Enter your age");
		       age = Integer.parseInt(scanIn.nextLine());
		       s=new Student(id,name,age);
		       stdntData.add(s);
	       }
	    	  
	       }
	       System.out.println("Number of student : "+stdntData.size() );
	     
	       for(int j=0;j<stdntData.size();j++){
	    	  
	    	   sum=sum+stdntData.get(j).getAge();
	    	   
	       }
	       System.out.println("Average age of student : "+(sum/stdntData.size()) );
	       
	       System.out.println("ID    NAME    AGE");
	       for(i=0;i<stdntData.size();i++){
	    	   
	    	   System.out.println(stdntData.get(i).getId()+"----"+stdntData.get(i).getName()+"----"+stdntData.get(i).getAge()); 
	       }
	}

}
