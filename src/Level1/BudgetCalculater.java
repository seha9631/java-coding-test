package Level1;

import java.util.Arrays;

public class BudgetCalculater {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(solution(d, budget));
    }
    public static int solution(int[] d, int budget) {
        int i;
        d = Arrays.stream(d).sorted().toArray();
        for (i = 0;i < d.length;i++){
            if (budget - d[i] < 0) break;
            budget -= d[i];
        }
        return i;
    }
}
