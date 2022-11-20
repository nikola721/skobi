import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class password_generator {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  Random rand = new Random();
		  int puti = 0;
		  
		  System.out.println("Какво е името на файла?");
		  String filename = scan.nextLine();
		  FileWriter myWriter;
   try {
	   
			File myObj = new File(filename + ".txt");
			myWriter = new FileWriter(myObj);
			
		  char ABC[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O' ,'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'Z', 'Y', 'Z'};
		  char abc[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o' ,'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
          char one_two[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
          
          System.out.println("Напиши имейла който е за паролата!");
          String email = scan.nextLine();
          myWriter.write("email - " + email);
          myWriter.write("\n");
          myWriter.write("pass - ");
          
          
        int line = rand.nextInt(1,4);
          
        while (puti != 15) {
          line = rand.nextInt(1,4);
            if (line == 1) {
            	myWriter.write(ABC[rand.nextInt(0, 26)]);
        	   puti++;
            } else if (line == 2) {
            	myWriter.write(abc[rand.nextInt(0, 26)]);
            	puti++;
            } else if (line == 3) {
            	myWriter.write(one_two[rand.nextInt(0, 10)]);
            	puti++;
            }
        }
        System.out.println("Паролата е генерирана, може да я видите в: " + myObj.getAbsolutePath());
        myWriter.close();
		} catch (IOException e) {
			System.out.println("Нещо не е както трябва...");
		}
        scan.close();
	}
}
