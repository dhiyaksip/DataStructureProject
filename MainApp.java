import java.util.LinkedList;
import java.util.Queue;

public class MainApp {

    public static void main(String[] args) {

        // ================= QUEUE =================
        Queue<String> antrean = new LinkedList<>();

        CustomerServiceQueue.tambahPelanggan(antrean, "Andi");
        CustomerServiceQueue.tambahPelanggan(antrean, "Budi");
        CustomerServiceQueue.tambahPelanggan(antrean, "Siti");

        CustomerServiceQueue.tampilkanAntrean(antrean);

        CustomerServiceQueue.layaniPelanggan(antrean);

        CustomerServiceQueue.tampilkanAntrean(antrean);

        // ================= STACK =================
        TextEditorStack.tambahTeks("Selamat");
        TextEditorStack.tambahTeks(" datang");

        TextEditorStack.tampilkan();
        TextEditorStack.undo();
        TextEditorStack.redo();

        // ================= LINKED LIST =================
        StudentLinkedList.tambahMahasiswa("12345", "Andi", 85);
        StudentLinkedList.tambahMahasiswa("67890", "Budi", 90);

        StudentLinkedList.tampilkan();

        StudentLinkedList.updateNilai("67890", 95);

        System.out.println("\nDaftar Mahasiswa setelah update:");
        StudentLinkedList.tampilkan();
    }
}