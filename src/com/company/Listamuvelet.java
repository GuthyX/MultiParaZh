package com.company;

import java.util.ArrayList;

public class Listamuvelet {

    static public ArrayList<Darabok> Szamol(ArrayList<String> szavak) {
           ArrayList<Darabok> darabok = new ArrayList<>();
           int counter = 1;
            for (int i =0 ; i< szavak.size()-1;i++)
            {
                   for (int y=i+1;y<szavak.size();y++)
                    {
                      if (szavak.get(i).equals(szavak.get(y)))
                      {
                          counter++;
                      }

                    }

                darabok.add(new Darabok(szavak.get(i),counter ));
                   counter = 1;
            }

            return darabok;
    }
}
