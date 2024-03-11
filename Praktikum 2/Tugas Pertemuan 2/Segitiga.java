public class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getLuas() {
        return (alas * tinggi / 2);
    }

    public double getKeliling (){
        return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi ); 
    }
}