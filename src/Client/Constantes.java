package Client;

/**Creation des Constantes utilisees dans {@link Controleurs.ControleurExterne} et {@link Controleurs.ControleurInterne}.
 * Correspond au {@link Requetes.Requete#libelle} d'une {@link Requetes.Requete}.
 * @author p14005728
 * @see Requetes.Requete
 */
public abstract class Constantes {
	
	/**correspond au {@link Requetes.Requete#libelle} "HAUT" d'une {@link Requetes.Requete}
	 * 
	 */
	public static final int HAUT        = 0;
	
	/**correspond au {@link Requetes.Requete#libelle} "BAS" d'une {@link Requetes.Requete}
	 * 
	 */
	public static final int BAS         = 1;
	
	/**correspond au {@link Requetes.Requete#libelle} "STOP" d'une {@link Requetes.Requete}
	 * 
	 */
	public static final int STOP        = 2;
	
	/**correspond au {@link Requetes.Requete#libelle} "DEPLACEMENT" d'une {@link Requetes.Requete}
	 * 
	 */
	public static final int DEPLACEMENT = 3;
	
	/**Permet d'obtenir la {@link String} correspondant a une constante.
	 * @param i la constante dont on veut la {@link String}.
	 * @return la {@link String} correspondant a la constante i.
	 * @see Constantes
	 */
	public static String toString (int i) {
		switch (i) {
		case 0 :
			return "Up";
		case 1 :
			return "Down";
		case 2 :
			return "Stop";
		case 3 :
			return "Movement";
		}
		return "Inconnue";
	}
}
