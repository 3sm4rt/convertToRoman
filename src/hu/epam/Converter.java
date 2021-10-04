package hu.epam;

public class Converter {

    static String convertToRoman(int num) {
        //Felvesszük tömbökbe a lehetséges variációkat
        String m[] = {"", "M", "MM", "MMM"};
        String c[] = {"", "C", "CC", "CCC", "CD",
                "D", "DC", "DCC", "DCCC", "CM"};
        String x[] = {"", "X", "XX", "XXX", "XL",
                "L", "LX", "LXX", "LXXX", "XC"};
        String i[] = {"", "I", "II", "III", "IV",
                "V", "VI", "VII", "VIII", "IX"};
        // Változókat hozunk létre amikket folyamatosan növelünk a ciklusokba
        int t = 0;
        int h = 0;
        int ten = 0;
        int o = 0;
        // Kód addig fut míg a num el nem éri a 0-t
        if ( num <= 3999 && num >= 0){

        while (num != 0) {
            do {
                num = num - 1000;  // a num értékét 1000-el csökkentjük míg a hátultesztő ciklus feltétele nem teljesül
                t++; // minden lefutásnál növeljük a t értékét 1-el
            } while (num >= 1000);

            do {
                num = num - 100;
                h++;
            } while (num >= 100);

            do{
                num = num-10;
                ten++;
            }while ( num >= 10);

            do{
                num = num-1;
                o++;
            }while( num >= 1);

        }
        }else{
            System.out.println(" Kérlek 0 és 3999 közti értéket adj meg.");
        }



        String thousands = m[t];; // átadjuk a változók értékét ,hogy a tömb tudja melyik elemet szeretnénk megkapni
        String hundreds = c[h];
        String tens = x[ten];
        String ones = i[o];

        String ans = thousands + hundreds + tens + ones; // Összefűzzök a stringeket

        return ans; // majd visszatérünk az értékével
    }
}
