import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        if ( 0 < a && a < 10 && 0 < b && b < 10 && b != 0) {
            System.out.println( (double)(a / b) );
        }

        scan.close();
    }
    
}