package Level1;

public class ClosestIdenticalLetter {
    public static void main(String[] args) {

    }
    public static int[] solution(String s) {
        int[] result = new int[s.length()];
        int[][] last = new int[26][1];
        for (int i = 0;i < 26;i++) last[i][0] = -1;
        for (int i = 0;i < s.length();i++) {
            char c = s.charAt(i);
            int cIndex = c - 'a';
            if (last[cIndex][0] != -1) result[i] = i - last[cIndex][0];
            else result[i] = -1;
            last[cIndex][0] = i;
        }
        return result;
    }
}
