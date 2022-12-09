package eCarnetSante;

public class DoseDeVaccinFactory {
static int id =1;
    public static DoseDeVaccin produirVaccin(typeVaccin vaccin )
    {
       DoseDeVaccin doseDeVaccin = null;
        switch (vaccin)
        {
            case COVID:
                doseDeVaccin = new VaccinCovid(id);
                break;
             
            case PAPILLOMAVIRUS:
            	doseDeVaccin = new VaccinPapillomavirus(id);
                break;
                 
            case FIEVRE_JAUNE:
            	doseDeVaccin = new VaccinFievreJaune(id);
                break;
                 
                default:
                break;
             
        }
        id++;
        return doseDeVaccin;
    }
    
    public static DoseDeVaccin produirVaccin(typeVaccin vaccin, Personne personne )
    {
       DoseDeVaccin doseDeVaccin = null;
        switch (vaccin)
        {
            case COVID:
                doseDeVaccin = new VaccinCovid(id,personne);
                break;
             
            case PAPILLOMAVIRUS:
            	doseDeVaccin = new VaccinPapillomavirus(id,personne);
                break;
                 
            case FIEVRE_JAUNE:
            	doseDeVaccin = new VaccinFievreJaune(id,personne);
                break;
                 
                default:
                break;
             
        }
        id++;
        return doseDeVaccin;
    }
}
 
