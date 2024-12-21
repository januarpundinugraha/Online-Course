/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineCourse;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Kursus {
    private int id;
    private String judul;
    private String deskripsi;
    private ArrayList<Materi> daftarMateri;
    private ArrayList<Tugas> daftarTugas;

    public Kursus(int id, String judul, String deskripsi) {
        this.id = id;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.daftarMateri = new ArrayList<>();
        this.daftarTugas = new ArrayList<>();
    }

    public String getJudul() {
        return judul;
    }

    public void tambahMateri(Materi materi) {
        daftarMateri.add(materi);
        System.out.println("Materi " + materi + " ditambahkan ke kursus " + judul);
    }

    public void tambahTugas(Tugas tugas) {
        daftarTugas.add(tugas);
        System.out.println("Tugas " + tugas.getJudul() + " ditambahkan ke kursus " + judul);
    }
}