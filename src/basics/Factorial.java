package basics;

public class Factorial {
	public static void main(String[] args) {
		int a = 4;
		System.out.println("Factorial of " + a + " is : " + findfact(a));
	}
	public static int findfact(int x) {
		if(x==1 || x==0) {
			return 1;
		}
		return x*findfact(x-1);
	}
}
