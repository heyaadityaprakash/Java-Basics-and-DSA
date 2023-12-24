import java.util.Scanner;
public class n_number {
    public static void main(String[] args) {

        System.out.println("enter the last number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=0;

        while(i<=num){
            System.out.println(i);
            i++;
        }


    }
    
}
