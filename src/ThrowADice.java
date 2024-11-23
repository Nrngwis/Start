import java.util.Scanner;

public class ThrowADice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100);
        int attempts = 0;
        int bestAttempts = Integer.MAX_VALUE;

        System.out.println("Добро пожаловать в игру Кинуть Кости! Компьютер загадал число от 1 до 100.");

        while (true) {
            System.out.println("Введите ваше предположение: ");

            int userNumber = scanner.nextInt();

            if (userNumber < secretNumber) {
                attempts++;
                System.out.println("Не ожидал от тебя такого. Загаданное число больше, брат.");


            } else if (userNumber > secretNumber) {
                System.out.println("Я сам в шоке, но, загаданное число меньше, брат.");

            } else {
                attempts++;
                System.out.println("Поздравляю! Вы угадали число " + secretNumber + " за " + attempts + " попыток!");

                if (attempts < bestAttempts) {
                }

                System.out.println("Введите команду RESULT, чтобы узнать количество попыток в текущей и лучшей игре,");
                System.out.println("или введите команду END что-бы закончить игру.");
                String command = scanner.next();
                if (command.equalsIgnoreCase("RESULT")) {

                    System.out.println("Количество попыток героя в текущей игре: " + attempts);
                    System.out.println("Количество попыток в лучшей игре: " + bestAttempts);

                    continue;
                } else if (command.equalsIgnoreCase("END")){
                        break;
                }
                continue;
            }
        }
    }
}