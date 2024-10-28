public class Main {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        t1.definirCanal(3);
        t1.ligarTv();
        t1.definirCanal(3);
        t1.aumentarVolume();
        t1.aumentarVolume();
        t1.aumentarVolume();
        t1.desligarTv();

        t2.diminuirVolume();
        t2.ligarTv();
        t2.definirCanal(18);
        t2.diminuirVolume();
    }
}
