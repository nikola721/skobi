import java.util.Arrays;
import java.util.Scanner;
public class new_class {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	      System.out.println("Масив ");
	      int size = scan.nextInt();
	      int arr[] = new int [size];
	      
	      System.out.println("Числа ");
	      for (int i=0; i<size; i++) {
	    	  arr[i] = scan.nextInt();
	      }
	      Arrays.sort(arr);
	      
	      int min_count = 1;
	      int count = 1;
	      int most_arr = 0;
	      for (int i=1; i<size; i++) {
	    	  if (arr[i] == arr[i-1]) {
	    		  count++;
	    	  } else {
	    		  if(count > min_count) {
	    			  min_count = count;
	    			  most_arr = arr[i];
	    		  } 
	    			  count = 1;
	    	  }
	    	  
			  if(count > min_count) {
				  min_count = count;
				  most_arr = arr[i];
			  }
	      }
	      System.out.println("Най-повтарящото се число: " + most_arr);
	      scan.close();
   }
}
