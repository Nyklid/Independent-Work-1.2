import java.util.Scanner;

public class firstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше число:");
        int userNumber = scanner.nextInt();
        if (userNumber % 2  == 0){
            System.out.println("Число является четным");
        }
        else{
            System.out.println("Число является нечетным");
        }
        scanner.close();
    }
}
