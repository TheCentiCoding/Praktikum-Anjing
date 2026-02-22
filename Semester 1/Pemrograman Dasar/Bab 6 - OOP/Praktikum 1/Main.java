import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        Buku [] buku = new Buku[] {
            new Buku("5.0: Apa yang akan Terjadi?","Feinstein, G.",0),
            new Buku("Acheron: Sinner's Road","Johanes, M. dan Benjin",6),
            new Buku("Antara Ada dan Tiada","Vincent",1),
            new Buku("Apa itu Generative AI?","Nicholas, G.",0),
            new Buku("Arsitektur Komputer","Nugroho, K.",0),
            new Buku("Augmented Reality: Apa Itu?","Justin, P.",0),
            new Buku("Belajar dari Kisah Sengsara Yesus","Agatha, D.",3),
            new Buku("Bukti Peninggalan Kerajaan Islam di Indonesia","Gunawan, I.",2),
            new Buku("Bunda Maria, Bunda Gereja","Kristiani, A.",3),
            new Buku("Catatan Seorang Manusia Sunyi","Martin, L. dkk.",1),
            new Buku("Di Balik Topeng","Jesselyn, G.",4),
            new Buku("Dinamika Kekuasaan dalam Sistem Politik Kontemporer","Hubert, J.",5),
            new Buku("Hidup Seperti Jemaat Perdana","Kevin",3),
            new Buku("Jiwa dan Dunia","Sinaga, I.",1),
            new Buku("LIFE: What is it?","Kent, R.",1),
            new Buku("Memahami Mazmur","Cardinius, V.",3),
            new Buku("Menuju Kearifan","Gilbert, D.",1),
            new Buku("Metodologi Analisis Kebijakan Publik: Pendekatan Multi-Level","Arthur, R.",5),
            new Buku("Negara Orang Dalam","Wesley, J.",5),
            new Buku("Paradigma Baru Demokratisasi dalam Era Digital","Alexa, Q.",5),
            new Buku("Partisipasi Politik Generasi Muda","Sijabat, R.",5),
            new Buku("Perang Dunia I","Wesley, J. dan Jonathan",2),
            new Buku("Perang Dunia II","Wesley, J. dan Jonathan",2),
            new Buku("Perjanjian Lama","Sandra, M.",3),
            new Buku("Perjuangan Indonesia","Cahyadi, C.",2),
            new Buku("Resonansi Emosi","Timotius, G.",4),
            new Buku("Self-Healing atau Escapism?","Angela, N.",4),
            new Buku("The Art of Understanding","Amanda, V.",4),
            new Buku("The Tsundere's Love Letter","Jiwon, D.",6),
            new Buku("Throat of the World","Edward, M. dan John Steven",6),
            new Buku("WANNACRY: Virus Pengguncang Dunia","Kira, S. dan Mikhael Gregory",0),
            new Buku("Was Darwin Right?","Goodman, M.",2),
            new Buku("What's Behind the Depressed?","Clementine, C.",4),
            new Buku("Wretched's Demise","Redd, P.",6),
            new Buku("Zoro dan Sembilan Lingkaran","Carpenter, R.",6)
            
        };
        
        System.out.println("[+] ==== E-Library ==== [+]");
        do {
            System.out.println("1. Semua kategori");
            System.out.println("2. Teknologi");
            System.out.println("3. Filsafat");
            System.out.println("4. Sejarah");
            System.out.println("5. Agama");
            System.out.println("6. Psikologi");
            System.out.println("7. Politik");
            System.out.println("8. Fiksi");
            System.out.println("0. Keluar");
            System.out.print("\n Masukkan pilihan: ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("- Menampilkan semua kategori\n");
                    for (Buku n : buku) {
                        n.display();
                    }
                    break;
                case 2:
                    System.out.println("- Menampilkan kategori teknologi\n");
                    for (Buku n : buku) {
                        if (!(n.getKategori().equalsIgnoreCase("teknologi"))) continue;
                        n.display();
                    }
                    break;
                case 3:
                    System.out.println("- Menampilkan kategori filsafat\n");
                    for (Buku n : buku) {
                        if (!(n.getKategori().equalsIgnoreCase("filsafat"))) continue;
                        n.display();
                    }
                    break;
                case 4:
                    System.out.println("- Menampilkan kategori sejarah\n");
                    for (Buku n : buku) {
                        if (!(n.getKategori().equalsIgnoreCase("sejarah"))) continue;
                        n.display();
                    }
                    break;
                case 5:
                    System.out.println("- Menampilkan kategori agama\n");
                    for (Buku n : buku) {
                        if (!(n.getKategori().equalsIgnoreCase("agama"))) continue;
                        n.display();
                    }
                    break;
                case 6:
                    System.out.println("- Menampilkan kategori psikologi\n");
                    for (Buku n : buku) {
                        if (!(n.getKategori().equalsIgnoreCase("psikologi"))) continue;
                        n.display();
                    }
                    break;
                case 7:
                    System.out.println("- Menampilkan kategori politik\n");
                    for (Buku n : buku) {
                        if (!(n.getKategori().equalsIgnoreCase("politik"))) continue;
                        n.display();
                    }
                    break;
                case 8:
                    System.out.println("- Menampilkan kategori fiksi\n");
                    for (Buku n : buku) {
                        if (!(n.getKategori().equalsIgnoreCase("fiksi"))) continue;
                        n.display();
                    }
                    break;
                case 0:
                    System.out.println("- Menghentikan program");
                    break;
                default: System.out.println("\nPILIHAN INVALID!");
            }
        } while (pilihan != 0);
        
    }
    
}
