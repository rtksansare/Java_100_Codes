import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter Any Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num==0){
		    System.out.println("0 is neither Positive nor Negative");
		}
		else{
		if(num%2==0){
		    System.out.println(num + " is a Positive Number.");
		}
		else{
		    System.out.println(num + " is a Negative Number.");
		}
		}
	}
}
