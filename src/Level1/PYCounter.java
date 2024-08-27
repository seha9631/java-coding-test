package Level1;

public class PYCounter {
    public static void main(String[] args) {
        boolean answer = true;
        String s = "pPoyY";
        answer = solution(s);
        System.out.println(s);
        System.out.println(answer);
    }
    public static boolean solution(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
                count++;
            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                count--;
        }
        if (count == 0)
            return true;
        else
            return false;
    }
}
