package bagian1.berkas;
import java.io.File;
import java.io.IOException;

public class LatihanMandiri2 {
        public static void main(String[] args)throws IOException {
        File folder = new File("arsip");
        if (folder.mkdir()) {
            System.out.println("Folder berhasil dibuat: " + folder.getName());
        } else {
            System.out.println("Folder gagal dibuat atau sudah ada.");
        }
    }
}
