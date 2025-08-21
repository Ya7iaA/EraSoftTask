import java.util.Scanner;

public class D_AccessArrayElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int checkArray[] = { 1, 2, 3, 4, 5 };

        try {
            System.out.println("The Value : " + checkArray[s.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid index : index from 0 to 4");
        }

        s.close();
    }
}