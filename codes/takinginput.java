import java.util.Scanner;

class takinginput{
    public static void main(String[] args) {
        
        
        System.out.println("enter the number");
        Scanner number=new Scanner(System.in);
        System.out.println("enter your name");
        

        int num_1=number.nextInt();
        String name=number.next();
        System.out.println("you entered "+num_1);
        System.out.println("your name is "+name);


    }
}