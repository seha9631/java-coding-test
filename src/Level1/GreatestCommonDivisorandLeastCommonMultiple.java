package Level1;

public class GreatestCommonDivisorandLeastCommonMultiple {
    public static void main(String[] args) {

    }
    public static int[] solution(int n, int m) {
        int[] answer = {0, 0};
        for (int i = n;i >= 1;i--){
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                break;
            }
        }
        answer[1] = (n * m) / answer[0];
        return answer;
    }
}
