package sai;
import java.util.regex.*;    
import java.util.*; 
public class ValidationofEmailId {
	   
	
		public static void main(String args[]){
			ArrayList<String> emails = new ArrayList<String>();  
		        emails.add("gangasai@gmail.co.in");  
		        emails.add("addalasai06@gmail.com");  
		        emails.add("123456#@yahoo.co.in");  
		        emails.add("addalagangasai@gmail.com");  
		        emails.add("gangasai@yahoo.com");  
		        //Add invalid emails in list  
		        emails.add("@yahoo.com");  
		        emails.add("12abc#gmail.com");  
		        //Regular Expression   
		        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
		        //Compile regular expression to get the pattern  
		        Pattern pattern = Pattern.compile(regex);  
		        //Iterate emails array list  
		        for(String email : emails){  
		            //Create instance of matcher   
		            Matcher matcher = pattern.matcher(email);  
		            System.out.println(email +" : "+ matcher.matches()+"\n");  
		        }  
		    }  
		}

	 
	  