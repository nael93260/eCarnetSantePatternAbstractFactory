package eCarnetSante;


import java.util.Objects;

/**
* La classe des doses de vaccin qui sont administrees a des personnes.
* Une dites dose de vaccin est administree a une seule personne, elle est identifiable precisement par son id qui est unique .
*@author (Nael TALBI)
*/

public abstract class DoseDeVaccin {


	private Personne personne;
	private String agentInfectieux;
	private int idDoseVaccin;
	
	public DoseDeVaccin(Personne personne, String agentInfectieux,int idDoseVaccin) {
		this.agentInfectieux = agentInfectieux;
		this.idDoseVaccin=idDoseVaccin;
		this.setPersonne(personne);
	}
	public DoseDeVaccin(String agentInfectieux,int idDoseVaccin) {
		this.agentInfectieux = agentInfectieux;
		this.idDoseVaccin=idDoseVaccin;
	}
	
	/**
	 * @return le le nombre de doses de vaccin necessaires pour avoir un shema complet.
	 */
	public abstract int getNbDosesShemaVaccinalComplet();
	
	/**
	 * Permet de donner une dose du vaccin a une personne 
	 * @param personne
	 */
	
	public void setPersonne(Personne personne) {
		Personne.verifSiPersonneNull(personne);
		
		if(!personne.getListeDesVaccins().contains(this)) {
			personne.ajouterDoseDeVaccin(this);
			this.personne = personne;
		}
		this.personne=personne;
	}
	
	/**
	 * 
	 * @return La personne qui a recu cette Dose De Vaccin .
	 */
	
	public Personne getPersonne() {
		return this.personne;
	}
	
	/**
	 * La Dose De Vaccin a un nom qui correspond a  celui du virus contre lequel elle vaccine.
	 * @return le nom de l agent Infectieux que contient la dose de vaccin.
	 */
	
	public String getAgentInfextieux() {
		return agentInfectieux;
	}
	
	/**
	 * 
	 * @return La personne qui a recu cette Dose De Vaccin .
	 */
	
	public int getId() {
		return this.idDoseVaccin;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agentInfectieux == null) ? 0 : agentInfectieux.hashCode());
		result = prime * result + idDoseVaccin;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoseDeVaccin other = (DoseDeVaccin) obj;
		if (agentInfectieux == null) {
			if (other.agentInfectieux != null)
				return false;
		} else if (!agentInfectieux.equals(other.agentInfectieux))
			return false;
		if (idDoseVaccin != other.idDoseVaccin)
			return false;
		return true;
	}
	
	
	
}
