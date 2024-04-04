import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory{
    public static void main (String[] args) {
        HashMap<String, Integer> inventori = new HashMap<>();

        inventori.put("Pensil", 50);
        inventori.put("Buku", 35);
        inventori.put("Penghapus", 25);

        System.out.println("Inventori Awal : " + inventori);

        inventori.put("Pensil", inventori.get ("Pensil") + 20);

        inventori.remove("Penghapus");

        System.out.println("Inventori Setelah Update : " + inventori);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nama Barang Yang Ingin Dicari : ");
        String barang = scanner.nextLine();

        cariBarang(inventori,barang);
    }

    public static void cariBarang(HashMap<String, Integer> inventori, String barang) {
        if (inventori.containsKey(barang)) {
            System.out.println("Stok " + barang + ": " + inventori.get(barang) + "unit.");
        } else {
            System.out.println("Barang " + barang + " Tidak Tersedia Di Inventori.");
        }
    }
}
