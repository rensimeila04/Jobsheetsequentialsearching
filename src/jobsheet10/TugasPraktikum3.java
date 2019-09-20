package jobsheet10;

public class TugasPraktikum3 {

    public static void main(String[] args) {
        int[] data = new int[]{92, 98, 76, 72, 84, 101, 39};
        System.out.print("Nilai pada array : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

        System.out.println("\n");
        System.out.print("Nilai yang merupakan kelipatan 3 : ");
        System.out.println("\n");
        for (int a = 0; a < data.length; a++) {
            if (data[a] % 3 == 0) {
                System.out.println(data[a]+" ");
            }
        }System.out.println("\t");

    }
}
