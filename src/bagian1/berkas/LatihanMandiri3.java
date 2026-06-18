package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri3 {
        public static void main(String[] args) {
 File berkas = new File("sementara.txt");
 try {
 if (berkas.createNewFile()) {
 System.out.println("Berkas baru dibuat.");
 } else {
 System.out.println("Berkas sudah ada sebelumnya.");
 System.out.println("Ukuran (byte): " + berkas.length());
 }
 System.out.println("Apakah file ada sebelum dihapus? " + berkas.exists());
if (berkas.delete()) {
System.out.println("File sementara.txt berhasil dihapus.");
} else {
System.out.println("File gagal dihapus.");
}
System.out.println("Apakah file ada setelah dihapus? " + berkas.exists());
 } catch (IOException e) {
 System.out.println("Terjadi kesalahan: " + e.getMessage());
}
}
}
