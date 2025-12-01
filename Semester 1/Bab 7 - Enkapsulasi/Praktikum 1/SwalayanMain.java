import java.util.Scanner;

public class SwalayanMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        String struk = "===== STRUK BELANJA ====";
        int pilihan;
        int benda;
        double tagihan = 0;
        
        // REGISTER AKUN
        System.out.println("========== SWALAYAN TINY ==========");
        System.out.println("Register akun");
        System.out.println("Masukkan nama: ");
        String userName = in.nextLine();
        System.out.println("Masukkan password: ");
        String userPass = in.nextLine();
        System.out.println("Masukkan nomor pelanggan: ");
        String userID = in.nextLine();
        for (int i = userID.length(); i <= 12; i++) {
            userID = userID + "0";
        }
        System.out.println("Nomor Anda: "+userID);
        System.out.println("Password Anda: "+userPass);
        Akun a1 = new Akun(userName, userID, userPass);
        boolean status;
        
        // BELI BARANG
        do {
            System.out.println("========== SWALAYAN TINY ==========");
            System.out.println("Selamat datang, "+a1.getNama());
            System.out.println("1. Belanja");
            System.out.println("2. Topup");
            System.out.println("3. Bayar");
            System.out.println("0. Keluar");
            System.out.println("Tagihan Anda: Rp "+tagihan);
            System.out.println("Saldo Anda: Rp "+a1.getSaldo());
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 0: System.out.println("PROGRAM DIHENTIKAN."); break;
                case 1:
                    benda = 0;
                    do {
                        System.out.println("========== SWALAYAN TINY ==========");
                        System.out.printf("%-20s Rp 14.999,- /kg \n","1. Beras");
                        System.out.printf("%-20s Rp 16.999,- /kg\n","2. Gula");
                        System.out.printf("%-20s Rp 19.999,- /kg\n","3. Minyak Goreng");
                        System.out.println("0. Keluar");
                        benda = in.nextInt();
                        switch (benda) {
                            case 0: System.out.println("KEMBALI KE MENU UTAMA."); break;
                            case 1:
                                System.out.println("Memasukkan Beras ke keranjang.");
                                struk = struk + "\n - 1 kg Beras";
                                tagihan = tagihan + 14999;
                                break;
                            case 2:
                                System.out.println("Memasukkan Gula ke keranjang.");
                                struk = struk + "\n - 1 kg Gula";
                                tagihan = tagihan + 16999;
                                break;
                            case 3:
                                System.out.println("Memasukkan Minyak Goreng ke keranjang.");
                                struk = struk + "\n - 1 kg Minyak Goreng";
                                tagihan = tagihan + 19999;
                                break;
                            default: System.out.println("PILIHAN INVALID");                         
                        }
                    } while (benda != 0);
                    break;
                case 2:
                    benda = 0;
                    do {
                        System.out.println("========== SWALAYAN TINY ==========");
                        System.out.println("1. Rp 200.000");
                        System.out.println("2. Rp 500.000");
                        System.out.println("3. Rp 1.000.000");
                        System.out.println("0. Keluar");
                        benda = in.nextInt();
                        switch (benda) {
                            case 0: System.out.println("KEMBALI KE MENU UTAMA."); break;
                            case 1:
                                status = Verify(a1);
                                if (status == true) {
                                    System.out.println("Berhasil top up sebanyak Rp200.000");
                                    a1.setsaldo(a1.getSaldo()+200000);
                                } else {
                                    benda = 0;
                                    pilihan = 0;
                                }
                                break;
                            case 2:
                                status = Verify(a1);
                                if (status == true) {
                                    System.out.println("Berhasil top up sebanyak Rp500.000");
                                    a1.setsaldo(a1.getSaldo()+500000);
                                } else {
                                    benda = 0;
                                    pilihan = 0;
                                }
                                break;
                            case 3:
                                status = Verify(a1);
                                if (status == true) {
                                    System.out.println("Berhasil top up sebanyak Rp1.000.000");
                                    a1.setsaldo(a1.getSaldo()+1000000);
                                } else {
                                    benda = 0;
                                    pilihan = 0;
                                }
                                break;
                            default: System.out.println("PILIHAN INVALID");                         
                        }
                    } while (benda != 0);
                    break;
                    
                    // BAYAR
                case 3:
                    System.out.println("========== SWALAYAN TINY ==========");
                    System.out.println("Struk pembelian");
                    System.out.println(struk);
                    System.out.println("Tagihan Anda: Rp "+tagihan);
                    System.out.println("Saldo Anda: Rp "+a1.getSaldo());
                    if (a1.getSaldo()-10000 <= tagihan) System.out.println("Saldo Anda kurang!");
                    else {
                        status = Verify(a1);
                        if (status == true) {
                            System.out.println("Transaksi berhasil!");
                            a1.setsaldo(a1.getSaldo()-tagihan);
                            System.out.println("Saldo Anda sekarang: Rp "+a1.getSaldo());
                            
                            // CASHBACK
                            double cashback;
                            String specialID = a1.getID().substring(0, 2);
                                if (specialID.equals("38") && tagihan > 1000000) {
                                    cashback = tagihan*0.05;
                                    a1.setsaldo(a1.getSaldo()+cashback);
                                    System.out.println("Anda mendapat Rp "+cashback+" cashback!");
                                } else if (specialID.equals("56") && tagihan > 1000000) {
                                    cashback = tagihan*0.07;
                                    a1.setsaldo(a1.getSaldo()+cashback);
                                    System.out.println("Anda mendapat Rp "+cashback+" cashback!");
                                } else if (specialID.equals("56") && tagihan <= 1000000) {
                                    cashback = tagihan*0.02;
                                    a1.setsaldo(a1.getSaldo()+cashback);
                                    System.out.println("Anda mendapat Rp "+cashback+" cashback!");
                                } else if (specialID.equals("74") && tagihan > 1000000) {
                                    cashback = tagihan*0.1;
                                    a1.setsaldo(a1.getSaldo()+cashback);
                                    System.out.println("Anda mendapat Rp "+cashback+" cashback!");
                                } else if (specialID.equals("74") && tagihan <= 1000000) {
                                    cashback = tagihan*0.05;
                                    a1.setsaldo(a1.getSaldo()+cashback);
                                    System.out.println("Anda mendapat Rp "+cashback+" cashback!");
                                }
                            
                        } else {
                            pilihan = 0;
                        }
                    }
                    break;
                default: System.out.println("PILIHAN INVALID!");
            }
        } while (pilihan != 0);
        
    }
    
    // AUTENTIKASI
    public static boolean Verify(Akun akun) {
        Scanner in = new Scanner(System.in);
        int attempts = 3;
        do {
            System.out.println("========== SWALAYAN TINY ==========");
            System.out.println("Sistem Autentikasi");
            System.out.println("Masukkan nomor pelanggan: ");
            String tempID = in.nextLine();
            System.out.println("Masukkan password: ");
            String tempPass = in.nextLine();
            if (tempID.equals(akun.getID()) && tempPass.equals(akun.getPassword())) return true;
            else {
                System.out.println("Nomor pelanggan atau password salah!");
                attempts--;
            }
        } while (attempts > 0);
        System.out.println("Terlalu banyak percobaan. Transaksi dibatalkan.");
        return false;
    }
}
    
