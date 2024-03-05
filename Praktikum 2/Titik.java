public class Titik {
    // mendeklarasi atribut
    private double absis;
    private double ordinat;
    private static int counterTitik;

    // mendeklarasi konstruktor
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double a, double b) {
        absis = a;
        ordinat = b;
        counterTitik++;
    }

    // mendeklarasi metode
    public void setAbsis(double a){
        absis = a;
    }

    public void setOrdinat(double o){
        ordinat = o;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    int getCounterTitik(){
        return counterTitik;
    }
    
}