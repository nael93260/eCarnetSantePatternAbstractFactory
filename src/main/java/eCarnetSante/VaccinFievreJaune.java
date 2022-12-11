package eCarnetSante;

public class VaccinFievreJaune extends DoseDeVaccin {

	public VaccinFievreJaune(int idDoseVaccin) {
		super("Fievre jaune", idDoseVaccin);
	}
	
	public VaccinFievreJaune(int idDoseVaccin,Personne personne) {
		super(personne,"Fievre jaune", idDoseVaccin);
	}

	@Override
	public int getNbDosesShemaVaccinalComplet() {
		return 1;
	}

}
