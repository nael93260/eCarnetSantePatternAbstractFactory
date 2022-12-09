package eCarnetSante;

public class VaccinCovid extends DoseDeVaccin{

	public VaccinCovid(int idDoseVaccin) {
		super("Covid-19", idDoseVaccin);
	}
	
	public VaccinCovid(int idDoseVaccin, Personne personne) {
		super(personne,"Covid-19", idDoseVaccin);
	}

	@Override
	int getNbDosesShemaVaccinalComplet() {
		return 3;
		
	}

}
