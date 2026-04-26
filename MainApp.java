import java.util.LinkedList;
import java.util.Queue;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("===== SISTEM TERINTEGRASI =====");

        // ================= QUEUE =================
        Queue<String> antrean = new LinkedList<>();

        long startQueue = System.nanoTime();

        CustomerServiceQueue.tambahPelanggan(antrean, "Andi");
        CustomerServiceQueue.tambahPelanggan(antrean, "Budi");
        CustomerServiceQueue.tambahPelanggan(antrean, "Siti");
        CustomerServiceQueue.layaniPelanggan(antrean);

        long endQueue = System.nanoTime();
        long waktuQueue = endQueue - startQueue;

        CustomerServiceQueue.tampilkanAntrean(antrean);

        // ================= STACK =================
        long startStack = System.nanoTime();

        TextEditorStack.tambahTeks("Hello ");
        TextEditorStack.tambahTeks("World");
        TextEditorStack.undo();
        TextEditorStack.redo();

        long endStack = System.nanoTime();
        long waktuStack = endStack - startStack;

        TextEditorStack.tampilkan();

        // ================= LINKED LIST =================
        StudentLinkedList.tambahMahasiswa("001", "Andi", 80);
        StudentLinkedList.tambahMahasiswa("002", "Budi", 85);

        long startLL = System.nanoTime();

        StudentLinkedList.updateNilai("001", 90);
        StudentLinkedList.hapusMahasiswa("002");

        long endLL = System.nanoTime();
        long waktuLL = endLL - startLL;

        StudentLinkedList.cetakDaftar();

        // ================= ANALISIS =================
        System.out.println("\n===== HASIL PERFORMA =====");
        System.out.println("Queue  : " + waktuQueue + " ns");
        System.out.println("Stack  : " + waktuStack + " ns");
        System.out.println("Linked : " + waktuLL + " ns");

        System.out.println("\nAnalisis:");
        System.out.println("- Queue cepat untuk antrean (FIFO)");
        System.out.println("- Stack efisien untuk undo/redo (LIFO)");
        System.out.println("- Linked List fleksibel tapi traversal lebih lama");
    }
}