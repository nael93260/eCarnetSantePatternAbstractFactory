#Author: Nael TALBI

Feature: US_002 Gestion des doses de vaccins
 
  En tant que medecin je veux pouvoir vacciner et suivre la vaccination de mes patiens afin de savoir si ils sont a jour dans leur vaccins 

  Scenario: Vacciner une personne contre la covid 
    Given une personne que l on veut vacciner contre la covid
    When elle se fait vacciner contre la covid
    Then le vaccin est dans sa liste de vaccins 

  Scenario Outline: Verifier la completion du schema vaccinal d une personne 
    Given une personne qui a recu toutes les doses  necessaire pour un vaccin contre la <maladie>
    When je regarde le nombre de doses de vaccin injectees dans la liste des des doses de vaccins de <personne>
    Then je verifie que le nombre de doses de vaccin injectees correspond bien au <nbDosesVaccinRecues> pour le vaccin contre la <maladie>

    Examples: 
      | personne  | maladie						|	nbDosesVaccinRecues  			|
      | Bernard 	|	Covid							|	3													|	
      | Nael 			| Papillomavirus 		| 2    											|
      | Jean 			| Fievre jaune 			| 1    											|
   
      