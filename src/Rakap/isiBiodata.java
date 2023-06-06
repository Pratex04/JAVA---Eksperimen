package Rakap;
import java.util.Scanner;

public class isiBiodata {
    private String nama, alamat, ttl, agama, namaAyah, namaIbu; private int jmlSaudara; String task;
    Scanner input = new Scanner(System.in);

    // constructor tanpa parameter
    isiBiodata(){};

    // constructor dengan parameter
    public isiBiodata(String nama, String ttl, String alamat, String agama, String namaAyah, String namaIbu, int jmlSaudara){
        this.nama = nama; this.ttl = ttl; this.alamat = alamat; this.agama = agama; 
        this.namaAyah = namaAyah; this.namaIbu = namaIbu; this.jmlSaudara = jmlSaudara;
    }

    // method untuk isi data secara terpisah
    public void isiData(){
        System.out.print("Nama         : "); this.nama = input.nextLine();
        System.out.print("TTL          : "); this.ttl = input.nextLine();
        System.out.print("Alamat       : "); this.alamat = input.nextLine();
        System.out.print("Agama        : "); this.agama = input.nextLine();
        System.out.print("Nama Ayah    : "); this.namaAyah = input.nextLine();
        System.out.print("Nama Ibu     : "); this.namaIbu = input.nextLine();
        System.out.print("jml. Saudara : "); this.jmlSaudara = input.nextInt();
        input.nextLine(); // menghilangkan buffer pada kode yang dipakai
    }

    // ******* GETTER ******* //
    // getter nama
    public String getNama(){ return this.nama;}

    // getter tempat, tanggal lahir
    public String getTtl(){ return this.ttl;}

    // getter alamat
    public String getAlamat(){return this.alamat;}

    // getter agama
    public String getAgama(){return this.agama;}

    // getter nama Ayah
    public String getAyah(){return this.namaAyah;}

    // getter nama Ibu
    public String getIbu(){return this.namaIbu;}

    // getter jumlah saudara
    public Integer getJmlSaudara(){return this.jmlSaudara;}

    // ******* SETTER ******* //
    // setter nama
    public void setNama(String newNama){this.nama = newNama;}

    // setter tempat, tanggal lahir
    public void setTtl(String newTtl){this.ttl = newTtl;}

    // setter alamat 
    public void setAlamat(String newAlamat){this.alamat = newAlamat;}

    // setter agama
    public void setAgama(String newAgama){this.agama = newAgama;}

    // setter nama ayah
    public void setAyah(String newNamaAyah){this.namaAyah = newNamaAyah;}

    // setter nama ibu
    public void setIbu(String newNamaIbu){this.namaIbu = newNamaIbu;}

    // setter jumlah saudara
    public void setJmlSaudara(int newJmlSaudara){this.jmlSaudara = newJmlSaudara;}

    public void showData(){
        System.out.println("\n[*BIODATA ANDA*]");
        System.out.println("Nama         : " + this.nama);
        System.out.println("TTL          : " + this.ttl);
        System.out.println("Alamat       : " + this.alamat);
        System.out.println("Agama        : " + this.agama);
        System.out.println("Nama Ayah    : " + this.namaAyah);
        System.out.println("Nama Ibu     : " + this.namaIbu);
        System.out.println("jml. Saudara : " + this.jmlSaudara);
        System.out.println("===========================================");
    }

    public void deleteData(){
        System.out.print("[nama/ttl/alamat/agama/nm ayah/nm ibu/ jml saudara] \nApa yang ingin dihapus : ");
        task = input.nextLine();
        if(task.equals("nama")){
            this.nama = null;
            System.out.print(task + " telah dihapus...."); 
        } else if(task.equals("ttl")){
            this.ttl = null;
            System.out.print(task + " telah dihapus...."); 
        } else if(task.equals("alamat")){
            this.alamat = null;
            System.out.print(task + " telah dihapus...."); 
        } else if(task.equals("agama")){
            this.agama = null;
            System.out.print(task + " telah dihapus...."); 
        } else if(task.equals("nm ayah")){
            this.namaAyah = null;
            System.out.print(task + " telah dihapus...."); 
        } else if(task.equals("nm ibu")){
            this.namaIbu = null;
            System.out.print(task + " telah dihapus...."); 
        } else if(task.equals("jml saudara")){
            this.jmlSaudara = 0;
            System.out.print(task + " telah dihapus...."); 
        } else {
            System.out.println("Warning - *Pilihan tidak tersedia*");
        }
    }

}
