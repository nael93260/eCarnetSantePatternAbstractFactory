#Author: Nael TALBI

Feature: US_001 Gestion des carracteristiques physisiques d une personne 

  En tant que medecin , je veux pouvoir modifier le poids et la taille d une personne lorsque ses caracteristiques physiques changent 

  Scenario: Prendre du poids
    Given une personne dont le poids a augmente
    When elle prend du poids 
    Then son poids est modifie avec le nombre de kilos en plus 
    
  Scenario: Perdre du poids
  Given une personne dont le poids a diminue
  When elle perd du poids 
  Then son poids est modifie avec le nombre de kilos en moins
  
  Scenario: Grandir
  Given une personne dont la taille a augmente
  When elle gagne des centimetres  
  Then sa taille est modifiee avec le nombre de centimetre en plus
  
  Scenario: Se tasser 
	Given une personne dont la taille a diminue
  When elle perd des centimetres  
  Then sa taille est modifiee avec le nombre de centimetre en moins 
  
