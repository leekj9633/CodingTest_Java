import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();     // 숫자가 몇 개인지 int형으로 저장하기
        String sNum = scan.next();    // 공백 없이 숫자를 문자로 저장하기
        char [] cNum = sNum.toCharArray();      // sNum의 숫자들을 각각 배열로 나눠서 저장하기, toCharArray() 모름 

        int sum = 0;

        for (int i = 0 ; i < cNum.length; i++){
            sum += cNum[i] - '0';  
        }
        System.out.print(sum);
        
        scan.close();
    }
    
}
