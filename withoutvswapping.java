package week1.day2;

public class withoutvswapping {
	public static void main(String[] args) {
	int A= 10;
	int B=20;
	System.out.println("Before Swapping 2 Numbers");
	System.out.println("A=" +A);
	System.out.println("B=" +B);
	
	//Swapping two number without using variable
	
	A= A+B;
	B= A-B;
	A= A-B;
	
	System.out.println("After Swapping 2 NUmbers");
	System.out.println("A=" +A);
	System.out.println("B=" +B);
	

	
	}
}
