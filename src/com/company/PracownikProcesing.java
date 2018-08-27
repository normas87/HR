package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PracownikProcesing implements Narzedzia {

//    static List<Pracownicy> listaPracownikow = new ArrayList<Pracownicy>();

    {
        //      listaPracownikow.add(new Pracownicy("Wiesiek", "Nowak", UUID.randomUUID()));
        //      listaPracownikow.add(new Pracownicy("Stanisław", "Kowalski", UUID.randomUUID()));
        //     listaPracownikow.add(new Pracownicy("Grażyna", "Malinowska", UUID.randomUUID()));
        //     listaPracownikow.add(new Pracownicy("Bożena", "Nowakowska", UUID.randomUUID()));

    }

    static List<Pracownicy> listaPracownikowProdukcji = new ArrayList<Pracownicy>();
    static List<Pracownicy> listaPracownikowBiura = new ArrayList<Pracownicy>();
    static List<Pracownicy> listaPracownikowSekretariatu = new ArrayList<Pracownicy>();
    static List<Pracownicy> listaPracownikowKsiegowosci = new ArrayList<Pracownicy>();
    static List<Pracownicy> listaZastepcowPrezesa = new ArrayList<Pracownicy>();
    {
        listaZastepcowPrezesa.add(new Pracownicy("Janusz", "Kowalski", UUID.randomUUID()));
     }


    public void dodajPracownikaProdukcji(Pracownicy pracownik) {
        dodajPracownika(pracownik);
        listaPracownikowProdukcji.add(pracownik);
    }

    public void dodajPracownikaBiurowego(Pracownicy biurokrata) {
        dodajPracownika(biurokrata);
        listaPracownikowBiura.add(biurokrata);
    }

    public void dodajPracownikaSekretariatu(Pracownicy sekretarka) {
        dodajPracownika(sekretarka);
        listaPracownikowSekretariatu.add(sekretarka);
    }

    public void dodajPracownikaKsiegowosci(Pracownicy ksiegowa) {
        dodajPracownika(ksiegowa);
        listaPracownikowKsiegowosci.add(ksiegowa);
    }

    public void dodajZastepcePrezesa(Pracownicy zastepcaPrezesa) {
        dodajZastepcePrezesa(zastepcaPrezesa);
        listaZastepcowPrezesa.add(zastepcaPrezesa);
    }


    public void dodajPracownika(Pracownicy pracownik) {
        System.out.println("Podaj imię nowego pracownika: ");
        pracownik.setImie(odczyt.next());

        System.out.println("Podaj jego nazwisko: ");
        pracownik.setNazwisko(odczyt.next());

        System.out.println("Pracownik :" + pracownik.getImie() + " " + pracownik.getNazwisko() + " " + pracownik.getUuid().toString());

        System.out.println("+++ Dodano pracownika +++");
    }

    static void wyswietlListePracownikow(Pracownicy cokolwiek) {
        int sumaPracownikow =
                (1
                        + listaPracownikowProdukcji.size()
                        + listaPracownikowSekretariatu.size()
                        + listaPracownikowBiura.size()
                        + listaPracownikowKsiegowosci.size()
                );


        System.out.println("Zatrudnionych jest: " + sumaPracownikow + " pracowników");
        for (int i = 0; i < listaPracownikowProdukcji.size(); i++)
            System.out.println("Pracownik produkcji: " + listaPracownikowProdukcji.get(i));
        for (int i = 0; i < listaPracownikowBiura.size(); i++)
            System.out.println("Pracownik biura: " + listaPracownikowBiura.get(i));
        for (int i = 0; i < listaPracownikowSekretariatu.size(); i++)
            System.out.println("Pracownik sekretariatu: " + listaPracownikowSekretariatu.get(i));
        for (int i = 0; i < listaPracownikowKsiegowosci.size(); i++)
            System.out.println("Pracownic księgowości: " + listaPracownikowKsiegowosci.get(i));
        System.out.println("Zastępcą prezesa jest: " + listaZastepcowPrezesa.get(0));
    }

    static void usunPracownika() {
        Pracownicy znalezionyDoZwolnienia=null;
        for (Pracownicy x : listaPracownikowProdukcji) {
            System.out.println("Wprowadź imie pracownika do zwolnienia: ");

            String szukanyPracownikDoZwolnienia=odczyt.next();

            if (x.getImie().equals(szukanyPracownikDoZwolnienia)) {
                znalezionyDoZwolnienia = x;
            }
        }
        listaPracownikowProdukcji.remove(znalezionyDoZwolnienia);

    }


//        List<Pracownicy> listyPolaczone = new ArrayList<Pracownicy>();
//        listyPolaczone.addAll(listaPracownikowProdukcji);
//        listyPolaczone.addAll(listaPracownikowBiura);
//        listyPolaczone.addAll(listaPracownikowKsiegowosci);
//        listyPolaczone.addAll(listaPracownikowSekretariatu);
//        listyPolaczone.addAll(listaZastepcowPrezesa);
//
//        for (Pracownicy x : listyPolaczone) {
//            System.out.println("Wprowadź ID pracownika do zwolnienia: ");
//            String szukanyPracownikDoZwolnienia;
//            szukanyPracownikDoZwolnienia = odczyt.next();
////            if (x.getUuid().equals(szukanyPracownikDoZwolnienia)) {
////                listyPolaczone.remove(x);
//
//                if (x.getImie().equals(szukanyPracownikDoZwolnienia)){
//                    listyPolaczone.remove(x);
//                }
}





