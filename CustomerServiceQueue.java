import java.util.Queue;

public class CustomerServiceQueue {

    // Tambah pelanggan
    public static void tambahPelanggan(Queue<String> antrean, String nama) {
        antrean.offer(nama);
    }

    // Layani pelanggan
    public static void layaniPelanggan(Queue<String> antrean) {
        if (!antrean.isEmpty()) {
            System.out.println("\nMelayani pelanggan: " + antrean.poll());
        } else {
            System.out.println("\nAntrean kosong");
        }
    }

    // Tampilkan antrean
    public static void tampilkanAntrean(Queue<String> antrean) {
        System.out.println("\nPelanggan dalam antrean:");
        if (antrean.isEmpty()) {
            System.out.println("(Antrean kosong)");
            return;
        }

        int i = 1;
        for (String nama : antrean) {
            System.out.println(i + ". " + nama);
            i++;
        }
    }
}