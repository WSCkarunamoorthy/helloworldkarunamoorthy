package helloworldkarunamoorthy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputoutput {
	public static void main(String[] args)
	        throws IOException
	       
	    {
	        BufferedReader bfn = new BufferedReader(
	            new InputStreamReader(System.in));
	        System.out.println("Enter Your Name");
	        System.out.println("Enter Your Age");
	        String str = bfn.readLine();
	        int it = Integer.parseInt(bfn.readLine());

	        System.out.println("hai " + str);

	        System.out.println("your age " + it);
	    }
}
