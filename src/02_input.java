// to read data from keyboard use scanner class


// Scanner s = new Scanner (System.in);
//read from keyboard

//int a s.nextInt();
//method to read from keyboard
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        System.out.println("Enter score"); 

        Scanner s = new Scanner(System.in);
        float phy = s.nextFloat();
        float chem = s.nextFloat();
        float bio = s.nextFloat();
        float math = s.nextFloat();
        float eng = s.nextFloat();
        
        float sum = (phy + chem + bio + eng + math)/5;
        

        System.out.println(sum);


    }
}