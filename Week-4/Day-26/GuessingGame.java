import java.util.*;
import java.io.*;
public class GuessingGame {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int no=rand.nextInt(101);
        System.out.println("Input your guess from 0 to 100");
        
        while(true){
          int n=sc.nextInt();
        if(no==n)
        {
            System.out.println("CONGRATULATIONS!! YOU GUESSED THE CORRECT NO.");
            break;
        }
        else if(n>no)
        {
            System.out.println("GO LOWER");
        }
        else
        {
            System.out.println("GO HIGHER");
        }
    }
}
}