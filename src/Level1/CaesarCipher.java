package Level1;

public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
    }
    public static String solution(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0;i < s.length();i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                char shifted = (char) ((ch - 'A' + n) % 26 + 'A');
                result.append(shifted);
            }
            else if (ch >= 'a' && ch <= 'z') {
                char shifted = (char) ((ch - 'a' + n) % 26 + 'a');
                result.append(shifted);
            }
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
