package week1.day2;
public class oddnumber{
	public static void main(String[] args) {
		oddnumber obj= new oddnumber(); //method creation
		obj.oddnum(); //call the method
	}
	
		public void oddnum() {
			System.out.println("The Odd numbers are");
		for(int i=0; i <=20; i++) {
		if (i %2 !=0) {
		System.out.println(i);
		}
		}
		
		
	}
}