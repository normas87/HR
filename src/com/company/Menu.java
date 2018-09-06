package com.company;

import java.util.Scanner;

public abstract class Menu {

    public static void wyswietlMenuGlowne() {

        System.out.println("Menu: ");
        System.out.println("1 = Dodaj nowego pracownika");
        System.out.println("2 = Usun pracownika");
        System.out.println("3 = Wyszukaj pracownika");
        System.out.println("4 = Wyświetl liste wszystkich pracownikow");
        System.out.println("5 = Wyświetl pracowników tylko danego typu");
        System.out.println("0 = Exit");
    }

    public static void wyswietlMenuDodawaniaNowegoPracownika() {
        System.out.println("1 = Pracownik produkcji");
        System.out.println("2 = Pracownik biurowy");
        System.out.println("3 = Pracownik sekretariatu");
        System.out.println("4 = Pracownik księgowości");
        System.out.println("5 = Zastępca Prezesa");
        System.out.println("0 = powrót");
    }


    public static void wyswietlMenuSzukajPracownika() {
        System.out.println("1 = szukaj po ID");
        System.out.println("2 = szukaj po imieniu");
        System.out.println("3 = szukaj po nazwisku");
        System.out.println("0 = powrót");

    }

    public static void wyswietlMenuPracownikówDanegoTypu() {
        System.out.println("1 = wyświetl pracowników produkcji");
        System.out.println("2 = wyświetl pracowników biura");
        System.out.println("3 = wyświetl pracowników sekretariatu");
        System.out.println("4 = wyświetl pracowników księgowości");
        System.out.println("0 = powrót");
    }
}
