package Level1;

public class IntSquareRootDetermin {
    public static void main(String[] args) {
        long n = 3, answer = 0;
        answer = solution(n);
        System.out.println(answer);
    }
    public static long solution(long n) {
        long answer = 0;
        for (answer = 2;answer <= n;answer++){
            if(answer * answer == n) {
                answer = (answer + 1) * (answer + 1);
                return answer;
            }
        }
        return -1;
    }
}
