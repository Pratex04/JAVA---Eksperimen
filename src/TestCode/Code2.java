package TestCode;
import java.util.Scanner;

public class Code2 {
    public static void main(String[] args) {
        
        // deklarasi
        Scanner get = new Scanner(System.in);
        int pilih;
        // deskripsi

        //menu pilihan
        System.out.println("\tMenu\n\t====");
        System.out.println("0. Keluar");
        System.out.println("1. Lihat Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Ubah Data");
        System.out.println("4. Hapus Data");
        System.out.println("5. Lihat Data Terhapus");
        System.out.println("6. Undeleted");
        System.out.print("Masukan Pilihan : ");
        pilih = get.nextInt(); // mengambil inputan users
        get.nextLine(); // menghilangkan buffer pada getn tersebut.
        // melakukan percabangan menggunakan switch case
        switch (pilih) {
            case 0 :{
                System.out.println("Bye..!!!");
                break;
            }
            case 1 : {
                // Masuk dalam fungsi untuk melihat data
                break;
            }
            case 2 : {
                // masuk dalam fungsi untuk menambah data
                break;
            }
            case 3 : {
                // masuk dalam fungsi untuk mengubah data
                break;
            }
            case 4 : {
                // masuk dalam fungsi untuk menghapus data
                break;
            }
            case 5 :{
                // masuk dalam fungsi untuk menampilkan data terhapus
                break;
            }
            case 6 : {
                // masuk dalam fungsi untuk mengembalikan data terhapus
                break;
            }
            default : {break;}
        }
    }
}


