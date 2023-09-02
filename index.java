import java.util.Scanner;

class index{

    public static void main(String[] args) {
        System.out.println("enter your name and age: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();

        System.out.println("hello "+name+" your are "+age+" years old.");


    }
}