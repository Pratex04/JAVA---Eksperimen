package TutorByMe;

class UNLA{
    String Nama;
    String Prodi;

    UNLA(String nama, String prodi){
        Nama = nama;
        Prodi = prodi;
    }

}

public class Main {
    public static void main(String[] args) {
        UNLA daud = new UNLA("Daud", "T-INF"); // objek
        System.out.println(daud.Nama);
    }
}
