import java.util.Scanner;

public class PX_TwoIntervals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstIntervalStart = s.nextInt();
        int firstIntervalEnd = s.nextInt();
        int secondIntervalStart = s.nextInt();
        int secondIntervalEnd = s.nextInt();

        int start = Math.max(firstIntervalStart, secondIntervalStart);
        int end = Math.min(firstIntervalEnd, secondIntervalEnd);

        if (start > end) {
            System.out.println(-1);
        } else {
            System.out.println(start + " " + end);
        }

        s.close();
    }
}