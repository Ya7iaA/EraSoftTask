import java.util.Scanner;

public class PA_SayHelloWithJava {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String inputName = s.next();

        System.out.println("Hello, " + inputName);

        s.close();
    }
}