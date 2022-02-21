import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int range1 = scanner.nextInt();
        int range2 = scanner.nextInt();

        String word = name.substring(range1, range2 + 1);
        System.out.println(word);

    }
}