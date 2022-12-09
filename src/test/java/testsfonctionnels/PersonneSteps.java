package testsfonctionnels;

import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import eCarnetSante.Personne;

public class PersonneSteps {
	private Personne enfant;
	private Personne adolescent;
	private Personne vieillard;
	private double variationPoids = 20;
	private double variationTaille = 4;
	
	@Given("une personne dont le poids a augmente")
	public void une_personne_dont_le_poids_a_augmente() {
	    enfant = new Personne ();
	}

	@When("elle prend du poids")
	public void elle_prend_du_poids() {
		enfant.setPoids(enfant.getPoids()+variationPoids);
	}

	@Then("son poids est modifie avec le nombre de kilos en plus")
	public void son_poids_est_modifie_avec_le_nombre_de_kilos_en_plus() {
		assertTrue(new Personne().getPoids() + variationPoids==enfant.getPoids());
	}

	@Given("une personne dont le poids a diminue")
	public void une_personne_dont_le_poids_a_diminue() {
		enfant = new Personne ();
	}

	@When("elle perd du poids")
	public void elle_perd_du_poids() {
		enfant.setPoids(enfant.getPoids()-variationPoids);
	}

	@Then("son poids est modifie avec le nombre de kilos en moins")
	public void son_poids_est_modifie_avec_le_nombre_de_kilos_en_moins() {
		assertTrue(new Personne().getPoids() - variationPoids==enfant.getPoids());
	}

	@Given("une personne dont la taille a augmente")
	public void une_personne_dont_la_taille_a_augmente() {
		adolescent = new Personne ();
	}

	@When("elle gagne des centimetres")
	public void elle_gagne_des_centimetres() {
		adolescent.setTaille(adolescent.getTaille()+variationTaille);
	}

	@Then("sa taille est modifiee avec le nombre de centimetre en plus")
	public void sa_taille_est_modifiee_avec_le_nombre_de_centimetre_en_plus() {
		assertTrue(new Personne().getTaille() + variationTaille==adolescent.getTaille());
	}

	@Given("une personne dont la taille a diminue")
	public void une_personne_dont_la_taille_a_diminue() {
		vieillard = new Personne ();
	}

	@When("elle perd des centimetres")
	public void elle_perd_des_centimetres() {
		vieillard.setTaille(vieillard.getTaille()-variationTaille);
	}

	@Then("sa taille est modifiee avec le nombre de centimetre en moins")
	public void sa_taille_est_modifiee_avec_le_nombre_de_centimetre_en_moins() {
		assertTrue(new Personne().getTaille() - variationTaille==vieillard.getTaille());
	}
}
