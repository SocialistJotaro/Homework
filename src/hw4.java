import java.util.Scanner;

public class hw4 {

    public static void main(String[] args) {
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        numGame();

    }

    static void numGame() {
        Scanner in = new Scanner(System.in);
        game:
        while (true) {
            System.out.println("Guess the number from 0 to 9.");
            int true_num = (int) (Math.random() * 10);
            for (int i = 3; i > 0; i--) {
                System.out.println(i + " tries remaining.");
                int user_num = in.nextInt();
                if (user_num > true_num) {
                    System.out.println("True number is less.");
                } else if (user_num < true_num) {
                    System.out.println("True number is greater.");
                } else {
                    System.out.println("You guessed!");
                    break;
                }
            }

            System.out.println("Play again?\n1 - yes / 0 - no");
            int play = in.nextInt();
            switch (play) {
                case 1:
                    continue;
                case 0:
                    break game;
            }

        }
    }
}



