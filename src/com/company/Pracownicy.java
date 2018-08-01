package com.company;

import java.util.ArrayList;
import java.util.List;


public class Pracownicy {

    private String imie;
    private String nazwisko;
    private int uid;


            public String getImie() {
                return imie;
            }
            public void setImie(String imie) {
                this.imie = imie;
            }

            public String getNazwisko() {return nazwisko;}
            public void setNazwisko (String nazwisko) {this.nazwisko = nazwisko;}

            public int getUid() {return uid;}
            public void setUid (int uid) {this.uid = uid;}



         List<Pracownicy>listaPracownikow = new ArrayList<Pracownicy>();

  public void dodajPracownika (Pracownicy listaPracownicza){
      listaPracownikow.add(listaPracownicza);
  }


  public Pracownicy(String imie, String nazwisko, int uid){
      this.imie=getImie();
      this.nazwisko=getNazwisko();
      this.uid=uid;
  }


}