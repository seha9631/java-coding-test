package Level1;

public class HarshadNumber {
    public static void main(String[] args) {
        int x = 13;
        boolean answer = false;
        answer = solution(x);
        System.out.println(answer);
    }
    public static boolean solution(int x) {
        int sum = 0, tmp = x;
        boolean answer = true;
        for (int i = 10000;i != 0;i /= 10){
            if (tmp / i != 0){
                sum += tmp / i;
                tmp = tmp % i;
            }
        }
        if (x % sum == 0) return true;
        else return false;
    }
}
