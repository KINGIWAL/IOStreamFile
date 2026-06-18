package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LatihanMandiri2 {
    public static void main(String[] args) {

 try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true)))
{
 penulis.println("Jum'at");
 penulis.println("Minggu");
 System.out.println("Dua hari baru ditambahkan tanpa menghapus data lama.");
 } catch (IOException e) {
 System.out.println("Gagal menambah data: " + e.getMessage());
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


