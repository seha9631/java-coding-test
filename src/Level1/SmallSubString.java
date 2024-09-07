package Level1;

public class SmallSubString {
    public static void main(String[] args) {
        System.out.println(solution("10203", "15"));
    }
    public static int solution(String t, String p) {
        int answer = 0;
        long pnum = Long.parseLong(p);
        for (int i = 0;i <= t.length() - p.length();i++){
            String subString = t.substring(i, i + p.length());
            long subNum = Long.parseLong(subString);
            if (subNum <= pnum) answer += 1;
        }
        return answer;
    }
}
