import java.util.Scanner;

public class KDVHesaplayici{
    public static void main(String[] args) {

        double tutar, kdvTutari, kdvliTutar;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ürün fiyatını giriniz:");
        tutar = scan.nextDouble();

        kdvTutari = tutar < 1000 ? (tutar * 0.18) : (tutar * 0.08);
        kdvliTutar = tutar + kdvTutari;

        System.out.println("\nÜrün Fiyatı\t" + tutar);
        System.out.printf("KDV Tutarı\t%.2f", kdvTutari);
        System.out.println("\nToplam Fiyat\t" + kdvliTutar);

        System.out.println("-----------------------");

    }
}