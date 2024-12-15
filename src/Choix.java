/**
 * Représente un choix de l'histoire avec un texte
 * et le contexte suivant si le joueur choisit ce choix.
 */
public class Choix {
    private String texteChoix;
    private Contexte contexteSuivant;

    /**
     * Construit un choix avec son texte, et le contexte suivant associé à ce choix
     * @param texteChoix le texte du choix
     * @param contexteSuivant le contexte suivant associé à ce choix
     */
    public Choix(String texteChoix, Contexte contexteSuivant) {
        // TODO: Écrire le constructeur
    }

    /**
     * Affiche le choix.
     */
    public void afficherChoix() {
        // TODO: Implémenter la méthode
    }

    /**
     * Sélectionne ce choix en renvoyant le prochain Contexte.
     */
    public Contexte selectionner() {
        // TODO: Implémenter la méthode
    }
}