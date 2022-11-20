import java.util.Scanner;

public class Programm_ucha_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Напиши колко оценки имаш по предмета.");
		int n = scan.nextInt();
		
		int a[] = new int [n];
		
		System.out.println("Напиши ги.");
		for(int i = 0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		
		double sum = 0;
		
		for (int i = 0; i<n; i++) {
			sum = sum + a[i];
		}
		sum = sum/n;
		
		System.out.printf("Средноритметичната оценка ти е: " + String.format("%.2f", sum));
		
		scan.close();
	}

}
