public class Buku {
    String judul;
    String penulis = "Nicholas, R.";
    String kategori = "Fiksi";
    
    Buku () {
        this.judul = "Buku Tak Berjudul";
    }
    
    Buku (String judul) {
        this.judul = judul;
    }
    
    Buku (String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
    
    Buku (String judul, String penulis, int type) {
        this.judul = judul;
        this.penulis = penulis;
        switch (type) {
            case 0: this.kategori = "Teknologi"; break;
            case 1: this.kategori = "Filsafat"; break;
            case 2: this.kategori = "Sejarah"; break;
            case 3: this.kategori = "Agama"; break;
            case 4: this.kategori = "Psikologi"; break;
            case 5: this.kategori = "Politik"; break;
            default: this.kategori = "Fiksi";
        }
    }
    
    public String getKategori() {
        return kategori;
    }
    
    public void display() {
        System.out.println(judul);
        System.out.println("Nama penulis : "+penulis);
        System.out.println("Kategori : "+kategori);
        System.out.println("====================");
    }
}
