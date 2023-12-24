import java.util.Scanner;

public class sum_of_n {
    public static void main(String[] args) {
        System.out.println("enter the last number");
        int i=1;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();



        // by using while loop
        while(i<=n){
            
            sum=sum+i;
            i++;
        }   
        System.out.println(sum);   
    }


    //by usning for loop
    
    for(i=0;i<=n;i++){
        sum=sum+i;

    }
}
