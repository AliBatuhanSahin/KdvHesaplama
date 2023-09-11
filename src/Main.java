import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double tutar,kdv = 0.18;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ürün Tutarını Giriniz : ");
        tutar = inp.nextDouble();

        double kdvTutar = tutar * kdv;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutarı : " + tutar);
        System.out.println("Ürünün KDV'li Tutarı : " + kdvliTutar);
        System.out.println("Ürünün KDV Tutarı : " + kdvTutar);

    }
}