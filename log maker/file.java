import java.io.*;
import java.net.URI;
import java.util.*;
public class file {

	public static void main(String[] args) throws IOException {
		 try {   
			 Calendar cld = Calendar.getInstance();
			 File myObj = new File("C:\\Users\\Admin\\system start up.txt");
		      FileWriter myObj1 = new FileWriter("C:\\Users\\Admin\\system start up.txt");  
		      if (myObj.createNewFile()) { 
		    	  String Min = "";
		         Min = Min.valueOf(cld.get(Calendar.MINUTE));
		         String hour = "";
		         hour = hour.valueOf(cld.get(Calendar.HOUR));
		         String se = "";
		         se = se.valueOf(cld.get(Calendar.SECOND));
		         myObj1.write("Your Laptop has Started on ");
		        myObj1.write(hour + ":" + Min + ":" + se );
		        
		        myObj1.close();
		      } else {  
		        
		        myObj.delete();
		        myObj.createNewFile();
 myObj.delete();
		        myObj.createNewFile();
		        String Min = "";
		         Min = Min.valueOf(cld.get(Calendar.MINUTE));
		         String hour = "";
		         hour = hour.valueOf(cld.get(Calendar.HOUR));
		         String se = "";
		         se = se.valueOf(cld.get(Calendar.SECOND));
		         myObj1.write("Your Laptop has Started on ");
		        myObj1.write(hour + ":" + Min + ":" + se );
		        
		        myObj1.close();
		      }  
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();  
		    }  
		  }  
		} 