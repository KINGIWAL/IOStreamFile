package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LatihanMandiri3 {
    public static void main(String[] args) {
        String namaFile = "hari.txt";
        int jumlahBaris = 0;

        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaFile))) {
            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }
            System.out.println("Jumlah baris dalam " + namaFile + " = " + jumlahBaris);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
