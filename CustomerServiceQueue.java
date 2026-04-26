import java.util.Queue;

public class CustomerServiceQueue {

    public static void tambahPelanggan(Queue<String> antrean, String nama) {
        antrean.offer(nama);
    }

    public static void layaniPelanggan(Queue<String> antrean) {
        if (antrean.isEmpty()) {
            System.out.println("Antrean kosong.");
            return;
        }
        System.out.println("Melayani pelanggan: " + antrean.poll());
    }

    public static void tampilkanAntrean(Queue<String> antrean) {
        System.out.println("\nDaftar Antrean:");
        if (antrean.isEmpty()) {
            System.out.println("(Kosong)");
            return;
        }
        int i = 1;
        for (String nama : antrean) {
            System.out.println(i++ + ". " + nama);
        }
    }
}