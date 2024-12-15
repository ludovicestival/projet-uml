import java.util.List;

/**
 * Représente une partie avec des paramètres :
 * le volume des sons et la langue.
 */
public class Partie {
    private List<Contexte> contextes;
    private int volumeSon;
    private String langue;

    /**
     * Construit une partie avec les paramètres volume du son et la langue.
     * @param volumeSon Le niveau de volume du son du jeu au cours de la partie
     * @param langue La langue du jeu choisi par l'utilisateur
     */
    public Partie(int volumeSon, String langue) {
        // TODO: Écrire le constructeur
    }

    /**
     * Configure les paramètres de le partie.
     */
    public void configurer() {
        // TODO: Implémenter la méthode
    }

    /** 
     * Sauvegarde le contexte courant. 
     */
    public void sauvegarder() {
        // TODO: Implémenter la méthode
    }

    /** 
     * Charge une partie en affichant le contexte courant.
     */
    public void charger() {
        // TODO: Implémenter la méthode
    }
}
