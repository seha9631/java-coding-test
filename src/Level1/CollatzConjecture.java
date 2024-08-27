package Level1;

public class CollatzConjecture {
    public static void main(String[] args) {
        long num = 626331, answer = 0;
        answer = solution(num);
        System.out.println(answer);
    }
    public static int solution(long num) {
        int count = 0;
        if (num == 1) return 0;
        while(num != 1) {
            count++;
            if (count == 500) return -1;
            if (num % 2 == 0) num /= 2;
            else num = num * 3 + 1;
        }
        return count;
    }
}
