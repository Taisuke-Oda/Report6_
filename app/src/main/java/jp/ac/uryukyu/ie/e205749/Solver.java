package jp.ac.uryukyu.ie.e205749;

import java.util.Random;
import java.util.Scanner;

/** このクラスはCUIじゃんけんゲームを実現する． */

public class Solver {
    private Random random;

    /* Solverクラスのコンストラクタ */
    public Solver() {
        this.random = new Random();
    }

    /** 
     * CPUが手を選択する． 
     * @return CPUの手を表す整数(0,1,2)
     */
    public int getCPUChoice() {
        int CPUchoice = this.random.nextInt(3);
        //System.out.println("CPUの選んだ値:" + CPUchoice);
        return CPUchoice;
    }

    /**
     * CPUが選んだ手を出力する． (グー:0 チョキ:1 パー:2)
     * @param CPUchoice getCPUChoiceで選択された整数(0,1,2)
     */
    public void printCPUChoice(int CPUchoice) {
        if (CPUchoice == 0) {
            System.out.println("CPUはグーを出した!");
        }
        if (CPUchoice == 1) {
            System.out.println("CPUはチョキを出した!");
        }
        if (CPUchoice == 2) {
            System.out.println("CPUはパーを出した!");
        }
    }

    /**
     * プレイヤーに自らの手を選択させる．
     * @param scanner 入力を受け付けるScannerオブジェクト
     * @return 入力された整数 (0,1,2)
     */
    public int getPlayerChoice(Scanner scanner) {
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
                scanner.next(); // 無効な入力を捨てる
            }
        }
        return Pchoice;
    }

    /**
     * プレイヤーの選択した手を出力する． 
     * @param Pchoice プレイやーが選択した整数 (0,1,2)
     */
    public void printPlayerChoice(int Pchoice) {
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

    /**
     * 勝敗判定を行う．
     * @param Pchoice プレイヤーが選択した整数 (0,1,2)
     * @param CPUchoice CPUが選択した整数 (0,1,2)
     */
    public void judge(int Pchoice, int CPUchoice) {
        int twoORone = ( Pchoice - CPUchoice + 3 ) % 3;
        if ( Pchoice == CPUchoice ) {
            System.out.println("引き分けだよ");
        }
        if ( twoORone == 2 ) {
            System.out.println("あなたの勝ち！");
        }
        if ( twoORone == 1 ) {
            System.out.println("あなたの負け！");
        }
    }
}