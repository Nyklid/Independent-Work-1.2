import java.util.Scanner;

public class thirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вашу оценку:");
        byte grade = scanner.nextByte();
        String gradeResult = (grade >= 60) ? "Ура! Вы сдали экзамен" : "Увы, вы не сдали экзамен :(";
        System.out.println(gradeResult);
        scanner.close();
    }
}
