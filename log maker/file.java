import java.io.*;
import java.net.URI;
import java.util.*;
public class file {

	public static void main(String[] args) throws IOException {
		 try { 
			 ArrayList<String> al = new ArrayList<>();
			 Calendar cld = Calendar.getInstance();
			 File myObj = new File("C:\\Users\\Admin\\system start up.txt");
			
		        Date date=java.util.Calendar.getInstance().getTime();
		    String temp =    date.toString();
		   if(myObj.exists()) {
			    Scanner s = new Scanner(myObj);
			    while(s.hasNext()) {
			    	al.add(s.nextLine());
			    }
		    	 
				 FileWriter myObj1 = new FileWriter("C:\\Users\\Admin\\system start up.txt");

		         for(int i = 0;i<al.size();i++) {
		        	 myObj1.write(al.get(i) + "\n");
		         }
		         myObj1.write("Your Laptop has Started on " + temp + "\n");
		       
		      
		        myObj1.close();
		       
		       
		   }else {
				 FileWriter myObj1 = new FileWriter("C:\\Users\\Admin\\system start up.txt");
				
		         myObj1.write("Your Laptop has Started on " + " "+ temp + "\n");
			       
		   }
		    
		   
		 }
		     catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();  
		    }  
		  }  
		} 
