package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

            ArrayList<String> lista = Beolvas.Beolvas("src/com/company/szavak.txt");
            ArrayList<Darabok> darabok = Listamuvelet.Szamol(lista);
            int i = 0;
              while (i<darabok.size())
              {
                  darabok.get(i).Kiir();
                  i++;
              }
    }
}
