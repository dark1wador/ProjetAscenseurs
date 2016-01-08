package Client;
import java.util.ArrayList;

import Boutons.BoutonExterne;
import Boutons.BoutonInterne;
import Controleurs.ControleurExterne;
import Controleurs.ControleurInterne;
import IHM.FenetreConfiguration;
import IHM.FenetreBatiment;

public class Main {

	public static void main(String[] args) {
		Batiment batim = new Batiment("Hotel", 5);
		ArrayList<ControleurInterne> controleursInt = new ArrayList<ControleurInterne>();
		
		ControleurExterne controleurExterne = ControleurExterne.getControleurExterne();
		
		Ascenseur asc1 = new Ascenseur (batim, 1);
		Ascenseur asc2 = new Ascenseur (batim, 2);
		FenetreConfiguration fen = new FenetreConfiguration();
		System.out.println(asc1.toString());
		
		ControleurInterne controleur1 = new ControleurInterne(asc1);
		ControleurInterne controleur2 = new ControleurInterne(asc2);
		controleursInt.add(controleur1);
		controleursInt.add(controleur2);
		
		asc1.getListeBoutons().get(3).appuyer(controleur1);
		asc2.getListeBoutons().get(5).appuyer(controleur2);
		controleur1.traiterRequetes();
		controleur2.traiterRequetes();
		System.out.println(asc1.toString());
		System.out.println(asc2.toString());
		
		batim.getListeBoutons().get(0).appuyer(controleurExterne);
		batim.getListeBoutons().get(8).appuyer(controleurExterne);
		controleurExterne.traiterRequetes(controleursInt);
		
		System.out.println(controleur1.toString());
		System.out.println(controleur2.toString());
		for (ControleurInterne i : controleursInt) {
			i.traiterRequetes();
		}
		
		System.out.println(asc1.toString());
		System.out.println(asc2.toString());
		System.out.println(batim.toString());
		ArrayList<BoutonInterne> listeBoutonsAsc1 = new ArrayList<BoutonInterne>();
		ArrayList<BoutonExterne> listeBoutonsBatim = new ArrayList<BoutonExterne>();
		
		System.out.println("Ascenceur :");
		
		listeBoutonsAsc1 = asc1.getListeBoutons();
		for (BoutonInterne i : listeBoutonsAsc1){
			System.out.println(i.getLibelle());
		}
		
		System.out.println("Batiment :");
		
		listeBoutonsBatim = batim.getListeBoutons();
		for (BoutonExterne i : listeBoutonsBatim){
			System.out.println(i.toString());
		}
		
	}

}

