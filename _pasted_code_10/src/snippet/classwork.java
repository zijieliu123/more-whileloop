package snippet;

import java.util.Scanner;
public class classwork {

Scanner in = new Scanner(System.in);
	
public void setnum(int num) {
	
	num = 6;
	int input = in.nextInt();
	while (input != num) {
		System.out.println("can you please enter another number");
		input = in.nextInt();
	}
	
	System.out.println("you got the number!");
	
	
	
}

public void negpos() {
	
	int input = in.nextInt();
	int count = -input - 1;
	while (count < input) {
		count++;
		System.out.println(count);
		
	}
	
	
}

public void hi() {
	
	int input = in.nextInt();
	int count = 1;
	
	while (count <= input) {
		count += 1;
		System.out.println("hi");
		
	}
	
	
}

public void factorial() {
	
	int num = 100;
	int count = num;
	int product = 1;
	
	while(count >= 1) {
		product = product * count;
		
		count--;
	}
	
	System.out.println(product);
	
}

public void game() {
	System.out.println("do you want to keep playing?");
	String answer = in.next();
	if (answer.equals("no")) {
		System.out.println("gameover");
		
	}
	while(answer.equals("yes")) {
		System.out.println("Do you want to keep playing?");
	}

	
	
}

public void primeorno() {
	 
	int num1 = in.nextInt();
	int count = 2;
	
	while (count <= (num1 - 1)) {
		if (num1 % count == 0) {
			System.out.println("not prime");
			break;
		}
		else {
			System.out.println("prime!");
			break;
		}
	
     }
}

	public static void main(String args[]) {
		classwork tester = new classwork();
	
		tester. setnum(6);
		tester. negpos();
		tester. hi();
		tester. factorial();
		tester. game();
		tester. primeorno();
	

}
}