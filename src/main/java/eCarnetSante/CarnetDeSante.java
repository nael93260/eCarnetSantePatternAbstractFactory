package eCarnetSante;


import java.util.ArrayList;

/**
 *La classe CarnetDeSante permet d'attribuer un et un seul carnet de santé à une personne si elle le désire 
 *
 * @author (Nael TALBI)
 */
public class CarnetDeSante
{
    private Personne personne;
    

    /**
     * Constructeur d'objets de classe CarnetDeSante
     */
    public CarnetDeSante(Personne personne)
    {
        // initialisation des variables d'instance
       Personne.verifSiPersonneNull(personne);
        this.personne=personne;
        personne.setCarnetDeSante(this);
    }
    
    public String lireInterpretationIMC () {
        double valeurIMC = this.personne.calculIMC();
        String interpretationIMC;
        
        if (valeurIMC < 18.5) { interpretationIMC = "maigreur"; }
        else if (valeurIMC < 25) { interpretationIMC= "normal"; }
        else if (valeurIMC < 30) { interpretationIMC= "surpoids"; }
        else { interpretationIMC= "obese"; } 
        
        return interpretationIMC;
    }
    
    /**
     * Permet de verifier si le schema vaccinal est complet pour un dit vaccin et une dite personne
     * @param le vaccin pour lequel on verifie si le schema vaccinal est complet 
	 * @return true si c est le cas sinon false
	 */
    public boolean verifierSchemaVaccinalComplet(DoseDeVaccin vaccin) {
    	if( personne.getNbDoseVaccin(vaccin)== vaccin.getNbDosesShemaVaccinalComplet()){
    		return true;
    	}
    	return false;
    }

}
