import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to check even and odd");

        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("the number "+number+" is even");

        }
        else{
            System.out.println("the number "+number+" is odd");
        }
        
        //this can be made shorter by using ternary operator.

        String answer;
        answer=(number%2==0)?"even":"odd";
        System.out.println(answer);



    }
    
}
