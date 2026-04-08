import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        System.out.println((A + B) % C + "\n" + (( A % C ) + ( B % C )) % C + "\n" + ( A * B ) % C + "\n" + (( A % C ) * ( B % C )) % C);

        scan.close();
    }
    
}