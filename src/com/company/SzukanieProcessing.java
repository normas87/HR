package com.company;

import java.util.Scanner;

public class SzukanieProcessing extends PracownikProcessing {

    static void znajdzPracownikaProdukcji() {
        System.out.println("Pracownik produkcji ");
        System.out.println("Wpisz imie, nazwisko lub ID pracownika do wyświetlenia:");

        String znalezionyPracownikProdukcji = null;
        for (Pracownicy x : listaPracownikowProdukcji) {
            Narzedzia narzedzia = new Narzedzia();
            String szukanyCiagZnakow = narzedzia.odczyt.nextLine();
            Scanner odczyt = new Scanner(System.in);

            String pracownikCiagZnakow = x.getImie() +" "+ x.getNazwisko() +" " + x.getUuid().toString();

            if (pracownikCiagZnakow.contains(szukanyCiagZnakow))

                znalezionyPracownikProdukcji = pracownikCiagZnakow;
        }
        System.out.println("+_+_+_+_+Znaleziony pracownik to: +_+_+_+_+" + znalezionyPracownikProdukcji);
    }
}

