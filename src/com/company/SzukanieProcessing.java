package com.company;

import java.util.Scanner;
import java.util.UUID;

public class SzukanieProcessing extends PracownikProcessing {
    static void znajdzPracownikaPoID() {
        Pracownicy znalezionyPracownik = null;
        Scanner odczyt = new Scanner(System.in);
        String szukanyCiagZnakow = odczyt.nextLine();
        for (Pracownicy z : listyPolaczone) {
            if (z.getUuid().equals(UUID.fromString(szukanyCiagZnakow))) {
                znalezionyPracownik = z;
                break;
            }

        }
        System.out.println("+++ Znaleziony pracownik to: " + znalezionyPracownik + " +++");
    }


    static void znajdzPracownikaPoImieniu() {
        Pracownicy znalezionyPracownik = null;
        Scanner odczyt = new Scanner(System.in);
        String szukanyCiagZnakow = odczyt.nextLine();
        for (Pracownicy z : listyPolaczone) {
            if (z.getImie().equals(szukanyCiagZnakow)) {
                znalezionyPracownik = z;
                break;
            }

        }
        System.out.println("+++ Znaleziony pracownik to: " + znalezionyPracownik + " +++");
    }

    static void znajdzPracownikaPoNazwisku() {
        Pracownicy znalezionyPracownik = null;
        Scanner odczyt = new Scanner(System.in);
        String szukanyCiagZnakow = odczyt.nextLine();
        for (Pracownicy z : listyPolaczone) {
            if (z.getNazwisko().equals(szukanyCiagZnakow)) {
                znalezionyPracownik = z;
                break;
            }
        }
        System.out.println("=== Znaleziony pracownik to: " + znalezionyPracownik + " ===");
    }


    //   static void znajdzPracownikaProdukcji() {
    //       Pracownicy znalezionyPracownikProdukcji = null;
//        System.out.println("Pracownik produkcji ");
//        System.out.println("Wpisz ID pracownika do wyświetlenia:");
//        Narzedzia narzedzia = new Narzedzia();
 //   Scanner odczyt = new Scanner(System.in);
 //   String szukanyCiagZnakow = odczyt.nextLine();
//        for (Pracownicy x : listaPracownikowProdukcji) {
//            String pracownikJakoCiagZnakow = x.getImie() + x.getNazwisko() + x.getUuid();
//            if (pracownikJakoCiagZnakow.equals(szukanyCiagZnakow)) {
//                znalezionyPracownikProdukcji = x;
//                break;
//            }
//            System.out.println("+++ Znaleziony pracownik to: " + x + " +++");
//
//        }
    //       for (Pracownicy x : listaPracownikowProdukcji) {
    //          if (x.getUuid().equals(UUID.fromString(szukanyCiagZnakow))) {
    //              znalezionyPracownikProdukcji = x;
    ///             break;
    //          }
    //         System.out.println("Nie znaleziono pasującego rekordu ");
    //     }
    //     System.out.println("+++ Znaleziony pracownik to: " + znalezionyPracownikProdukcji + " +++");
}



