Для удобства проверки ДЗ добавлю его в файл readme, сами файлы с заданием лежат в папке src 
Самостоятельная работа выполнена в виде проекта, в котором классы выступают первым, вторым и третьим заданием соответственно


Задание 1
Напишите программу, которая проверяет, является ли заданное число четным или нечетным, и выводит соответствующее сообщение.

Решение:
```import java.util.Scanner;

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
```


Задание 2
Напишите программу, которая принимает числовое значение, представляющее день недели (1 - Понедельник, 2 - Вторник и так далее) и выводит название этого дня с использованием switch case.

Решение:
```import java.util.Scanner;

public class secondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш день недели:");
        byte dayOfWeek = scanner.nextByte();
        switch (dayOfWeek){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Ошибка ввода");
        }
        scanner.close();
    }
}
```


Задание 3
Однажды ваш друг написал программу, которая просит пользователя ввести оценку по предмету и затем выводит сообщение о том, сдал ли он экзамен. Он использовал условный оператор if-else для проверки оценки. Ваша задача - улучшить программу с помощью Элвис-оператора

Решение:
```import java.util.Scanner;

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
```





