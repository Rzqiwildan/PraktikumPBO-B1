public class Titik {
    // mendeklarasi atribut
    double absis;
    double ordinat;
    static int counterTitik;

    // mendeklarasi konstruktor
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double a, double b) {
        absis = a;
        ordinat = b;
        counter++;
    }

    // mendeklarasi metode
    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double o){
        ordinat = o;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    int getCounterTitik(){
        return counterTitik;
    }
    
}
