import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===================================");
        System.out.println("\tPROGRAM LOKET TIKET\t");
        System.out.println("===================================");
        System.out.println("1. VIP - Harga: Rp 1.500.000\t| Stok Awal: 5\t| Syarat Usia: Minimal 18 tahun.");
        System.out.println("2. Festival - Harga: Rp 800.000\t| Stok Awal: 25\t| Syarat Usia: Minimal 15 tahun.");
        System.out.println("3. Tribune - Harga: Rp 500.000\t| Stok Awal: 35\t| Syarat Usia: Tidak ada batasan.");
        System.out.println("4. Keluar");
        System.out.println("===================================");

        int usiaUser, inputTiket, jumlahTiket;
        int stokVIP = 5, stokFestival = 25, stokTribune = 35;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Silahkan pilih tiket: ");
            inputTiket = input.nextInt();

            switch (inputTiket) {
                case 1:
                    System.out.print("Masukkan jumlah tiket: ");
                    jumlahTiket = input.nextInt();

                    if (jumlahTiket <= stokVIP) {
                        int tiketBerhasil = 0; 

                        for (int i = 0; i < jumlahTiket; i++) {
                            System.out.print("\nMasukkan usia pengunjung " + (i + 1) + ": ");
                            usiaUser = input.nextInt();

                            if (usiaUser < 18) {
                                System.out.println("Anda tidak dapat membeli tiket VIP karena di bawah umur 18.");
                            } else {
                                System.out.println("TIKET VIP berhasil dibeli.");
                                tiketBerhasil++; 
                                stokVIP--; 
                            }
                        }

                        if (tiketBerhasil > 0) {
                            System.out.println("\nTerima kasih sudah membeli tiket VIP, Berikut bukti pembelian.");
                            System.out.println("=================================================");
                            System.out.println("\tRESI PEMBELIAN TIKET VIP\t");
                            System.out.println("=================================================");
                            System.out.println("Jumlah tiket yang dibeli: " + tiketBerhasil);
                            System.out.println("Total harga tiket: Rp " + tiketBerhasil * 1500000);
                            System.out.println("Sisa stok VIP: " + stokVIP); // Langsung pakai stokVIP yang sudah dikurangi
                            System.out.println("Sisa stok Festival: " + stokFestival);
                            System.out.println("Sisa stok Tribune: " + stokTribune);
                            System.out.println("=================================================");
                        } else {
                            System.out.println("Tidak ada tiket yang berhasil dibeli.");
                        }
                    } else {
                        System.out.println("Stok tiket VIP tidak cukup.");
                        System.out.println("Tiket hanya tersedia sebanyak " + stokVIP + " tiket.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan jumlah tiket: ");
                    jumlahTiket = input.nextInt();

                    if (jumlahTiket <= stokFestival) {
                        int tiketBerhasil = 0;

                        for (int i = 0; i < jumlahTiket; i++) {
                            System.out.print("\nMasukkan usia pengunjung " + (i + 1) + ": ");
                            usiaUser = input.nextInt();

                            if (usiaUser < 15) {
                                System.out.println("Anda tidak dapat membeli tiket Festival karena di bawah umur 15.");
                            } else {
                                System.out.println("TIKET Festival berhasil dibeli.");
                                tiketBerhasil++;
                                stokFestival--;
                            }
                        }

                        if (tiketBerhasil > 0) {
                            System.out.println("\nTerima kasih sudah membeli tiket Festival, Berikut bukti pembelian.");
                            System.out.println("=================================================");
                            System.out.println("\tRESI PEMBELIAN TIKET FESTIVAL\t");
                            System.out.println("=================================================");
                            System.out.println("Jumlah tiket yang dibeli: " + tiketBerhasil);
                            System.out.println("Total harga tiket: Rp " + tiketBerhasil * 800000);
                            System.out.println("Sisa stok VIP: " + stokVIP);
                            System.out.println("Sisa stok Festival: " + stokFestival);
                            System.out.println("Sisa stok Tribune: " + stokTribune);
                            System.out.println("=================================================");
                        } else {
                            System.out.println("Tidak ada tiket yang berhasil dibeli.");
                        }
                    } else {
                        System.out.println("Stok tiket Festival tidak cukup.");
                        System.out.println("Tiket hanya tersedia sebanyak " + stokFestival + " tiket.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan jumlah tiket: ");
                    jumlahTiket = input.nextInt();

                    if (jumlahTiket <= stokTribune) {
                        int tiketBerhasil = 0;

                        for (int i = 0; i < jumlahTiket; i++) {
                            System.out.print("\nMasukkan usia pengunjung " + (i + 1) + ": ");
                            usiaUser = input.nextInt();
                            System.out.println("TIKET Tribune berhasil dibeli.");
                            tiketBerhasil++;
                            stokTribune--;
                        }

                        System.out.println("\nTerima kasih sudah membeli tiket Tribune, Berikut bukti pembelian.");
                        System.out.println("=================================================");
                        System.out.println("\tRESI PEMBELIAN TIKET TRIBUNE\t");
                        System.out.println("=================================================");
                        System.out.println("Jumlah tiket yang dibeli: " + tiketBerhasil);
                        System.out.println("Total harga tiket: Rp " + tiketBerhasil * 500000);
                        System.out.println("Sisa stok VIP: " + stokVIP);
                        System.out.println("Sisa stok Festival: " + stokFestival);
                        System.out.println("Sisa stok Tribune: " + stokTribune);
                        System.out.println("=================================================");
                    } else {
                        System.out.println("Stok tiket Tribune tidak cukup.");
                        System.out.println("Tiket hanya tersedia sebanyak " + stokTribune + " tiket.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (inputTiket != 4);

        input.close();
    }
}