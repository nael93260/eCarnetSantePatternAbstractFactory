package testsfonctionnels;

import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import eCarnetSante.*;

public class DoseDeVaccinSteps {
	private Personne nael;
	private Personne bernard;
	private Personne jean;
	private DoseDeVaccin vaccinCovid;
	int nbDoseVaccin =0;
	
	@Given("une personne que l on veut vacciner contre la covid")
	public void une_personne_que_l_on_veut_vacciner_contre_la_covid() {
	    // Write code here that turns the phrase above into concrete actions
	    nael = new Personne ();
	    vaccinCovid =  new DoseDeVaccin("Covid-19", 123);
	}

	@When("elle se fait vacciner contre la covid")
	public void elle_se_fait_vacciner_contre_la_covid() {
	    // Write code here that turns the phrase above into concrete actions
	    nael.ajouterDoseDeVaccin(vaccinCovid);
	}

	@Then("le vaccin est dans sa liste de vaccins")
	public void le_vaccin_est_dans_sa_liste_de_vaccins() {
	    assertTrue(nael.getListeDesVaccins().contains(vaccinCovid));
	}

	
	@Given("une personne qui a recu toutes les doses  necessaire pour un vaccin contre la Covid")
	public void une_personne_qui_a_recu_toutes_les_doses_necessaire_pour_un_vaccin_contre_la_Covid() {
		bernard = new Personne ();
		DoseDeVaccin vaccinCovid1ereDose =  new DoseDeVaccin("Covid-19", 1234);
		DoseDeVaccin vaccinCovid2eDose =  new DoseDeVaccin("Covid-19", 12345);
		DoseDeVaccin vaccinCovid3eDose =  new DoseDeVaccin("Covid-19", 12346);
		bernard.ajouterDoseDeVaccin(vaccinCovid1ereDose);
		bernard.ajouterDoseDeVaccin(vaccinCovid2eDose);
		bernard.ajouterDoseDeVaccin(vaccinCovid3eDose);
		
	}

	@When("je regarde le nombre de doses de vaccin injectees dans la liste des des doses de vaccins de Bernard")
	public void je_regarde_le_nombre_de_doses_de_vaccin_injectees_dans_la_liste_des_des_doses_de_vaccins_de_Bernard() {
		for (DoseDeVaccin doseDeVaccin : bernard.getListeDesVaccins() ) {
	    	if (doseDeVaccin.getAgentInfextieux().equals("Covid-19")) {
	    		nbDoseVaccin++;
	    	}
		}
		assertTrue(nbDoseVaccin>0);
	}

	@Then("je verifie que le nombre de doses de vaccin injectees correspond bien au {int} pour le vaccin contre la Covid")
	public void je_verifie_que_le_nombre_de_doses_de_vaccin_injectees_correspond_bien_au_pour_le_vaccin_contre_la_Covid(Integer int1) {
		assertTrue(nbDoseVaccin==int1);
	}

	@Given("une personne qui a recu toutes les doses  necessaire pour un vaccin contre la Papillomavirus")
	public void une_personne_qui_a_recu_toutes_les_doses_necessaire_pour_un_vaccin_contre_la_Papillomavirus() {
		nael = new Personne ();
		nbDoseVaccin=0;
		DoseDeVaccin vaccinPapillomavirus1ereDose =  new DoseDeVaccin("Papillomavirus", 1);
		DoseDeVaccin vaccinPapillomavirus2eDose =  new DoseDeVaccin("Papillomavirus", 2);
		nael.ajouterDoseDeVaccin(vaccinPapillomavirus1ereDose);
		nael.ajouterDoseDeVaccin(vaccinPapillomavirus2eDose);
	}
	
	@When("je regarde le nombre de doses de vaccin injectees dans la liste des des doses de vaccins de Nael")
	public void je_regarde_le_nombre_de_doses_de_vaccin_injectees_dans_la_liste_des_des_doses_de_vaccins_de_Nael() {
		for (DoseDeVaccin doseDeVaccin : nael.getListeDesVaccins() ) {
	    	if (doseDeVaccin.getAgentInfextieux().equals("Papillomavirus")) {
	    		nbDoseVaccin++;
	    	}
		}
		assertTrue(nbDoseVaccin>0);
	}

	@Then("je verifie que le nombre de doses de vaccin injectees correspond bien au {int} pour le vaccin contre la Papillomavirus")
	public void je_verifie_que_le_nombre_de_doses_de_vaccin_injectees_correspond_bien_au_pour_le_vaccin_contre_la_Papillomavirus(Integer int1) {
		assertTrue(nbDoseVaccin==int1);
	}



	@Given("une personne qui a recu toutes les doses  necessaire pour un vaccin contre la Fievre jaune")
	public void une_personne_qui_a_recu_toutes_les_doses_necessaire_pour_un_vaccin_contre_la_Fievre_jaune() {
		jean = new Personne ();
		nbDoseVaccin=0;
		DoseDeVaccin vaccinFievreJaune1ereDose =  new DoseDeVaccin("Fievre jaune", 1);
		jean.ajouterDoseDeVaccin(vaccinFievreJaune1ereDose);
		
	}
	
	@When("je regarde le nombre de doses de vaccin injectees dans la liste des des doses de vaccins de Jean")
	public void je_regarde_le_nombre_de_doses_de_vaccin_injectees_dans_la_liste_des_des_doses_de_vaccins_de_Jean() {
		for (DoseDeVaccin doseDeVaccin : jean.getListeDesVaccins() ) {
	    	if (doseDeVaccin.getAgentInfextieux().equals("Fievre jaune")) {
	    		nbDoseVaccin++;
	    	}
		}
		assertTrue(nbDoseVaccin>0);
	}

	@Then("je verifie que le nombre de doses de vaccin injectees correspond bien au {int} pour le vaccin contre la Fievre jaune")
	public void je_verifie_que_le_nombre_de_doses_de_vaccin_injectees_correspond_bien_au_pour_le_vaccin_contre_la_Fievre_jaune(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(nbDoseVaccin==int1);
	}
	

}
