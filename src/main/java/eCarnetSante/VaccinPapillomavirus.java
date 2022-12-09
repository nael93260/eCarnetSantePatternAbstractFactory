package eCarnetSante;

public class VaccinPapillomavirus extends DoseDeVaccin  {

	public VaccinPapillomavirus(int idDoseVaccin) {
		super("Pappillomavirus", idDoseVaccin);
	}

	@Override
	int getNbDosesShemaVaccinalComplet() {
		return 2;
	}

}
