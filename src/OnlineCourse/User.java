/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineCourse;

/**
 *
 * @author ASUS
 */
public class User {
    protected int id;
    protected String email;
    protected String nama;

    public User(int id, String email, String nama) {
        this.id = id;
        this.email = email;
        this.nama = nama;
    }

    public void login() {
        System.out.println(nama + " telah login.");
    }

    public void logout() {
        System.out.println(nama + " telah logout.");
    }
}
