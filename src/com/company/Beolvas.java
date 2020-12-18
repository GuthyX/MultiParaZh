package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Beolvas {
    static  public ArrayList<String> Beolvas(String path) {
        File f = new File(path);
         ArrayList<String> szavak= new ArrayList<>() ;
        try {
            Scanner szkenner = new Scanner(f);

            while(szkenner.hasNextLine()){
                String sor = szkenner.nextLine();
                szavak.add(sor);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Hiba a beolvasásnal");
        }


        return szavak;


    }
}
