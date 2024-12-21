/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineCourse;

/**
 *
 * @author ASUS
 */
public class Pengajar extends User {
    private String bidang; // Hanya atribut tambahan

    public Pengajar(int id, String email, String nama, String bidang) {
        super(id, email, nama); // Memanggil konstruktor superclass
        this.bidang = bidang;
    }

    public void buatKursus(Kursus kursus) {
        System.out.println(nama + " membuat kursus: " + kursus.getJudul());
    }

    public void beriNilai(Tugas tugas, int nilai) {
        System.out.println(nama + " memberi nilai " + nilai + " untuk tugas: " + tugas.getJudul());
    }
}