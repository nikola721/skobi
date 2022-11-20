import java.util.Scanner;
import java.util.Stack;
public class skobi {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  Stack <Character> stack = new Stack <Character>();
		  String skobi = scan.nextLine();
		  char zatvarqshta = ')';
		  char otvarqshta = '(';
		  
		  if (skobi.length() % 2 != 0) {
			  System.out.println("Програмата не е вярна!");
			  return;
		  }
		  
		  for (int i=0; i<skobi.length(); i++) {
			 char tekusht = skobi.charAt(i);
			 
			  if (tekusht == otvarqshta) {
				  stack.push(tekusht);
			  } else if (tekusht == zatvarqshta && !stack.isEmpty()){
					  stack.pop();
			  } else if (tekusht == zatvarqshta && stack.isEmpty()) {
				  System.out.println("Програмата не е вярна!");
				  return;
			  }
		  }
		  
		  if (stack.isEmpty()) {
			  System.out.println("Програмата е вярна!");
		  } else {
			  System.out.println("Програмата не е вярна!");
		  }
		  scan.close();
	}
}
