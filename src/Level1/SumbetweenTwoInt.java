package Level1;

public class SumbetweenTwoInt {
    public static void main(String[] args) {
        int a = 3, b = 3;
        long answer = 0;
        answer = solution(a, b);
        System.out.println(answer);
    }
    public static long solution(int a, int b) {
        if (a <= b) return (long) (b - a + 1) * (a + b) / 2;
        else return (long) (a - b + 1) * (b + a) / 2;
    }
}
