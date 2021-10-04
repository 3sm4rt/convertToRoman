package hu.epam;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Add meg a fordítani kívánt számot: ");
            int szam = in.nextInt();
            System.out.println(Converter.convertToRoman(szam));
        }catch (Exception e){
            System.out.println("A szám hibás" + e);
        }
        in.close();
    }
}
