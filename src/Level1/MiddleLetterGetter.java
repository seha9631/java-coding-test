package Level1;

public class MiddleLetterGetter {
    public static void main(String[] args) {
        String s = "qwer", answer = "";
        answer = solution(s);
        System.out.println(answer);
    }
    public static String solution(String s) {
        String answer = "";
        int len = s.length();
        if (len % 2 == 0) answer += s.charAt(len / 2 - 1);
        answer += s.charAt(len / 2);
        return answer;
    }
}
