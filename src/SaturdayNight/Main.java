package SaturdayNight;
import java.util.Scanner;

class Nilai{
    int uts;
    int uas;
    Nilai(){}
}

class MTK{
    Nilai STD = new Nilai();
    Nilai ALG = new Nilai();
    Nilai PBO = new Nilai();
    Nilai WEB = new Nilai();
    MTK(){}
}

class MHS{
    String nama;
    MTK matkul = new MTK();
    boolean tag;
    MHS(String name, boolean tag){
        this.nama = name;
        this.tag = tag;
    }

    MHS(){}

    void nilaiMHS(){
        System.out.println("atas Nama " + this.nama);
        System.out.println("STD, UTS : " + this.matkul.STD.uts);
        System.out.println("STD, UAS : " + this.matkul.STD.uas);
        System.out.println("ALG, UTS : " + this.matkul.ALG.uts);
        System.out.println("ALG, UAS : " + this.matkul.ALG.uas);
        System.out.println("PBO, UTS : " + this.matkul.PBO.uts);
        System.out.println("PBO, UAS : " + this.matkul.PBO.uas);
        System.out.println("WEB, UTS : " + this.matkul.WEB.uts);
        System.out.println("WEB, UAS : " + this.matkul.WEB.uas);
    }

    void AppMhs(MHS[] mhs, int jmlMhs){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama : ");
        
        mhs[jmlMhs] = new MHS(nama = input.nextLine(), true);
        jmlMhs++;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MHS[] mahasiswa = new MHS[100];
        mahasiswa[0] = new MHS();
        mahasiswa[0].nama = "Prayer Tekege";
        mahasiswa[0].tag = true;
        
        int jmlMhs = 1; boolean loop = true;
        do{
            System.out.println("Menu\n====");
            System.out.println("0. Exit");
            System.out.println("1. Lst Mahasiswa");
            System.out.println("2. Add Mahasiswa");
            System.out.println("3. Upd Mahasiswa");
            System.out.println("4. Del Mahasiswa");
            System.out.println("5. Show Deleted");
            System.out.println("6. Undelete");
            System.out.print("Masukan Pilihan : ");
            int pilih = input.nextInt(); input.nextLine();
            if(pilih == 0){
                loop = false;
            } else if(pilih == 1){
                for(int i = 0; i < jmlMhs; i++){
                    if(mahasiswa[i].tag == true){
                        System.out.println(mahasiswa[i].nama);
                    }
                }
            } else if(pilih == 2){
                mahasiswa[0].AppMhs(mahasiswa, jmlMhs);
            }
        }while(loop);
    }   
}
