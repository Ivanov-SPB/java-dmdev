package ru.prozektor.lesson5;

/**
 * 1. ??????? ??? ????? - ????, ????? ? ???, ???????? ????????????? ? ???????.
 *     ??????? ???? ?????????? ??? ? ??????? "????.?????.???".
 *     ?????? ??????? ?? ????????? ?????, ? ????? ????????? ???.
 *     ?????????????? ?????? "????.?????.???" ??????? ? ????????? ???????.
 */

import java.util.Scanner;

public class homework1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day;
        int month;
        int year;
        do {
            System.out.print("??????? ???? ?????? ?? 1 ?? 31: ");
            day = in.nextInt();
        }
        while ((day <= 0) || (day > 31));
        do {
            System.out.print("??????? ????? ?? 1 ?? 12: ");
            month = in.nextInt();
        }
        while ((month <= 0) || (month > 12));
        do {
            System.out.print("??????? ??? ?? 1: ");
            year = in.nextInt();
        }
        while (year <= 0);
// ???? ????? 12 -> ???? ???? 31 ?? ??? + 1, ????? = 1, ???? = 1 ????? ???? + 1
// ???? ????? 1, 3, 5, 7, 8, 10 -> ???? ???? 31 ?? ????? + 1, ???? + 1 ????? ???? + 1
// ???? ????? 4, 6, 9, 11 -> ???? ???? 31 ?? ?????? ????? ???? ???? 30 ?? ????? + 1, ???? = 1 ????? ???? + 1
// ???? ????? 2 -> ???? ???? ?????? 29 ?? ?????? ????? ???? ???? ?????? 28 ?? ???? + 1 ????? ???? ??? ?????????? ?? ???? ???? 29 ?? ????? + 1, ???? = 1 ????? ???? + 1
//                                                                                                                 ????? ???? ???? 29 ?? ??????, ????? ????? + 1, ???? = 1

    }

}
