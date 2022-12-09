package eCarnetSante;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * La classe Personne décrit une personne et dievrs carractéristiques qui lui sont propres
 * Une Personne peut avoir un seul carnet de santé et une ou plusieurs doseDeVaccins pour un même virus (mais les doses sont forcément différentes (car identifiable par un id et jetée une fois utilisée)
 * @author (Nael TALBI)
 */
public class Personne
{
    // variables d'instance avec la taille en mètres et le poids en kilogrammes
    private double taille;
    private double poids;
    private CarnetDeSante carnetDeSante;
    private ArrayList<DoseDeVaccin>listeDesVaccins;

    /**
     * Par defaut on donne les carractéristique physique d'un des français
     * qui bat les records d'infection de la covid 19 : Nael 
     */
    public Personne()
    {
        // initialisation des variables d'instance
        this.taille=1.83;
        this.poids=79;
        listeDesVaccins= new ArrayList<DoseDeVaccin>();
    }
    
    public Personne(double taille, double poids)
    {
        // initialisation des variables d'instance
        this.taille=taille;
        this.poids=poids;
        listeDesVaccins= new ArrayList<DoseDeVaccin>();
    }
    
    /**
     * Permet d'ajouter une dose de vaccin à la personne.
     *
     */
	public void ajouterDoseDeVaccin(DoseDeVaccin doseDeVaccin) {
		//Si une dites doseDeVaccin à déjà été administrée à une personne , la même dose ne peut pas avoir été administrée une autre fois à la même
		//personne ni à qui que ce soit d'autre dailleurs. 
		if(!this.getListeDesVaccins().contains(doseDeVaccin)) {
			this.getListeDesVaccins().add(doseDeVaccin);
			doseDeVaccin.setPersonne(this);
		}
		else throw new IllegalStateException("Une même dose ne peut pas avoir été injectée deux fois");
	
	}
    
  
    public static void verifSiPersonneNull(Personne personne) {
		if(personne==null){
            throw new IllegalArgumentException("Veuillez associer une personne");
        }
    }
    
    /**
     * Permet de connaître la liste des vaccins de la personne 
     *
     * @return     la liste
     */
	public ArrayList<DoseDeVaccin> getListeDesVaccins() {

		return listeDesVaccins;
	}
	
	public int getNbDoseVaccin (DoseDeVaccin dose) {
		int nbDoseVaccin=0;
		for (DoseDeVaccin doseDeVaccin : this.getListeDesVaccins() ) {
	    	if (doseDeVaccin.getAgentInfextieux().equals(dose.getAgentInfextieux())) {
	    		nbDoseVaccin++;
	    	}
		}
		return nbDoseVaccin;
	}
		

    /**
     * Permet de connaître la taille de la personne 
     *
     * @return     la taille de la personne 
     */
    public double getTaille()
    {
        return this.taille;
    }
    
      /**
     * Permet de connaître le poids de la personne 
     *
     * @return     le poids de la personne 
     */
    public double getPoids()
    {
        return this.poids;
    }
    
    /**
     * Permet de modifier la taille d'une person 
     *
     */
    public void setTaille(double newTaille)
    {
        this.taille=newTaille;
    }
    
    /**
     * Permet de modifier le poids de la personne 
     */
    public void setPoids(double newPoids)
    {
        this.poids=newPoids;
    }
    
      /**
     * Permet d'attribuer un carnet de santé à une personne
     */
    public void setCarnetDeSante(CarnetDeSante newCarnetDeSante)
    {
        this.carnetDeSante=newCarnetDeSante;
    }
    
     /**
     * Permet d'accèder au carnet de santé d'une personne
     */
    public CarnetDeSante getCarnetDeSante()
    {
        return this.carnetDeSante;
    }
    
    /**
     * Permet de connaître la valeur de l'indice de masse corporelle d'une 
     * personne (IMC)
     *
     * @return     la valeur de l'IMC avec une decimale
     */
    public double calculIMC()
    {
        double imc = this.poids/(this.taille*this.taille);
        return (double)Math.round(imc * 10d) / 10d;
    
    }


    
    
}
