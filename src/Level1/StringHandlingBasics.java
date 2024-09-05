package Level1;

public class StringHandlingBasics {
    public static void main(String[] args) {
        System.out.println(solution("a1234"));
    }
    public static boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        for (int i = 0;i < s.length();i++){
            if (s.charAt(i) >= 65) return false;
        }
        return true;
    }
}
