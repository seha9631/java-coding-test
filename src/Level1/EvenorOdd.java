package Level1;

public class EvenorOdd {
    public static void main(String[] args) {
        int num = 24;
        String answer = "";
        answer = solution(num);
        System.out.println(answer);
    }

    public static String solution(int num) {
        if (num % 2 == 0) return "Even";
        else return  "Odd";
    }
}
