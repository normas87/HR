package com.company;

import java.util.Scanner;

public abstract class Menu {

  public static void wyswietlMenuGlowne(){

       System.out.println("Menu: ");
       System.out.println("1 = Dodaj nowego pracownika");
       System.out.println("2 = Usun pracownika");
       System.out.println("3 = Wyszukaj pracownika");
       System.out.println("4 = Wyświetl liste wszystkich pracownikow");
       System.out.println("5 = Wyświetl pracowników tylko danego typu");
       System.out.println("0 = Exit");
   }

   public static void wyswietlPodMenu1 (){
       System.out.println("1 Pracownik Produkcji");
       System.out.println("2 Pracownik Biurowy");
       System.out.println("3 Pracownik sekretariatu");
       System.out.println("4 Pracownik księgowości");
       System.out.println("5 Zastępca Prezesa");
   }

    public static void wyswietlPodMenu3 (){
        System.out.println("1 znajdź pracownika produkcji");
        System.out.println("2 znajdź pracownika biura");
        System.out.println("3 znajdź pracownika sekretariatu");
        System.out.println("4 znajdź pracownika księgowości");
        System.out.println("0 wróć do poprzedniego menu");
    }
}
