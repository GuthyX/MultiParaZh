package com.company;

import java.util.ArrayList;

public class Listamuvelet {
    static boolean VanEDupla(ArrayList<String> szavak) {

        for (int i=0; i<szavak.size()-1; i++)
        {
            for (int y=i+1; y <szavak.size(); y++)
            {
                if (szavak.get(i).equals(szavak.get(y)))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
