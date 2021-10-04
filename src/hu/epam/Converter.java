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
        int residue = num;


        while (num !=0){
            if(residue >= 1000 && residue <= 3999){

                do{
                    residue = num - 1000;
                }while( num > 1000);
                System.out.println(residue);
                thousands = m[num / 1000];


            }else if (residue >= 100 && residue <= 999){
                for (int j = 0; j < 100;j++){
                    num = num - (100 * j);
                    residue = num;
                }
                hundreds = c[(num % 1000) / 100];

            }else if ( residue >= 10 && residue <= 99){
                for (int j = 0; j < 10;j++){
                    num = num - (100 * j);
                    residue = num;
                }
                tens = x[(num % 100) / 10];
            }else if ( residue >= 0 && residue <=9){
                for (int j = 0; j < 1000;j++){
                    num = num - (100 * j);
                    residue = num;
                }
                ones = i[num % 10];

            }else{
                System.out.println("gáz van");
            }
        }

        String ans = thousands + hundreds + tens + ones;

        return ans;
    }
}
