import java.util.Scanner;
public class Main 
{
    public static void Main(String []args)
    {
        Scanner s= new Scanner(System.in);
        String name =s.nextLine();
        
        System.out.println("enter the age:");
        int age = s.nextInt();
        
         System.out.println("my name is:"+name);
         System.out.println("my age is:"+age);
    }
}
