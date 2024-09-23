package helloworldkarunamoorthy;

import java.util.Scanner;

class input {
	  public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    String userName;
	    
	    // Enter username and press Enter
	    System.out.println("Enter username"); 
	    userName = myObj.nextLine();   
	       
	    System.out.println("Username is: " + userName);
	    
	    Scanner Obj = new Scanner(System.in);
	    String password;

	    System.out.println("Enter your password"); 
	    userName = Obj.nextLine();   
	       
	    System.out.println("your password ****");
	    
	    
	  }
	}