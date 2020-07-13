package fizzbuzz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
		System.out.println("FizzBuzzゲームを開始します");
		try {
			System.out.println("実行回数を入力してください");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			for(int i = 1; i <= num; i++) {
				if(i % 15 == 0) {
					System.out.println("FizzBuzz");
				}else if(i % 5 == 0){
					System.out.println("Buzz");
				}else if(i % 3 == 0) {
					System.out.println("Fizz");
				}else {
					System.out.println(i);
				}
			}
		}catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました");
		}
	}

}
