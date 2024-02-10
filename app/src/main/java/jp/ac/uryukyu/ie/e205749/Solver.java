package jp.ac.uryukyu.ie.e205749;

//import java.util.Random;
import java.util.Scanner;

public class Solver {
    //private Random random;

    /* 
    public int getCpuChoice() {
        int CPUchoice = random.nextInt(3);
        System.out.println(CPUchoice);
        return CPUchoice;
    }
    */

    public static int getPlayerChoice(Scanner scanner) {
        System.out.println("グー:0 チョキ:1 パー:2");
        int Pchoice;
        while (true) {
            System.out.print("0, 1, 2のいずれかを入力してください: ");
            if (scanner.hasNextInt()) {
                Pchoice = scanner.nextInt();
                if (Pchoice >= 0 && Pchoice <= 2) {
                    break;
                } else {
                    System.out.println("その値は無効です．");
                }
            } else {
                System.out.println("その値は無効です．整数を入力してください．");
                scanner.next(); // 不正な入力を捨てる
            }
        }
        return Pchoice;
    }

    public static void printPlayerChoice(int Pchoice) {
        if (Pchoice == 0) {
            System.out.println("あなたはグーを出した！");
        }
        if (Pchoice == 1) {
            System.out.println("あなたはチョキを出した！");
        }
        if (Pchoice == 2) {
            System.out.println("あなたはパーを出した！");
        }
    }
}

