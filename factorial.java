public class factorial {
    public  static void fact(){
        int i=4;
        int fact=1;
        while(i>=1){
            fact=fact*i;
            i--;
            }
    System.out.println("Factorial = "+fact);

    }
    public static void main(String[] args) {
        factorial.fact();

    }

    
}
