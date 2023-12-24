import java.util.Scanner;

class threeor5{
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        if(n%3==0 || n%5==0){
            System.out.println("the number "+n+"is divisible by both 3 and 5");
        }
        else{
            System.out.println("not divisble by both");
        }
    }
}