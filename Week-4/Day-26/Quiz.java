import java.util.*;
public class Quiz {
    public static void main(String args[])
    {
        Quiz q=new Quiz();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome!!!");
        System.out.println("You will have to answer 4 questions:");int c=0;
        HashMap<String,String>map=new HashMap<>();
        map.put("Which is the smallest prime no.?","2");
        map.put("Which no. is neither prime nor composite?","1");
        map.put("Which is a perfect no.?","6");
        map.put("Which is the smallest composite no.?","4");
        for(Map.Entry<String,String>e:map.entrySet())
            {
                System.out.println(e.getKey());
                System.out.println("Yours options are :2,4,1,6,8");
                System.out.println("Input your answer");
                if(e.getValue().equals(sc.next()))
                {
                    c++;
                    System.out.println("You are RIGHT");
                }
                else
                {
                     System.out.println("You are WRONG");
                }
            } 
            System.out.println("You have got "+c+" answers right.");
    }
}
