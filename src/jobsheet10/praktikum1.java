
package jobsheet10;

import java.util.Scanner;


public class praktikum1 {

   
    public static void main(String[] args) {
        String cari;
        boolean found = false;
        String[] minuman = new String[]{"Cappuchino", "Chocooreo", "Chocolatte", "Macca", "Vanila"};
        Scanner y = new Scanner(System.in);
        System.out.println("Minuman apa yang ingin anda pesan?");
        cari = y.next();
        for (String minuman1 : minuman) {
            if(cari == null ? minuman1 == null : cari.equals(minuman1)) {
                found = true;
                break;
            }
        }
        if (found == true) { 
            System.out.println("Minuman tersedia");
        }else {
            System.out.println("Maaf, minuman tidak tersedia");
        }
    }
    
}
