//precedence of operators
// * , / l to r
// + , - l to r
// ++ , -- r to l

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        
        // float a=7/4*9/2;
        // System.out.println(a);
        // takes int number as int and gives ans as int then convert to float
        // float a=7/4.0f * 9/2.0f;
        // now correct answer

        char grade = 'a';
        char hide = (char)(grade + 8);
        System.out.println(hide);
        
        char show = (char)(hide - 8);
        System.out.println(show);

        int a = 7*49/7 + 35/7;
        System.out.println(a);


    }
}