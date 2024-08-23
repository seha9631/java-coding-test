public class SumofMeasure {
    public static void main(String[] args) {
        int A = 0;
        A = solution(12);
        System.out.println(A);
    }
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1;i <= Math.sqrt(n);i++){
            if(n % i == 0) {
                answer += i;
                if (i != n / i)
                    answer += n / i;
            }
        }
        return answer;
    }
}
