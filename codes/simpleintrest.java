import java.util.Scanner;
class simpleintrest {
       public static void main(String[] args) {
        
        System.out.println("enter the principle amount");
        Scanner sc=new Scanner(System.in);
        int principle=sc.nextInt();

        System.out.println("enter the rate");
        int rate=sc.nextInt();

        System.out.println("enter the time period");
        int time=sc.nextInt();

        int interest=((principle*rate*time)/100);
        System.out.println("the simple interest is "+interest); 



        
    }
    
}
