import java.util.Random;
import java.util.Scanner;
public class new_class {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random rand = new Random();
		
		String a[] = {"Край на играта!", "Камък", "Ножица", "Хартия"};	
		System.out.println("Камък[1], Ножица[2], Хартия[3], Изход[0]");
try {	
	    int my_choice = scan.nextInt();
   while (my_choice != 0) {
		String my_string = a[my_choice];

		int random_num = rand.nextInt(1,4);
		String random_answer = a[random_num];
		
		if (random_num == my_choice){
			System.out.println("Равни: " + my_string +"|"+ random_answer);
		} else if (random_num == 1 && my_choice == 2) {
			System.out.println("Бота печели: " + my_string +"|"+ random_answer);
		} else if (random_num == 2 && my_choice == 3) {
			System.out.println("Бота печели: " + my_string +"|"+ random_answer);
		} else if (random_num == 3 && my_choice == 1) {
			System.out.println("Бота печели: " + my_string +"|"+ random_answer);
		} else {
			System.out.println("Ти печелиш: " + my_string +"|"+ random_answer);
		}
		
		System.out.println("Камък[1], Ножица[2], Хартия[3], Изход[0]");
		my_choice = scan.nextInt();
	  }
	} catch (Exception e) {System.out.println("Може да пишете само числа от 1-3"); }
		
	   System.out.println(a[0]);
	   scan.close();
    }
}