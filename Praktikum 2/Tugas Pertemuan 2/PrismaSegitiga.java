public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggi;

    public PrismaSegitiga(Segitiga alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getVolume() {
        return alas.getLuas() * tinggi;
    }

    public double getLuasPermukaan (){
        return 2 * alas.getLuas() + alas.getKeliling() * tinggi;
    }
}
