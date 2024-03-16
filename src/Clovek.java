
/**
 * Reprezentuje člověka
 */
public class Clovek {

    /**
     * Celé jméno
     */
    public String jmeno;

    /**
     * Věk
     */
    public int vek;

    /**
     * Kamarád
     */
    public Clovek kamarad;

    /**
     * Vypíše text, ve kterém se člověk představí
     */
    public void predstavSe() {
        System.out.printf("Ahoj, já jsem %s, je mi %d let a můj kamarád je %s%n", jmeno, vek, kamarad.jmeno);
    }


}
