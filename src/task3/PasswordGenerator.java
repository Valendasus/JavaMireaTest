package task3;

import java.util.*;

public class PasswordGenerator {
    private static final String UP = "ЙЦУКЕНГШЩЗХЪЁФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
    private static final String LOW = "йцукенгшщзхъёфывапролджэячсмитьбю";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()_-+=<>?";
    private static final String ALL = UP + LOW + DIGITS + SPECIAL;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину пароля (от 8 до 12): ");
        int length = scanner.nextInt();
        scanner.close();

        if (length < 8 || length > 12) {
            System.out.println("Длина должна быть от 8 до 12 символов");
            return;
        }

        String password = generatePassword(length);
        System.out.println("Пароль: " + password);
    }

    private static String generatePassword(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        sb.append(UP.charAt(random.nextInt(UP.length())));
        sb.append(LOW.charAt(random.nextInt(LOW.length())));
        sb.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        sb.append(SPECIAL.charAt(random.nextInt(SPECIAL.length())));

        for (int i = 4; i < length; i++) {
            sb.append(ALL.charAt(random.nextInt(ALL.length())));
        }

        return sb.toString();
    }
}

