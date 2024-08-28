package Level1;

public class DivisibleArrayofNumbers {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        int[] answer = {};
        answer = solution(arr, divisor);
    }
    public static int[] solution(int[] arr, int divisor) {
        int count = 0, index = 0, tmp = 0;
        for (int i : arr) if (i % divisor == 0) count++;
        if (count == 0) return new int[] {-1};
        int[] answer = new int[count];
        for (int num : arr) if (num % divisor == 0) answer[index++] = num;
        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = 0; j < answer.length - 1 - i; j++) {
                if (answer[j] > answer[j + 1]) {
                    tmp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = tmp;
                }
            }
        }
        return answer;
    }
}
