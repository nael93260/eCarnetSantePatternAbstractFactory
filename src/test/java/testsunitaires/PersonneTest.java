package testsunitaires;
import eCarnetSante.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PersonneTest
{
    private Personne pers;
    private CarnetDeSante carnetDeSante;
    private DoseDeVaccin vaccinCovid;
	private DoseDeVaccin vaccinPapillomavirus;
	private DoseDeVaccin vaccinFievreJaune;
    
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        pers = new Personne();
        carnetDeSante = new CarnetDeSante(pers);
    }
    
    public void changeScenarioMaigre () {
    	pers.setPoids(50);
        pers.setTaille(1.85);
    }
    public void changeScenarioSurpoids () {
    	pers.setPoids(95);
        pers.setTaille(1.87);
    }
    public void changeScenarioObese () {
    	pers.setPoids(150);
        pers.setTaille(1.50);
    }

    /**
     * IMC verifié sur le site : https://www.topsante.com/outils/imc
     */
    @Test
    public void testCalculIMC() // throws java.lang.Exception
    {
        assertEquals(23,6, pers.calculIMC());
        changeScenarioMaigre();
        assertEquals(14,6, pers.calculIMC());        
        
    }
    
     /**
     * IMC verifié sur le site : https://www.topsantey.com/outils/imc
     */
    @Test
    public void testLireInterpretationIMC() // throws java.lang.Exception
    {
        assertEquals("normal", pers.getCarnetDeSante().lireInterpretationIMC());
        changeScenarioObese();
        assertEquals("obese", pers.getCarnetDeSante().lireInterpretationIMC());
        changeScenarioMaigre();
        assertEquals("maigreur", pers.getCarnetDeSante().lireInterpretationIMC());
        changeScenarioSurpoids();
        assertEquals("surpoids", pers.getCarnetDeSante().lireInterpretationIMC());

        
    }
    
    
    public void setUpDoseDeVaccin () {
    	vaccinCovid = DoseDeVaccinFactory.produirVaccin(typeVaccin.COVID, pers);
    	vaccinPapillomavirus = DoseDeVaccinFactory.produirVaccin(typeVaccin.PAPILLOMAVIRUS, pers);
    	vaccinFievreJaune = DoseDeVaccinFactory.produirVaccin(typeVaccin.FIEVRE_JAUNE, pers);
    }

    /**
    * Verifie que l'on ne puisse pas ajouter deux doses identique veirifie la multiplicité 0..1
    */
   @Test
   public void testPasPlusDuneDoseIdentique() // throws java.lang.Exception
   {
   DoseDeVaccin d1 = DoseDeVaccinFactory.produirVaccin(typeVaccin.PAPILLOMAVIRUS);
   int idVaccin=d1.getId();
   pers.ajouterDoseDeVaccin(d1);
   DoseDeVaccin d2 = new VaccinPapillomavirus(idVaccin);
   try {
	   pers.ajouterDoseDeVaccin(d2);
	   fail( "My method didn't throw when I expected it to" );
	} catch (IllegalStateException expectedException) {
	}
   
   }
   /**
    * Verifie que l'on puisse ajouter des doses différentes et que celles-ci soient bien contenuent
    * dans la liste des vaccins de la personne concernée
    */
   @Test
   public void testAjouterDosesDifferentes(){
		setUpDoseDeVaccin();
		assertTrue(pers.getListeDesVaccins().contains(vaccinCovid));
		assertTrue(pers.getListeDesVaccins().contains(vaccinPapillomavirus));
		assertTrue(pers.getListeDesVaccins().contains(vaccinFievreJaune));
   }
}
