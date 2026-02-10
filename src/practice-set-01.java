import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //System.out.println("enter your name");

        Scanner s= new Scanner(System.in);
        //String name = s.next();

        //System.out.println("hello " + name + " enjoy");

        System.out.println("enter a number");
        boolean num = s.hasNextInt();
        System.out.println(num);
    }
}

// to check use hasnext