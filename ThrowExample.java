import java.util.Scanner;

public class ThrowExample {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("enter your age:");
            int age= sc.nextInt();

            if(age<0){
                throw new IllegalArgumentException("age cannot be negative.");
            }
            System.out.println("your age is:"+age);
        }
    catch(IllegalArgumentException e){
        System.out.println("exception caught:"+e.getMessage());
    }
    }

}
