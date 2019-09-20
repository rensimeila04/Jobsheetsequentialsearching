package jobsheet10;

import java.util.Scanner;

public class TugasPraktikum1 {

    public static void main(String[] args) {
        int n = 0;
        int cari;
        Scanner y = new Scanner(System.in);
        int[] data = new int[]{74, 98, 72, 74, 72, 90, 81, 72};
        System.out.println("Data pada array");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Masukkan nilai yang dicari");
        cari = y.nextInt();

        for (int a = 0; a < data.length; a++) {
            if (cari == data[a]) {
                n++;

            }

        }
        System.out.println("Nilai " + cari + " ditemukan sebanyak " + n + " kali");
        if(n == 0){
            System.out.println("Data tidak ditemukan");
        }

    }
}
