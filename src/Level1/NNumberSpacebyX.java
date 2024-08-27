package Level1;

import java.util.Scanner;

public class NNumberSpacebyX {
    public static void main(String[] args) {
        int n = 0, x = 10000000, count = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        x = scanner.nextInt();
        System.out.print("n = ");
        n = scanner.nextInt();
        long[] answer = solution(x, n);
        System.out.print("answer = [");
        for (long num : answer) {
            if (count == n){
                System.out.print(num);
                break;
            }
            System.out.print(num + ", ");
            count++;
        }
        System.out.println("]");
        scanner.close();
    }
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0;i < n;i++){
            // int의 표현 범위는 -21억~+21억이지만, x*n에서 이 범위를 벗어나므로 x를 long타입으로 명시적으로 변경해줘야 함.
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }
}
