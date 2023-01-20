import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, kilo, endeks;

        Scanner inpBoy = new Scanner(System.in);

        Scanner inpKilo = new Scanner(System.in);

        System.out.print("Lütfen boyunuz (metre cinsinden) giriniz : ");
        boy = inpBoy.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inpKilo.nextDouble();

        endeks = kilo / (boy * boy);

        System.out.println("Vücut Kitle Endeksiniz : " + endeks);
    }
}