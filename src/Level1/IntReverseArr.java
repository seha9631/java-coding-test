package Level1;

public class IntReverseArr {
    public static void main(String[] args) {
        long n = 12345;
        int[] answer = {};
        answer = solution(n);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
    public static int[] solution(long n) {
        int length = Long.toString(n).length();
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}
