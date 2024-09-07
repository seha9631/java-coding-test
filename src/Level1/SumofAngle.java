package Level1;
import java.util.Scanner;
public class SumofAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int sum_angle = angle1 + angle2;
        for(int i = 0;sum_angle > 360;i++) sum_angle %= 360;
        System.out.println(sum_angle);
    }
}
