package jobsheet10;

import java.util.Scanner;

public class TugasPraktikum4 {

    public static void main(String[] args) {
        Scanner hd = new Scanner(System.in);
        String cari;
        System.out.print("Masukkan sebuah kata/kalimat: ");
        cari = hd.nextLine();

        int a = 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'a') {
                a++;
            }
        }
        int p = 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'i') {
                p++;
            }
        }
        int u = 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'u') {
                u++;
            }
        }
        int e = 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'e') {
                e++;
            }
        }
        int o = 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'o') {
                o++;
            }
        }
        System.out.println("Jumlah huruf a pada kalimat di atas adalah " + a);
        System.out.println("Jumlah huruf i pada kalimat di atas adalah " + p);
        System.out.println("Jumlah huruf u pada kalimat di atas adalah " + u);
        System.out.println("Jumlah huruf e pada kalimat di atas adalah " + e);
        System.out.println("Jumlah huruf o pada kalimat di atas adalah " + o);
    }
}
