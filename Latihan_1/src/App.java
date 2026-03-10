import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    System.out.println("=========================================");
    System.out.println("\tPROGRAM KALKULATOR SEDERHANA\t");
    System.out.println("=========================================");

    double angka1, angka2;
    String operator;

    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka pertama: ");
    angka1 = input.nextDouble();
    System.out.print("Masukkan angka kedua: ");
    angka2 = input.nextDouble();
    System.out.print("Masukkan operator (+, -, *, /): ");
    operator = input.next();
    input.close();

    switch (operator) {
        case "+":
            System.out.println("Hasil penjumlahan: " + (angka1 + angka2)); 
            break;
        case "*":
            System.out.println("Hasil perkalian: " + (angka1 * angka2));
            break;
        case "-":
            System.out.println("Hasil pengurangan: " + (angka1 - angka2));
            break;
        case "/":
            if (angka2 == 0) {
                System.out.println("Pembagian dengan nol tidak dapat dilakukan.");
                break;
            }else{
                System.out.println("Hasil pembagian: " + (angka1 / angka2));
            }
            break;
    
        default:
            break;
    }

    
    }
}
