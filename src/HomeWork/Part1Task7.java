package HomeWork;

import java.util.Scanner;

public class Part1Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n % 10);
        System.out.print(n / 10);
    }
}
