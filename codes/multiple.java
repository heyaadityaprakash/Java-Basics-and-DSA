public class multiple {
    public static void main(String[] args) {
        int i=0;
        
        for(i=1;i<=100;i++){
            if(i%5==0 && i%7==0){
                break;

            }
        }System.out.println(i);
    }
    
}
