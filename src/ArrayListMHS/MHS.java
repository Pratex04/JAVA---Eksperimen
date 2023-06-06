package ArrayListMHS;
import java.util.Scanner;

public class MHS {
    Scanner input = new Scanner(System.in);
    String nama;
    float nilai;
    boolean tag;
    int jml;

    MHS(String nama, float nilai, Boolean tag){
        this.nama = nama;
        this.nilai = nilai;
        this.tag = tag;
    }

    MHS(String nama, boolean tag){this.nama = nama; this.tag = tag;}

    MHS(){}

    void display(){
        System.out.println("\nNama \t: " + this.nama);
        System.out.println("Nilai \t: " + this.nilai);
        System.out.println("Status \t: " + this.tag);
    }

    void ListMhs(MHS[] people, int MhsKe, boolean tag){
        for(int i = 0; i < MhsKe; i++){
            if(people[i].tag == tag){
                System.out.println(i+1 + ". " + people[i].nama);
            }
        }
    }

    int tambah(int a){
        a = a + 1;
        return a;
    }

    void AppMhs(MHS[] people, int MhsKe){
        System.out.print("Masukan Nama : ");
        String nama = input.nextLine();
        people[MhsKe] = new MHS(nama, true);
        this.jml = MhsKe + 1;
    }

    int SrcMhs(MHS[] people, int MhsKe){
        System.out.print("Masukan nama : ");
        this.nama = input.nextLine();
        for(int i = 0; i < MhsKe; i++){
            if(people[i].nama == this.nama) return i;
        }
        return -1;
    }

}
