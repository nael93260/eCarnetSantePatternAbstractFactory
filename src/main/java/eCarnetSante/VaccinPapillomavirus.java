package eCarnetSante;

public class VaccinPapillomavirus extends DoseDeVaccin  {

	public VaccinPapillomavirus(int idDoseVaccin) {
		super("Papillomavirus", idDoseVaccin);
	}

	public VaccinPapillomavirus(int idDoseVaccin,Personne personne) {
		super(personne,"Papillomavirus", idDoseVaccin);
	}
	
	@Override
	int getNbDosesShemaVaccinalComplet() {
		return 2;
	}

}
