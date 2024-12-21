/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineCourse;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Pengajar
        Pengajar pengajar = new Pengajar(1, "pengajar@example.com", "Budi", "Matematika");
        
        // Membuat objek Kursus
        Kursus kursus = new Kursus(1, "Aljabar", "Kursus tentang aljabar dasar.");
        pengajar.buatKursus(kursus);

        // Membuat Materi dan Tugas
        Materi materi1 = new Materi(1, "Pengenalan Aljabar", "Materi tentang variabel dan persamaan.");
        Tugas tugas1 = new Tugas(1, "Tugas 1", "Selesaikan 10 soal tentang aljabar dasar.");

        // Menambahkan materi dan tugas ke kursus
        kursus.tambahMateri(materi1);
        kursus.tambahTugas(tugas1);

        // Membuat objek Siswa
        Siswa siswa = new Siswa(2, "siswa@example.com", "Andi", "Kelas 10");
        siswa.lihatKursus();
        siswa.kirimTugas(tugas1);
        
        // Pengajar memberi nilai tugas
        pengajar.beriNilai(tugas1, 90);

        // Menampilkan status tugas
        tugas1.lihatStatus();
    }
}
