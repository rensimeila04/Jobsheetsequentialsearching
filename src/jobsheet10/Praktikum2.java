package jobsheet10;

import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        int cari;
        boolean found = false;
        int[] data = new int[]{8, 90, 56, 90, 87, 76, 42};
        Scanner y = new Scanner(System.in);
        System.out.println("Massukkan data yang igin anda cari");
        cari = y.nextInt();
        for (int i = 0; i<data.length; i++) {
                if(cari == data[i]) {
                found = true;
                    System.out.println("Data di temukan pada indeks ke-" + i);
            }
        }
        if (found != true) {
            System.out.println("Data Tidak Ditemukan");
        }
    }
}
