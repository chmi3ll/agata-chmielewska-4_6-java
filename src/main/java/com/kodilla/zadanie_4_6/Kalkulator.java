package com.kodilla.zadanie_4_6;

public class Kalkulator {

    public void dodawanie(double pierwsza, double druga) {
        double wynik = pierwsza + druga;
        System.out.println(wynik);
    }

    public void odejmowanie(double pierwsza, double druga) {
        double wynik = pierwsza - druga;
        System.out.println(wynik);
    }


    public static void main(String args[]) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.dodawanie(5, 6);
    }
}