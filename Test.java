import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Input BFR value:");
		int bfr = scan.nextInt();
		Bucket.bfr = bfr;
		System.out.print("Input Global depth:");
		int gd = scan.nextInt();	    
		Table t = new Table(gd);	
    	while(true){
    		System.out.println("\n1. ENTER KEY");
    		System.out.println("2. SEARCH KEY");
    		System.out.println("3. SHOW TABLE");
    		System.out.println("4. EXIT");
    		System.out.print("ENTER CHOIE:");
    		int ch = scan.nextInt();
    		int flag = 0;
    		switch(ch){
    			case 1 :System.out.print("Input value:"); 
    					int val = scan.nextInt();
    					System.out.println("************************LOG***********************");
    					t.addElement(val);
    					System.out.println("**************************************************");
    					break;
    			case 2 :System.out.println("Under development");
    					break;
    			case 3 :t.showTable();
    					break;
    			case 4 :flag = 1;
    					break;
    			default:System.out.println("Incorrect choice");
    					break;
    		}
    		if(flag == 1)
    			break;			
    	}	
    }
}
