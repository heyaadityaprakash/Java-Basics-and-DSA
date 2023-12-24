import java.util.Scanner;

public class agedivide {
    public static void main(String[] args) {
        System.out.println("enter the age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<12){
            System.out.println("you are a child.");

        }
        else if(age>12 && age<18){
            System.out.println("you are a teenager.");

        }
        else{
            System.out.println("you are an adult.");
        }
    }
    
}
