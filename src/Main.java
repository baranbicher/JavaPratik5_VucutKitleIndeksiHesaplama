import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kg, m;

        Scanner vki = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = vki.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        m = vki.nextDouble();

        double vk = kg / (m * m);
        System.out.println("Vücut Kitle İndeksiniz : " + vk);
    }
}