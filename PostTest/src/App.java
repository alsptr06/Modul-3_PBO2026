import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        float saldo = 0, nilaiTarikTunai, nilaiSetorTunai;
        int value;

        do {
            System.out.println("\n=================================");
            System.out.println("\tPROGRAM SIMULASI MENU ATM\t");
            System.out.println("=================================");
            System.out.println("1. Cek saldo");
            System.out.println("2. Setor tunai");
            System.out.println("3. Tarik tunai");
            System.out.println("0. Keluar");
            System.out.println("=================================");
            
            System.out.print("Masukkan pilihan: ");
            value = input.nextInt();

            switch (value) {
                case 1:
                    System.out.println("Saldo anda sebesar: Rp " + saldo);
                    break;
                    
                case 2:
                    System.out.print("Setor tunai sebesar: Rp ");
                    nilaiSetorTunai = input.nextFloat();
                    saldo = saldo + nilaiSetorTunai;
                    System.out.println("Setor berhasil! Saldo sekarang: Rp " + saldo);
                    break;
                    
                case 3:
                    System.out.print("Tarik tunai sebesar: Rp ");
                    nilaiTarikTunai = input.nextFloat();
                    
                    if (nilaiTarikTunai > saldo) {
                        System.out.println("Saldo tidak cukup!");
                    } else {
                        saldo = saldo - nilaiTarikTunai;
                        System.out.println("Tarik tunai berhasil! Sisa saldo: Rp " + saldo);
                    }
                    break;
                    
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
            
        } while (value != 0);
        
        input.close();
    }
}