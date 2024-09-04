package Level1;

public class ShortageCalculator {
    public static void main(String[] args) {
        int price = 3, money = 20, count = 4;
        long answer = 0;
        answer = solution(price, money, count);
        System.out.println(answer);
    }
    public static long solution(int price, int money, int count) {
        long answer = -1 * money;
        for (int i = 1;i <= count;i++) answer += (long) i * price;
        if (answer > 0) return answer;
        else return 0;
    }
}
