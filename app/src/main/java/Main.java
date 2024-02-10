import jp.ac.uryukyu.ie.e205749.*;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Solver solver = new Solver();


        int CPUchoice = solver.getCpuChoice();

        int number = solver.getPlayerChoice(scanner);
        solver.printPlayerChoice(number);

        scanner.close();
        
        solver.judge(number, CPUchoice);
    }
}
