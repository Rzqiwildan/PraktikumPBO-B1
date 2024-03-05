public class MOperasiTitik {
    public static void main(String[] args) {
        Titik t = new Titik(4.0, 4.0);
        OperasiTitik o = new OperasiTitik();

        System.out.println("titik(" + t.getAbsis() + "," + t.getOrdinat() +")" );    

        o.refleksiX(t);
        System.out.println("titik setelah refleksi X : titik(" + t.getAbsis() + "," + t.getOrdinat() +")" );
        o.refleksiY(t); 
        System.out.println("titik setelah refleksi Y : titik(" + t.getAbsis() + "," + t.getOrdinat() +")" );
    }
}
