package tugas;

public class MainTugas {
    public static void main(String[] args) {
         String[] kategoriBarang = {"Furniture", "Elektronik", "Pakaian"}; 
        System.out.println("Daftar Kategori:");
        for (int i = 0; i < kategoriBarang.length; i++) {
            System.out.println((i+1) + ". " + kategoriBarang[i]);
        }
        System.out.println();
 Gudang g1 = new Gudang("barang.txt");
 g1.tambahBarang(new Barang("Meja", 500000,10));
 g1.tambahBarang(new Barang("Kursi", 300000,20));
 g1.tambahBarang(new Barang("Pintu", 1000000,30));
 g1.tampilkanSemua();
 g1.simpanKeBerkas();
 System.out.println();
 
 g1.cariBarang("Meja");
 System.out.println(); 
 Gudang g2 = new Gudang("barang.txt");
 System.out.println();
 g2.muatDariBarang();
 g2.tampilkanSemua();
 System.out.println("Jumlah Barang: " + g2.jumlahBarang());
 System.out.println("Total Nilai Persediaan: " + g2.totalNilai());
 }
}
