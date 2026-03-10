import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("========================================");
        System.out.println("\tPROGRAM VALIDASI PIN\t");
        System.out.println("========================================");

        int inputBenar = 123456789;
        int inputUser;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan PIN: ");
        inputUser = input.nextInt();
        input.close();

        for (int i = 0; i < 3; i++) {
          if (inputUser == inputBenar) {
            System.out.println("PIN anda benar");
            break;
          }  else {
            System.out.println("PIN anda salah silahkan coba lagi");
          }
        }

    }
}
