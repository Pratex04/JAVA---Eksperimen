package TutorByMe;

// buat class
class Konsumen{
    // buat atribut
    String Barang;
    int Harga;

    // buat constructor
    Konsumen(String barang, int harga){
        Barang = barang;
        Harga = harga;
        tampilkan();
    }
    
    void tampilkan(){
        System.out.println("Barang : " + Barang);
        System.out.println("Harga  : Rp " + Harga);
    }
}



public class Exam {
    public static void main(String[] args) {
        Konsumen oop = new Konsumen("Bugati", 90);
    }
}
