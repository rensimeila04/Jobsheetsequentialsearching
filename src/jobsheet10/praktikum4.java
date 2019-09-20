package jobsheet10;

import java.util.Scanner;

public class praktikum4 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        String cari;
        System.out.print("Masukkan sebuah kata/kalimat: ");
        cari = y.nextLine();
        
        int a = 0;
        for (int i = 0; i<cari.length(); i++) {
            if (cari.charAt(i) == 'a'){
                a++;
            }
        }
        System.out.println("Jumlah huruf a pada kalimat di atas adalah " + a);
    }
}
