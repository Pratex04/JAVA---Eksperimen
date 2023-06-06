package TestCode;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

class psAdik{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String nik, nisn, nis, npsn, nokk, nama;

    psAdik(String nama, String nik, String nisn, String nis, String npsn, String nokk){
        this.nik = nik; this.nisn = nisn; this.nis = nis; 
        this.npsn = npsn; this.nokk = nokk; this.nama = nama;
    }

    psAdik(){}
    
    // void isiData(){
    //     System.out.print("Masukan Nama : "); reader.readLine();
    // } harus diperbaiki lagi

    // buatkan fungsi untuk mencari indeks dari array di class psAdik

    void cetak(){
        System.out.println("[**PERSIAPAN TES ADIK**]");
        System.out.println("Data : " + this.nama);
        System.out.println("NIK     : " + this.nik);
        System.out.println("NISN    : " + this.nisn);
        System.out.println("NIS     : " + this.nis);
        System.out.println("NPSN    : " + this.npsn);
        System.out.println("No.KK   : " + this.nokk);
    }
}

public class Code3 {
    public static void main(String[] args) {
        
        // inisialisasi objek
        psAdik[] peserta = new psAdik[5];
        peserta[0] = new psAdik();
        peserta[0].nama = "Mogoodiyai Prayer Samuel Tekege";
        peserta[0].nik = "9104010404040004";
        peserta[0].nisn = "0045578625";
        peserta[0].npsn = "60301902";
        peserta[0].nokk = "9104011012090024";
        peserta[0].nis = "08294";

        // inisialisasi Datatype primitive
        
        // deskripsi
        peserta[0].cetak();
    }
}
