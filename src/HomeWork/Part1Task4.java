package HomeWork;

import java.util.Scanner;

public class Part1Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();


        System.out.println(count / 3600 + " " + count % 3600 / 60);
    }
}
