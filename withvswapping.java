package week1.day2;

public class WithVSwapping {

    int a = 10;
    int b = 20;

    // method
    void swapping() {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {

        WithVSwapping obj = new WithVSwapping(); // create object

        System.out.println("Before Swapping Using Variable");
        System.out.println("A = " + obj.a);
        System.out.println("B = " + obj.b);

        obj.swapping(); // call method

        System.out.println("After Swapping Using Variable");
        System.out.println("A = " + obj.a);
        System.out.println("B = " + obj.b);
    }
}
