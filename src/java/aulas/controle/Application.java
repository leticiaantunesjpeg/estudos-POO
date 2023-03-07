package java.aulas.controle;

public class Application {
    public static void main(String[] args) {

        ControleRemoto c = new ControleRemoto();

        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
}
