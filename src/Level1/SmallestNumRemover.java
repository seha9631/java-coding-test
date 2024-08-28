package Level1;

public class SmallestNumRemover {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
    }
    public int[] solution(int[] arr) {
        int tmp = arr[0], index = 0;
        if (arr.length == 1) return new int[] {-1};
        for (int i = 0;i < arr.length;i++) if (arr[i] < tmp) tmp = arr[i];
        int[] answer = new int[arr.length - 1];
        for (int j : arr) if(j != tmp) answer[index++] = j;
        return answer;
    }
}
