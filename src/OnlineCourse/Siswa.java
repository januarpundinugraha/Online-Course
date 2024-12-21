    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package OnlineCourse;

    /**
     *
     * @author ASUS
     */
    public class Siswa extends User {
    private String kelas; // Atribut tambahan

    public Siswa(int id, String email, String nama, String kelas) {
        super(id, email, nama); // Memanggil konstruktor superclass
        this.kelas = kelas;
    }

    public void lihatKursus() {
        System.out.println(nama + " melihat daftar kursus di kelas " + kelas);
    }

    public void kirimTugas(Tugas tugas) {
        System.out.println(nama + " mengirim tugas: " + tugas.getJudul());
    }
}