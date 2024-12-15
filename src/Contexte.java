import java.util.List;

/**
 * Représente un contexte, c'est-à-dire un texte
 * qui explique ce qu'il se passe dans l'histoire.
 * Un contexte possède un texte et une liste de choix
 * associés.
 */
public class Contexte {
    private List<Choix> choix;
    private String texteContexte;

    /**
     * Construit un contexte avec son texte associé
     * @param texteContexte Le texte du contexte
     */
    public Contexte(String texteContexte) {
        // TODO: Écrire le constructeur
    }

    /**
     * Affiche le texte du contexte et ses choix.
     */
    public void afficherContexte() {
        // TODO: Implémenter la méthode
    }
}