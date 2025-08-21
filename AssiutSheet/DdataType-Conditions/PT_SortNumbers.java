import java.util.Scanner;

public class PT_SortNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstNumber = s.nextInt();
        int secondNumber = s.nextInt();
        int thirdNumber = s.nextInt();

        int sortArray[] = { firstNumber, secondNumber, thirdNumber };

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3 - i - 1; k++) {
                if (sortArray[k] > sortArray[k + 1]) {
                    int temp = sortArray[k];
                    sortArray[k] = sortArray[k + 1];
                    sortArray[k + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(sortArray[i]);
        }
        System.out.println("");
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);

        s.close();
    }
}