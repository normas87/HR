package com.company;

import java.util.ArrayList;
import java.util.List;

public class PracownikAdd {

    static List<Pracownicy> listaPracownikow = new ArrayList<Pracownicy>();

    public static void dodajPracownika(Pracownicy pracownicy) {
        listaPracownikow.add(pracownicy);
        System.out.println("Dodano pracownika");
    }

   static void  wyswietlListePracownikow(Pracownicy pracownicy){
       for(int i=0; i<listaPracownikow.size(); i++)
           System.out.println("Pracownicy: " + listaPracownikow.get(i));

     //  System.out.println(listaPracownikow.get(i).getImie()+" "+listaPracownikow.get(i).getNazwisko());
    }
}
