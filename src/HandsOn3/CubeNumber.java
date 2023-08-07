package HandsOn3;

import java.util.Scanner;

public class CubeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.println("Cubes of the numbers from 1 to " + num + ":");
        for (int i = 1; i <= num; i++) {
            int cube = i * i * i;
            System.out.println("Cube of " + i + ": " + cube);
        }

        scanner.close();
    }
}