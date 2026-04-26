public class StudentLinkedList {

    static class Node {
        String nim, nama;
        int nilai;
        Node next;

        Node(String nim, String nama, int nilai) {
            this.nim = nim;
            this.nama = nama;
            this.nilai = nilai;
        }
    }

    static Node head = null;

    public static void tambahMahasiswa(String nim, String nama, int nilai) {
        Node baru = new Node(nim, nama, nilai);

        if (head == null) {
            head = baru;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = baru;
        }
    }

    public static void updateNilai(String nim, int nilaiBaru) {
        Node temp = head;
        while (temp != null) {
            if (temp.nim.equals(nim)) {
                temp.nilai = nilaiBaru;
                System.out.println("\nMengupdate nilai mahasiswa (" + temp.nama + " -> " + nilaiBaru + ")");
                return;
            }
            temp = temp.next;
        }
    }

    public static void tampilkan() {
        System.out.println("\nDaftar Mahasiswa:");
        Node temp = head;
        int i = 1;

        while (temp != null) {
            System.out.println(i + ". NIM: " + temp.nim +
                    ", Nama: " + temp.nama +
                    ", Nilai: " + temp.nilai);
            temp = temp.next;
            i++;
        }
    }
}