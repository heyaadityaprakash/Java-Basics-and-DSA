import java.util.Scanner;
public class eveand3 {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            if(num%3==0){
                System.out.println(num);
            }
        }
        
    }
}
