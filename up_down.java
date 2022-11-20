import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
public class up_down {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
          Stack <Integer> stack = new Stack <Integer>();
          Random rand = new Random();
          int count = 1;
          int num;
          
          System.out.println("Колко числа да съдържа играта?");
          int a = scan.nextInt();
          for (int i=1; i<= a; i++) {
        	  stack.push(rand.nextInt(1, 101));
          }
          
          System.out.println("Играта започна! Опитай се да познаеш числото.");
          while (!stack.isEmpty()) {
        	  if (stack.peek() == (num = scan.nextInt())) {  
        	   System.out.println("Поздравления ти позна числото: " + stack.peek() + " и преминаваш лъм следващото число, опитай се да го позанеш!");
        	   if (count == 1) {
        		   System.out.println("Познал си " +count+ " числo");
        	   } else {
        		   System.out.println("Познал си " +count+ " числa");
        	   }
        	   count++;
        	   stack.pop();
        	  } else {
        		  if (num == 0) {
        	          System.out.println("Чойтваш, ама чилсото е " + stack.peek());
        		  } else if (num < stack.peek()) {
        			  System.out.println("Нагоре!");
        		  } else if (num > stack.peek()) {
        			  System.out.println("Надолу!");
        		  }
        	  }
          }
          System.out.println("Играта свърши, позна всички числа!");   
          
          
          scan.close();
	}
}
