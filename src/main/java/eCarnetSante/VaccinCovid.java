package eCarnetSante;

public class VaccinCovid extends DoseDeVaccin{

	public VaccinCovid(int idDoseVaccin) {
		super("Covid-19", idDoseVaccin);
		// TODO Auto-generated constructor stub
	}

	@Override
	int getNbDosesShemaVaccinalComplet() {
		return 3;
		
	}

}
