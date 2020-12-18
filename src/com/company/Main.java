package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

            ArrayList<String> lista = Beolvas.Beolvas("src/com/company/szavak.txt");

            if (Listamuvelet.VanEDupla(lista))
            {
                System.out.println("Duplikácio van benne");
            }
            else
            {
                System.out.println("Nincs Duplikácio");
            }
    }
}
