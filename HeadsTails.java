import java.util.Random;
import java.util.Scanner;

public class HeadsTails {

	public static void main(String[] args) {
		int count = 0;
		int num = 0;
		int j;
		

		System.out.println("Who are you?");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println("Hello, "+str+"!");
		
		System.out.println("Tossing a coin...");
		String[] cc = { "Heads", "Tails" };
		Random r = new Random();
		for(int i = 0; i < 3; i++) {
			String c = cc[r.nextInt(2)];
			j = i+1;
			System.out.println("Round "+ j +": "+ c);
			if(c == "Heads") {
				count++;
			}
		}
		num = 3-count;
		System.out.println("Heads: "+count+", Tails: "+num);

		if(count > 1) {
			System.out.println(str+" won!");
		}else {
			System.out.println(str+" lost!");
		}
		
	}

}
