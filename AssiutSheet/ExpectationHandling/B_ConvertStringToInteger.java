import java.util.Scanner;

class B_ConvertStringToInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String inputString = s.next();

        try {
            int strNumber = Integer.parseInt(inputString);
            System.out.println(strNumber);
        } catch (NumberFormatException exception) {
            System.out.println("Your input not an integer");
        }

        s.close();
    }
}