package java_practice;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Fortune {

	public static void main(String[] args) {
		String fortune[] = {"大凶","凶","末吉","小吉","中吉","吉","大吉"};
		String fort_type = String.join(",", fortune);
		Random r = new Random();

		System.out.println("おみくじの種類は" + fort_type + "です");

		try {
		    System.out.println("実行回数を入力してください");
		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    for(int i = 0; i < num; i++) {
		    	String result = fortune[r.nextInt(fortune.length)];
		    	System.out.println("結果は" + result + "です");
		    }
		}catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました");
		}
	}

}
