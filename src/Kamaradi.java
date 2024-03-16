
public class Kamaradi {
    public static void main(String[] args) {

        // Vytvoření lidí
        Clovek karel = new Clovek();
        karel.jmeno = "Karel Novák";
        karel.vek = 33;
        Clovek cyril = new Clovek();
        cyril.jmeno = "Cyril Nový";
        cyril.vek = 27;

        // Každý má kamaráda/spřátelení
        karel.kamarad = cyril;
        cyril.kamarad = karel;

        // Představení se
        karel.predstavSe();
        cyril.predstavSe();
    }
}