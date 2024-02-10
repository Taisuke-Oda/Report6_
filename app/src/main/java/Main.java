import jp.ac.uryukyu.ie.e205749.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        int CPUchoice;
        int number;
        Scanner scanner = new Scanner(System.in);
        Solver solver = new Solver();

        do {
            CPUchoice = solver.getCPUChoice();
            number = solver.getPlayerChoice(scanner);
            solver.printPlayerChoice(number);
            solver.printCPUChoice(CPUchoice);
            if (CPUchoice == number) {
                System.out.println("あいこだよ，もう一回！");
            }
        } while (CPUchoice == number);

        scanner.close();

        solver.judge(number, CPUchoice);
    }
}
