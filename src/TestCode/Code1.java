package TestCode;
import java.util.Scanner;

public class Code1 { 
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String ask; int choose; boolean loop = true;
        Code1 code = new Code1();
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("*[ PROGRAM MENGHITUNG LUAS ]*");
            System.out.println("1. Segitiga");
            System.out.println("2. Persegi");
            System.out.println("3. Lingkaran");
            System.out.println("4. Exit");
            System.out.print("Masukan Pilihan : "); choose = input.nextInt();
            if(choose ==  1){
                code.Segitiga();
            } else if(choose == 2){
                code.Persegi();
            } else if(choose == 3){
                code.Lingkaran();
            } else if(choose == 4){
                loop = false;
            } else {
                System.out.println("Maaf - Pilihan anda salah...!!");
            }
        }while(loop);
    }

    void Segitiga(){
        System.out.print("masukan panjang sisi : ");
        int sisi = input.nextInt();
        int total = sisi*sisi*sisi;
        System.out.println("Hasilnya adalah " + total);
    }

    void Persegi(){
        System.out.print("Masukan Panjang : "); int p = input.nextInt();
        System.out.print("Masukan Lebar : "); int l = input.nextInt();
        int total = p*l;
        System.out.println("Hasilnya adalah " + total);
    }

    void Lingkaran(){
        System.out.print("Masukan jari-jari : "); int j = input.nextInt();
        double total = (double) 2 * 3.14 * j;
        System.out.println("Hasilnya adalah " + total);
    }
}
