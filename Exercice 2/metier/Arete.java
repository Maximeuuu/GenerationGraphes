/** Auteur : Equipe 1
  * Date   : juin 2023
*/

/*Paquetage*/
package graphe.metier;

/*Importations*/
import java.awt.Color;

public class Arete
{
	/*Attributs*/
	private Point   depart;
	private Point   arrivee;
	private int     cout;
	private Color   couleur;

	/*Constructeur*/
	public Arete(Point depart, Point arrivee, int cout)
	{
		this.depart  = depart;
		this.arrivee = arrivee;
		this.cout    = cout;

		this.depart .ajouterArete(this);
		this.arrivee.ajouterArete(this);
	}

	/*Modifieurs*/
	public boolean setCouleur(Color c)
	{
		if (c == null) return false;

		this.couleur = c;
		return true;
	}

	/*Accesseurs*/
	public Point getPointDepart () { return this.depart ; }
	public Point getPointArrivee() { return this.arrivee; }
	public int   getCout        () { return this.cout   ; }
	public Color getCouleur     () { return this.couleur; }

	/*Méthodes*/
	public String toString()
	{
		return String.format("%s:%s", this.depart.getId(), this.arrivee.getId());
	}


	public boolean pointIdentique (Arete a)
	{
		System.out.println (a);
		System.out.println (a.getPointArrivee() == this.getPointArrivee() ||
		                    a.getPointArrivee() == this.getPointDepart () ||
		                    a.getPointDepart()  == this.getPointArrivee() ||
		                    a.getPointDepart()  == this.getPointDepart () );
		System.out.println();

		return a.getPointArrivee() == this.getPointArrivee() ||
		       a.getPointArrivee() == this.getPointDepart () ||
		       a.getPointDepart()  == this.getPointArrivee() ||
		       a.getPointDepart()  == this.getPointDepart () ;
	}
}
