public class StringtoInt {
    public static void main(String[] args) {
        String s = "1235";
        System.out.println(s);

    }
    public static int solution(String s) {
        int answer = 0;
        boolean check = false;
        char c = 'a';
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '-')
                check = true;
            if (c >= '0' && c <= '9')
                answer = answer * 10 + (c - '0');
        }
        if (check)
            answer = -1 * answer;
        return answer;
    }
}
