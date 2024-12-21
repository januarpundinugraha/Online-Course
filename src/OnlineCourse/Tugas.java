/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineCourse;

/**
 *
 * @author ASUS
 */
public class Tugas {
    private int id;
    private String judul;
    private String deskripsi;
    private String status;

    public Tugas(int id, String judul, String deskripsi) {
        this.id = id;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.status = "Belum dikumpulkan";
    }

    public String getJudul() {
        return judul;
    }

    public void uploadTugas() {
        this.status = "Dikumpulkan";
        System.out.println("Tugas " + judul + " telah di-upload.");
    }

    public void lihatStatus() {
        System.out.println("Status tugas " + judul + ": " + status);
    }
}