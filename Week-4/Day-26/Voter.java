import java.util.*;
public class Voter {
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
       System.out.println("Enter your age");
       while(true){
       int age=sc.nextInt();
       if(age>=0&&age<=130){
       if(age<18)
       {
        System.out.println("You are not eligible to vote. Wait for "+(18-age)+" years");
       }
       else
       {
        System.out.println("You are eligible to vote.");
       }
       break;
    }
    else{
        System.out.println("Enter your correct age.");
    }
}sc.close();
}
}
