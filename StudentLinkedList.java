public class StudentLinkedList {

    static class Node {
        String nim, nama;
        int nilai;
        Node prev, next;

        Node(String nim, String nama, int nilai) {
            this.nim = nim;
            this.nama = nama;
            this.nilai = nilai;
        }
    }

    static Node head = null, tail = null;

    public static void tambahMahasiswa(String nim, String nama, int nilai) {
        Node baru = new Node(nim, nama, nilai);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
        System.out.println("Tambah: " + nama);
    }

    public static void hapusMahasiswa(String nim) {
        Node cur = head;
        while (cur != null) {
            if (cur.nim.equals(nim)) {
                if (cur.prev != null) cur.prev.next = cur.next;
                else head = cur.next;

                if (cur.next != null) cur.next.prev = cur.prev;
                else tail = cur.prev;

                System.out.println("Hapus: " + cur.nama);
                return;
            }
            cur = cur.next;
        }
    }

    public static void updateNilai(String nim, int nilaiBaru) {
        Node cur = head;
        while (cur != null) {
            if (cur.nim.equals(nim)) {
                cur.nilai = nilaiBaru;
                System.out.println("Update nilai " + cur.nama + " -> " + nilaiBaru);
                return;
            }
            cur = cur.next;
        }
    }

    public static void cetakDaftar() {
        System.out.println("\nDaftar Mahasiswa:");
        Node cur = head;
        int i = 1;
        while (cur != null) {
            System.out.println(i++ + ". " + cur.nama + " (" + cur.nim + ") = " + cur.nilai);
            cur = cur.next;
        }
    }
}