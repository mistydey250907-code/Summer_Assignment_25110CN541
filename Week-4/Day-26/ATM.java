import java.util.*;
public class ATM {
    class Account{
         int pin;
         double balance;
        Account (int pin,double balance)
        {
            this.pin=pin;
            this.balance=balance;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       ATM acc=new ATM();
        System.out.println("Welcome");
        HashMap<String , Account>map=new HashMap<>();
        map.put("Adam Silvenia",acc.new Account(3254,12450741.2));
        map.put("Cam Silvenia",acc.new Account(1402,100000.3));
        map.put("Sierra Karinton",acc.new Account(2540,847256.75));
        map.put("Rora Monabell",acc.new Account(1540,2586947.5));
        map.put("Adam Franks",acc.new Account(8140,4752041.5));
        System.out.println("Enter your name");
        String name=sc.nextLine();

        if(!map.containsKey(name))
        {
            System.out.println("User not found");
            return;
        }
        else{Account userPin=map.get(name);int c=1;
            while(c!=3){
            System.out.println("Enter your pin");
            int pin=sc.nextInt();
            if(!(userPin.pin==pin))
            {c++;
                System.out.println("Wrong pin");
                if(c<=3)
                System.out.println("Try again");
            else{
                System.out.println("Wrong pin(3 times)");
                return;
            }}
            else
            {
                break;}
            }
        System.out.println("Enter your choice");
        while(true){
         System.out.println("Enter 1 to check your current balance");
          System.out.println("Enter 2 to withdraw ");
           System.out.println("Enter 3 to deposit");
            System.out.println("Enter 4 to exit");
            int s=sc.nextInt();Account user=map.get(name);
            switch(s){
                case 1:{
                    peek(user.balance);
                    break;
                }
                case 2:{ System.out.println("Enter the amount you want to withdraw");
                double rem=sc.nextDouble();
                double d= withdrawn(user.balance,rem);
                map.put(name,acc.new Account(userPin.pin,d));
                    break;
                }
                case 3:{
                    System.out.println("Enter the amount you want to deposist");
                double rem=sc.nextDouble();
                    double d= deposit(user.balance,rem);
                    map.put(name,acc.new Account(userPin.pin,d));
                    break;
                }case 4:{
                    return;
                }
                default:{
                       System.out.println("Wrong input");
                       break;
                }
            }
        }
    }
    }
    public static double withdrawn(double principal,double rem)
    {
        if(principal<rem){
            System.out.println("Not enough balance");
            rem=0;//since return principal-rem;
        }
        if(principal>=rem)
         System.out.println("Amount after withdrawal "+(principal-rem));
        return (principal-rem);
    }
    public static double deposit(double principal,double rem)
    {
         System.out.println("Amount after deposition "+(principal+rem));
        return principal+rem;
    }
    public static void peek(double principal)
    {
         System.out.println("Current balance "+(principal));
    }
}
