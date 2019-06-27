package excercise5;
import java.util.Scanner;
interface Interface1{
	int fact(int num);
}
class Class1{
	public static int factorial(int n) {
		int f=1;
		for(int i=n;i>1;i--) {
			f=f*i;
		}
		return f;
	}
}

public class Class5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter a number");
		int n=s.nextInt();
		Interface1 i=Class1::factorial;
		int f=i.fact(n);
		System.out.println("Factorial of "+n+"is "+f);

	}

}
