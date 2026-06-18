package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LatihanMandiri1 {
    public static void main(String[] args) throws IOException {
 // try-with-resources: stream otomatis ditutup setelah blok selesai
 try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
 penulis.println("Senin");
 penulis.println("Selasa");
 penulis.println("Rabu");
 penulis.println("Kamis");
 penulis.println("Sabtu");
 System.out.println("Data berhasil ditulis ke hari.txt");
 } catch (IOException e) {
 System.out.println("Gagal menulis: " + e.getMessage());
 }
 try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))){
 String baris;
 int nomor = 1;
 while ((baris = pembaca.readLine()) != null) {
 System.out.println(nomor + ". " + baris);
 nomor++;
 }
 } catch (IOException e) {
 System.out.println("Gagal membaca: " + e.getMessage());
 }
 }

}
