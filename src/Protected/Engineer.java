package Protected;

public abstract class Engineer {
    protected String nama;

    public Engineer(String nama){this.nama = nama;}

    String getNama(){return this.nama;}
    
    void setNama(String newName){this.nama = newName;}

    void display(){System.out.println("Nama : " + this.nama);}
}
