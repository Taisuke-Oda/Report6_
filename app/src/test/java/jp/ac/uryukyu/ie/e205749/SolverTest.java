package jp.ac.uryukyu.ie.e205749;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolverTest {

    @Test
    void testGetCPUChoice() {
        Solver solver = new Solver();
        int choice = solver.getCPUChoice();
        assertEquals(true, choice >= 0 && choice <= 2);
    }

    @Test
    void testPrintCPUChoice() {
        Solver solver = new Solver();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        solver.printCPUChoice(0);
        assertEquals("CPUはグーを出した!\n", outContent.toString());
    }

    @Test
    void testGetPlayerChoice() {
        Solver solver = new Solver();
        Scanner scanner = new Scanner(new ByteArrayInputStream("1\n".getBytes()));
        int choice = solver.getPlayerChoice(scanner);
        assertEquals(1, choice);
    }

    @Test
    void testPrintPlayerChoice() {
        Solver solver = new Solver();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        solver.printPlayerChoice(2);
        assertEquals("あなたはパーを出した！\n", outContent.toString());
    }

    @Test
    void testJudge() {
        Solver solver = new Solver();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        solver.judge(1, 0);
        assertEquals("あなたの勝ち！\n", outContent.toString());
    }
}

