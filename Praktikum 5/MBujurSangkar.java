import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        scan.close();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " adalah " + bs.hitungLuas(sisi));
    }
    /*jika class BujurSangkar tidak membuat implementasi untuk method abstrak yang
    ada pada kelas BangunDatar, maka akan terjadinya kesalahan kompilasi yang
    memaksa user untuk memberikan implementasi yang sesuai*/
}