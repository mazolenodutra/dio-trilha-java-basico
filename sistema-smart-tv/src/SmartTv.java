public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volune = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        System.out.println("Aumentado o volume para: " + volune);
        volune++;
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo o volume para: " + volune);
        volune--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }
}
