package eCarnetSante;

public class DoseDeVaccinFactory {
static int id =1;
    static DoseDeVaccin produirVaccin(typeVaccin vaccin )
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
}
 
