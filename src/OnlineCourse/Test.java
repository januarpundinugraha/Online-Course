/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineCourse;

/**
 *
 * @author ASUS
 */
public class Test {
    private int id;
    private String judul;
    private String deskripsi;
    private String status;

    public Test(int id, String judul, String deskripsi) {
        this.id = id;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.status = "Belum dikumpulkan";
    }

    public String getJudul() {
        return judul;
    }

    public void uploadTest() {
        this.status = "Dikumpulkan";
        System.out.println("Test " + judul + " telah di-upload.");
    }

    public void lihatStatus() {
        System.out.println("Status Test " + judul + ": " + status);
    }
}