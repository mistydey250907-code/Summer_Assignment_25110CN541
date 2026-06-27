import java.util.*;
public  class employeeManagement {
     static Scanner sc=new Scanner(System.in);
       static HashMap<Integer,Info>map=new HashMap<>();
   static class Info
    {   String name;
       private long num;
       private String address;
       double sal;
        String pos;
       Info(String name, String pos, long num, String address, double sal) {   
        this.name = name;
        this.pos = pos;
        this.num = num;
        this.address = address;
        this.sal = sal;
        }
        public void setNum(long num) {
        this.num = num;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString() {//during print time it prints address rather than the info
        return "| Name: " + name + " | Position: " + pos + " | Phone: " + num + " | Address: " + address + " | Salary: $" + sal;
    }
    }
        public static void main(String [] args){
         map.put(101,(new Info("Adam Silvenia", "Audit Manager", 9234567890L, "123 Main St",1400000)));
         map.put(104,(new Info("Cam Silvenia","Branch Manager", 9232547890L, "101A Main St",1500000)));
         map.put(102,(new Info("Sierra Karinton", "Chief Executive Officer", 9984562194L, "125M Sub St",1800000)));
         map.put(103,(new Info("Rora Monabell","Sales Officer", 9134167845L, "127 Main St",1200000)));
         System.out.println("Enter your choice");
         while(true){
          System.out.println("Enter 0 to print the current employee list");
          System.out.println("Enter 1 to add information of a new employee");
           System.out.println("Enter 2 to update a current employee information");
           System.out.println("Enter 3 to find the information of an employee");
             System.out.println("Enter 4 to remove the information of an employee");
              System.out.println("Enter 5 to stop");
              int choice=sc.nextInt();
              switch(choice) 
              {
                case 0:
                    {  
                       for(Map.Entry<Integer,Info>e:map.entrySet()){
                          System.out.print(e.getKey()+" ");
                         System.out.print(e.getValue()+" ");
        //toString() method is automatically called whenever Java needs to convert your object into a readable piece of text
                         System.out.println();
                        }
                        break;
                    }
                case 1:{
                    addem();
                    break;
                }
                case 4:{
                    remove();
                    break;
                }
                case 2:{update();
                    break;
                }
                 case 3:{find();
                    break;
                }
                case 5:{
                   return;
                }
                default:
                    {
                        System.out.println("Wrong input");
                        break;
                    }
              }}
}
public static void addem()
{
    System.out.println("Enter the id of the employee");
    int i=sc.nextInt();
    sc.nextLine();
    if (map.containsKey(i)) {
        System.out.println("Employee already exists.");
        return;
    }
    System.out.println("Enter the name of the employee");
    String n=sc.nextLine();
    System.out.println("Enter the position of the employee");
    String p=sc.nextLine();
    System.out.println("Enter the phone no. of the employee");
    long no=sc.nextLong();
    sc.nextLine();
    System.out.println("Enter the address of the employee");
    String a=sc.nextLine();
    System.out.println("Enter the salary of the employee");
    double s=sc.nextDouble();
    sc.nextLine();
    map.put(i,new Info(n,p,no,a,s));
}
 public static void remove()
 {
     System.out.println("Enter the id of the employee");
    int i=sc.nextInt();
    sc.nextLine();
    if (!map.containsKey(i)) {
        System.out.println("Employee ID not found.");
        return;
    }
   map.remove(i);
 }
   public static void update() {
    System.out.println("Enter the id of the employee to update:");
    int id = sc.nextInt();
    sc.nextLine(); 
    if (!map.containsKey(id)) {
        System.out.println("Employee ID not found.");
        return;
    }

    Info emp = map.get(id);//so that only info of employee of given id can be updated

    System.out.println("What do you want to update?");
    System.out.println("1. Name\n2. Position\n3. Phone Number\n4. Address\n5. Salary");
    int updateChoice = sc.nextInt();
    sc.nextLine(); 

    switch(updateChoice) {
        case 1:
            System.out.println("Enter new Name:");
            emp.name = sc.nextLine(); 
            break;
        case 2:
            System.out.println("Enter new Position:");
            emp.pos = sc.nextLine();
            break;
        case 3:
            System.out.println("Enter new Phone Number:");
            long no = sc.nextLong();
            sc.nextLine(); 
            emp.setNum(no);// public void setNum(long num)
            break;
        case 4:
           System.out.println("Enter new Address:");
                String newAddr = sc.nextLine();
                emp.setAddress(newAddr); 
                break;
        case 5:
            System.out.println("Enter new Salary:");
            emp.sal = sc.nextDouble();
            sc.nextLine(); 
            break;
        default:
            System.out.println("Invalid choice.");
            return;
    }
    System.out.println("Employee field updated successfully!");
}
public static void find() {
    System.out.println("Enter the id of the employee to find:");
    int id = sc.nextInt();
    sc.nextLine();

    if (map.containsKey(id)) {
        System.out.println("ID: " + id + " " + map.get(id));
    } else {
        System.out.println("Employee ID not found.");
    }
}
}

