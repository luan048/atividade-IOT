public class Tv {
    boolean ligado = false;
    int canal;
    int volume = 8;

    public void ligarTv() {
        ligado = true;
        System.out.println("Tv ligada com Sucesso!");
    }

    public void desligarTv() {
        ligado = false;
        System.out.println("Tv desligada com Sucesso!");
    }

    public void definirCanal(int pcanal) {
        if(ligado) {
            canal = pcanal;
            System.out.println("Canal definido para: " + canal);
        }
        else {
            System.out.println("TV desligada você precisa ligar a TV...");
        }
    }

    public void aumentarVolume() {
        if(ligado) {
            volume++;
            System.out.println(volume);
        }
        else {
            System.out.println("TV desligada você precisa ligar a TV...");
        }
    }

    public void diminuirVolume() {
        if(ligado) {
            volume--;
            System.out.println(volume);
        }
        else {
            System.out.println("TV desligada você precisa ligar a TV...");
        }
    }
}