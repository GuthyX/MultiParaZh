package com.company;

public class Darabok {
    String word;
    int number;
    public Darabok(String szo,int szam)
    {
        word = szo;
        number = szam;
    }
    public void Kiir()
    {
        System.out.println(word+" "+number);
    }

}
