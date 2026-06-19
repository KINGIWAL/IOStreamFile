package tugas;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Gudang {
    private ArrayList<Barang> daftar = new ArrayList<>();
    private String namaFile;
    public Gudang(String namaFile) {
 this.namaFile = namaFile;
 }
 // Menambah satu kontak ke koleksi
 public void tambahBarang(Barang barang) {
 daftar.add(barang);
 }
 // Menampilkan seluruh koleksi beserta nomor urut
 public void tampilkanSemua() {
 System.out.println("== Daftar Barang ==");
 for (int i = 0; i < daftar.size(); i++) {
 Barang B = daftar.get(i);
 System.out.println((i + 1) + ". " + B.info());
 }
 }
 
 public void simpanKeBerkas() {
 try (PrintWriter penulis = new PrintWriter(new FileWriter(namaFile))) {
 for (Barang b : daftar) {
 penulis.println(b.keBaris());
 }
 System.out.println("Barang disimpan ke " + namaFile);
 } catch (IOException e) {
 System.out.println("Gagal menyimpan: " + e.getMessage());
 }
 }
public void muatDariBarang() {
    daftar.clear();
    try (BufferedReader pembaca = new BufferedReader(new FileReader(namaFile))) {
        String baris;
        while ((baris = pembaca.readLine()) != null) {
            String[] bagian = baris.split(";");
            if (bagian.length == 3) {
                 String nama = bagian[0];
                double harga = Double.parseDouble(bagian[1]); // ubah String ke double
                int stok = Integer.parseInt(bagian[2]);
                daftar.add(new Barang(nama, harga, stok));
            }
        }
        System.out.println("Barang dimuat dari " + namaFile);
    } catch (IOException e) {
        System.out.println("Gagal memuat: " + e.getMessage());
    }
}

 public int jumlahBarang() {
 return daftar.size();
 }
 
 public void cariBarang(String nama){
             boolean ditemukan = false;
        for (Barang b : daftar) {
            if (b.getNama().equalsIgnoreCase(nama)) {
                System.out.println("Barang ditemukan:");
                System.out.println("Nama  : " + b.getNama());
                System.out.println("Harga : " + b.getHarga());
                System.out.println("Stok: " + b.getStok());
                ditemukan = true;
                break; // berhenti setelah ketemu
            }
        }
        if (!ditemukan) {
            System.out.println("Barang dengan nama '" + nama + "' tidak ditemukan.");
        }
 }
    public double totalNilai() {
        double total = 0;
        for (Barang b : daftar) {
            total += b.getHarga() * b.getStok();
        }
        return total;
    }
}
