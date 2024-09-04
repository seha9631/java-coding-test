package Level1;

public class SuBakRepeater {
    public static void main(String[] args) {
        int n = 4;
        String answer = "";
        answer = solution(n);
        System.out.println(answer);
    }
    public static String solution(int n) {
        String answer = "";
        for (int i = 1;i <= n;i++){
            if (i % 2 == 0) answer += "박";
            else answer += "수";
        }
        return answer;
    }

}
