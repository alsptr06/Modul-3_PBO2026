import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=========================================");
        System.out.println("\tPROGRAM KALKULATOR kelulusan\t");
        System.out.println("=========================================");

        float nilaiUjian, absensi;

        Scanner input = new Scanner(System.in);
        System.out.println("masukan hasil nilai ujian anda : ");
        nilaiUjian = input.nextFloat();
        System.out.println("masukan presentase absensi : ");
        absensi = input.nextFloat();
        input.close();

       System.out.println((nilaiUjian >= 70 && absensi >= 80) ? "anda lulus" : "anda tidak lulus");
        
    }
}
