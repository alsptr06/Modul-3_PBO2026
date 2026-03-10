import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int usia;
        float berat;
        float hemoglobin;

        System.out.println("========================================");
        System.out.println("PROGRAM CEK KELAYAKAN PENDONOR DARAH");
        System.out.println("========================================");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia anda (tahun): ");
        usia = input.nextInt();

        System.out.print("Masukkan berat badan anda (kg): ");
        berat = input.nextFloat();

        System.out.print("Masukkan kadar hemoglobin anda (g/dL): ");
        hemoglobin = input.nextFloat();

        input.close();

        System.out.println("========================================");

        
        if (usia >= 17 && usia <= 60) {
            
            
            if (berat >= 45) {
                
                
                if (hemoglobin >= 12.5) {
                    
                    
                    System.out.println("ANDA LAYAK MENDONOR DARAH");
                    System.out.println("Semua kriteria terpenuhi:");
                    System.out.println("- Usia: " + usia + " tahun");
                    System.out.println("- Berat: " + berat + " kg");
                    System.out.println("- Hemoglobin: " + hemoglobin + " g/dL");
                    
                } else {
                    System.out.println("ANDA TIDAK LAYAK MENDONOR");
                    System.out.println("Kadar hemoglobin anda terlalu rendah");
                    System.out.println("Hemoglobin anda: " + hemoglobin + " g/dL");
                    System.out.println("Minimal yang dibutuhkan: 12.5 g/dL");
                }
                
            } else {
                System.out.println("ANDA TIDAK LAYAK MENDONOR");
                System.out.println("Berat badan anda kurang dari 45 kg");
                System.out.println("Berat anda sekarang: " + berat + " kg");
            }
            
        } else {
            // Gagal di usia
            System.out.println("ANDA TIDAK LAYAK MENDONOR");
            System.out.println("Usia anda tidak memenuhi syarat");
            System.out.println("Usia anda: " + usia + " tahun");
            System.out.println("Syaratnya harus 17-60 tahun");
        }

        System.out.println("========================================");
    }
}