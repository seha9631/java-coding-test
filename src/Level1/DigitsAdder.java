package Level1;

public class DigitsAdder {
    public static void main(String[] args) {
        int n = 987, answer = 0;
        answer = solution(n);
        System.out.println(answer);
    }
    public static int solution(int n) {
        int answer = 0, tmp = 0;
        while(n != 0){
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
