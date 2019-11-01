package JavaCore_5.CoinToss;

import java.util.Random;
import java.util.Scanner;

public class Coin {

    public static void main(String[] args) {

        String[] flip = {"Орел", "Решка"};

        System.out.print("Введіть кількість підкидувань: ");

        Scanner scanData = new Scanner(System.in);
        int count = scanData.nextInt();

        Random random = new Random();

        int side = 0;

        for (int i = 0; i < count; i++) {
            side = random.nextInt(flip.length);
            System.out.println(flip[side]);
        }

        scanData.close();
    }

}
