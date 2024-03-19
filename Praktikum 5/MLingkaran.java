import java.util.Scanner;
public class MLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan jejari lingkaran :");
        double jejari = scanner.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan " + "jejari 10.2 satuan adalah " + l.hitungLuas());
    }
}