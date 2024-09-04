package Level1;

public class NumberofDivisorsandAddition {
    public static void main(String[] args) {
        int left = 13, right = 17, answer = 0;
        answer = solution(left, right);
        System.out.println(answer);
    }
    public static int solution(int left, int right) {
        int answer = 0;
        for (int i = left;i <= right;i++){
            if (i % Math.sqrt(i) == 0) answer -= i;
            else answer += i;
        }
        return answer;
    }
}
