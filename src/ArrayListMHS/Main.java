package ArrayListMHS;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MHS mahasiswa = new MHS("Prayer", 41155, true);
        // mahasiswa.display();
        int pilih, JmlMhs = 1;
        boolean loop = true;

        MHS[] mhsiswa = new MHS[10];
        mhsiswa[0] = new MHS("Prayer", 431, true);
        // mhsiswa[1] = new MHS("Mogo", 432, true);
        // mhsiswa[2] = new MHS("Sam", 433, true);

        do{
            System.out.println("0. Exit");
            System.out.println("1. List MHS");
            System.out.println("2. Add MHS");
            System.out.println("3. Update MHS");
            System.out.println("4. Delete MHS");
            System.out.println("5. Show Deleted");
            System.out.println("6. Undeleted");
            System.out.print("Masukan Pilihan : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 0 : {
                    loop = false;
                    break;
                }
                case 1 : {
                    System.out.println("List Mahasiswa");
                    mhsiswa[0].ListMhs(mhsiswa, JmlMhs, true);
                    break;
                }
                case 2 : {
                    System.out.println("Add Mahasiswa");
                    mhsiswa[0].AppMhs(mhsiswa, JmlMhs);
                    JmlMhs = mhsiswa[0].jml;
                    break;
                }
                case 3 : {
                    System.out.println("Update Mahasiswa");
                    // simpan indeks dari nama yang dicari ke dalam X
                    int X = mhsiswa[0].SrcMhs(mhsiswa, JmlMhs);
                    if(X == -1){
                        System.out.println("Tidak ada...!");
                    } else {
                        System.out.print("Masukan nama baru : ");
                        mhsiswa[X].nama = input.nextLine();
                        System.out.println("Nama updated...");
                    }
                    break;
                }
                case 4 : {
                    System.out.println("Delete Mahasiswa");
                    int X = mhsiswa[0].SrcMhs(mhsiswa, JmlMhs);
                    if(X == -1){
                        System.out.println("Tidak ada...!");
                    } else {
                        mhsiswa[X].tag = false;
                        System.out.println("Nama Deleted");
                    }
                    break;
                }
                case 5 : {
                    System.out.println("Show Mahasiswa Deleted");
                    mhsiswa[0].ListMhs(mhsiswa, JmlMhs, false);
                    break;
                }
            }
        } while(loop);
    }
}

