/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineCourse;

/**
 *
 * @author ASUS
 */
public class Materi {
    private int id;
    private String judul;
    private String konten;

    public Materi(int id, String judul, String konten) {
        this.id = id;
        this.judul = judul;
        this.konten = konten;
    }

    public void lihatMateri() {
        System.out.println("Materi: " + judul);
        System.out.println("Konten: " + konten);
    }
}