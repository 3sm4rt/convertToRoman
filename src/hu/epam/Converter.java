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


        String thousands="";
        String hundreds="";
        String tens ="";
        String ones="" ;
        int residue = 0;

        while (num !=0){
            if(num >= 1000 && num <= 3999){
                thousands = m[num / 1000];
                residue = num;
                
            }else if (residue >= 100 && residue <= 999){
                hundreds = c[(num % 1000) / 100];
                residue = num;
            }else if ( residue >= 10 && residue <= 99){
                tens = x[(num % 100) / 10];
            }else if ( residue >= 0 && residue <=9){
                ones = i[num % 10];
                num = residue;
            }else{
                System.out.println("gáz van");
            }
        }

        String ans = thousands + hundreds + tens + ones;

        return ans;
    }
}
