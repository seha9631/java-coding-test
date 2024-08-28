package Level1;

public class KimFinder {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        String answer = "";
        answer = solution(seoul);
        System.out.println(answer);

    }
    public static String solution(String[] seoul) {
        for (int i = 0;i < seoul.length;i++){
            if (seoul[i].equals("Kim")) return "김서방은 "+ i + "에 있다";
        }
        return "None";
    }
}
