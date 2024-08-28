package Level1;

public class PhoneNumberHider {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        String answer = solution(phone_number);
        System.out.println(answer);
    }
    public static String solution(String phone_number) {
        String answer = "";
        for (int i = 0;i < phone_number.length() - 4;i++) answer += "*";
        for (int j = phone_number.length() - 4;j < phone_number.length();j++) answer += phone_number.charAt(j);
        return answer;
    }
}
