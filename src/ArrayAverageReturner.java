public class ArrayAverageReturner {
    public static void main(String[] args) {
        double a;
        int[] arr = {5, 5};
        a = solution(arr);
        System.out.println(a);
    }
    public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for (int i : arr) sum += i;
        answer = sum / arr.length;
        return answer;
    }
}
