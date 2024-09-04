package Level1;

public class InnerProductCalculater {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        int answer = 0;
        answer = solution(a, b);
        System.out.println(answer);
    }
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0;i != a.length;i++) answer += a[i] * b[i];
        return answer;
    }
}
