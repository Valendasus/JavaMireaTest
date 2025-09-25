package task1;

import java.util.*;

public class Hangman {
    private static final String[] WORDS = {"инкапсуляция", "джава", "ооп", "наследование", "полиморфизм"};
    private static final int MAX_LIVES = 6;

    public static void main(String[] args) {
        Random random = new Random();
        String word = WORDS[random.nextInt(WORDS.length)];
        Set<Character> guessed = new HashSet<>();
        int lives = MAX_LIVES;

        Scanner scanner = new Scanner(System.in);

        System.out.println("игра Виселица");

        while (lives > 0) {
            printWord(word, guessed);

            if (isWordGuessed(word, guessed)) {
                System.out.println("Вы угадали слово: " + word);
                break;
            }

            System.out.print("Введите букву: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                guessed.add(guess);
                System.out.println("Буква угадана");
            } else {
                lives--;
                System.out.println("Такой буквы нет | Жизней: " + lives);
            }
        }

        if (lives == 0) {
            System.out.println("Вы проиграли. Загаданное слово: " + word);
        }
    }

    private static void printWord(String word, Set<Character> guessed) {
        for (char c : word.toCharArray()) {
            if (guessed.contains(c)) {
                System.out.print(c + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    private static boolean isWordGuessed(String word, Set<Character> guessed) {
        for (char c : word.toCharArray()) {
            if (!guessed.contains(c)) return false;
        }
        return true;
    }
}
