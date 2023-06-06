package Rakap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        isiBiodata prayer = new isiBiodata();
        Scanner input = new Scanner(System.in); 
        // String nama, alamat, ttl, agama, namaAyah, namaIbu; int jmlSaudara; 
        int pilih; boolean loop = true; String ubah;

        do{
            System.out.println("MENU\n====");
            System.out.println("0. Exit");
            System.out.println("1. Lihat Biodata Diri");
            System.out.println("2. Isi Biodata Diri");
            System.out.println("3. Ubah Biodata Diri");
            System.out.println("4. Hapus Biodata Diri");
            System.out.print("Masukan Pilihan : ");
            pilih = input.nextInt(); input.nextLine();

            switch(pilih){
                case 0 : {loop = false; break;}
                case 1 : {prayer.showData(); break;}
                case 2 : {prayer.isiData(); break;}
                case 3 : {
                    System.out.print("[nama/ttl/alamat/agama/nm ayah/nm ibu/ jml saudara] \napa yang mau di ubah: "); 
                    ubah = input.nextLine();
                    if(ubah.equals("nama")){
                        System.out.print("ubah " + ubah + " menjadi apa : "); 
                        prayer.setNama(ubah = input.nextLine());
                    } else if(ubah.equals("ttl")){
                        System.out.print("ubah " + ubah + " menjadi apa : "); 
                        prayer.setTtl(ubah = input.nextLine());
                    } else if(ubah.equals("alamat")){
                        System.out.print("ubah " + ubah + " menjadi apa : "); 
                        prayer.setAlamat(ubah = input.nextLine());
                    } else if(ubah.equals("agama")){
                        System.out.print("ubah " + ubah + " menjadi apa : "); 
                        prayer.setAgama(ubah = input.nextLine());
                    } else if(ubah.equals("nm ayah")){
                        System.out.print("ubah " + ubah + " menjadi apa : "); 
                        prayer.setAyah(ubah = input.nextLine());
                    } else if(ubah.equals("nm ibu")){
                        System.out.print("ubah " + ubah + " menjadi apa : "); 
                        prayer.setIbu(ubah = input.nextLine());
                    } else if(ubah.equals("jml saudara")){
                        System.out.print("ubah " + ubah + " menjadi apa : "); 
                        prayer.setJmlSaudara(Integer.valueOf(ubah = input.nextLine()));
                    } else {
                        System.out.println("Warning - *Pilihan tidak tersedia*");
                    }
                    break;
                }
                case 4 : {prayer.deleteData(); break;}
                default : {break;}
            }
        } while(loop);
    }
}
