package Level1;

import java.util.Scanner;

public class NumberwithRemainderof1 {
    public static void main(String[] args) {
        int n = 0, x = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
            if(n < 3 || n > 1000000)
                System.out.println("n의 범위를 벗어났습니다.");
        }while(n < 3 || n > 1000000);
        x = solution(n);
        System.out.println("x = " + x);
        scanner.close();
    }
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            answer = i;
            if(n % i == 1)
                break;
        }
        return answer;
    }
}
