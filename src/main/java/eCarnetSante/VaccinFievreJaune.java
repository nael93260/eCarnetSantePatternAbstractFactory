package eCarnetSante;

public class VaccinFievreJaune extends DoseDeVaccin {

	public VaccinFievreJaune(int idDoseVaccin) {
		super("Fievre jaune", idDoseVaccin);
		// TODO Auto-generated constructor stub
	}

	@Override
	int getNbDosesShemaVaccinalComplet() {
		return 1;
	}

}
