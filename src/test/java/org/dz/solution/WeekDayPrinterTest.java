package org.dz.solution;

import org.junit.Test;


public class WeekDayPrinterTest {

    @Test
    public void print0() {
        WeekDayPrinter printer = new WeekDayPrinter();
        printer.print(0);
    }

    @Test
    public void print1() {
        WeekDayPrinter printer = new WeekDayPrinter();
        printer.print(1);
    }

    @Test
    public void print2() {
        WeekDayPrinter printer = new WeekDayPrinter();
        printer.print(2);
    }

    @Test
    public void print3() {
        WeekDayPrinter printer = new WeekDayPrinter();
        printer.print(3);
    }

    @Test
    public void print4() {
        WeekDayPrinter printer = new WeekDayPrinter();
        printer.print(4);
    }

    @Test
    public void print5() {
        WeekDayPrinter printer = new WeekDayPrinter();
        printer.print(5);
    }

    @Test
    public void print6() {
        WeekDayPrinter printer = new WeekDayPrinter();
        printer.print(6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void print7() {
        WeekDayPrinter printer = new WeekDayPrinter();
        printer.print(7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printMinus1() {
        WeekDayPrinter printer = new WeekDayPrinter();
        printer.print(-1);
    }
}