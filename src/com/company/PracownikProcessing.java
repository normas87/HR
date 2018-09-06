package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class PracownikProcessing extends Narzedzia {

    static List<Pracownicy> listaPracownikowProdukcji = new ArrayList<Pracownicy>();

    {
        listaPracownikowProdukcji.add(new Pracownicy("Wiesiek", "Nowak", UUID.randomUUID(), Stanowisko.PRACOWNIK_PRODUKCJI));
        listaPracownikowProdukcji.add(new Pracownicy("Stanisław", "Kowalski", UUID.randomUUID(), Stanowisko.PRACOWNIK_PRODUKCJI));
        listaPracownikowProdukcji.add(new Pracownicy("Grażyna", "Malinowska", UUID.randomUUID(), Stanowisko.PRACOWNIK_PRODUKCJI));
        listaPracownikowProdukcji.add(new Pracownicy("Bożena", "Nowakowska", UUID.randomUUID(), Stanowisko.PRACOWNIK_PRODUKCJI));
    }

    static List<Pracownicy> listaPracownikowBiura = new ArrayList<Pracownicy>();
    static List<Pracownicy> listaPracownikowSekretariatu = new ArrayList<Pracownicy>();
    static List<Pracownicy> listaPracownikowKsiegowosci = new ArrayList<Pracownicy>();
    static List<Pracownicy> listaZastepcowPrezesa = new ArrayList<Pracownicy>();

    {
        listaZastepcowPrezesa.add(new Pracownicy("Janusz", "Kowalski", UUID.randomUUID(), Stanowisko.ZASTEPCA_PREZESA));
    }

    static List<Pracownicy> listyPolaczone = new ArrayList<>();

    {
        listyPolaczone.addAll(listaPracownikowProdukcji);
        listyPolaczone.addAll(listaPracownikowBiura);
        listyPolaczone.addAll(listaPracownikowSekretariatu);
        listyPolaczone.addAll(listaPracownikowKsiegowosci);
    }

    public void dodajPracownika(Pracownicy pracownik) {
        System.out.println("Podaj imię nowego pracownika: ");
        pracownik.setImie(odczyt.next());

        System.out.println("Podaj jego nazwisko: ");
        pracownik.setNazwisko(odczyt.next());



    }

    public void dodajPracownikaProdukcji(Pracownicy pracownik) {
        dodajPracownika(pracownik);
        for (Pracownicy x : PracownikProcessing.listyPolaczone)

            if (pracownik.getImie().equals(x.getImie()) && pracownik.getNazwisko().equals(x.getNazwisko())) {
                System.out.println("Taki pracownik już istnieje, nie dodano nowego pracownika");
                break;
            } else listaPracownikowProdukcji.add(pracownik);
        System.out.println("Pracownik :" + pracownik.getImie() + " " + pracownik.getNazwisko() + " " + pracownik.getUuid().toString());
        System.out.println("+++ Dodano pracownika +++");
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
        Pracownicy znalezionyPracownikDoZwolnienia = null;
        System.out.println("Wprowadź id pracownika do zwolnienia: ");
        Scanner odczyt = new Scanner(System.in);
        String szukanyPracownikDoZwolnienia = odczyt.next();
        for (Pracownicy x : listaPracownikowProdukcji) {
            if (x.getUuid().equals(UUID.fromString(szukanyPracownikDoZwolnienia))) {
                znalezionyPracownikDoZwolnienia = x;
                System.out.printf("Usunieto Pracownika: " + x);
                break;
            }
        }
        listaPracownikowProdukcji.remove(znalezionyPracownikDoZwolnienia);
    }
}







