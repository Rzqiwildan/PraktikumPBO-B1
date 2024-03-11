public class MPrismaSegitiga {
    public static void main(String[] args) {
        Segitiga alas = new Segitiga(2, 5);
        PrismaSegitiga prisma = new PrismaSegitiga(alas, 6);

        System.out.println("Volume prisma Segitiga" + prisma.getVolume());
        System.out.println("Luas Permukaan prisma Segitiga" + prisma.getLuasPermukaan());
    }
}
