Gestion des Cartes Bancaires et Paiements 

 Ce projet vise à développer un système de gestion des cartes bancaires permettant aux 
clients de demander et d’utiliser des cartes de paiement pour effectuer des achats et des 
retraits. L’application offre une interface de suivi des transactions en temps réel et un 
système de gestion des limites de dépenses. 
Une des principales fonctionnalités de cette application est l’authentification sécurisée des 
transactions. Lorsqu’un client effectue un paiement en ligne ou un retrait, il doit entrer un 
code PIN, et un système de double authentification (OTP par SMS ou e-mail) sera mis en 
place pour sécuriser certaines transactions à haut risque. 
Le projet intègre également un système de cashback et de récompenses. À chaque 
paiement effectué avec la carte, le client peut cumuler des points de fidélité qui pourront 
être échangés contre des remises ou des cadeaux. Une gestion des abonnements sera aussi 
disponible, permettant aux clients de lier leur carte à des services récurrents (Netflix, 
Spotify, etc.), avec possibilité de visualiser et d’annuler ces abonnements depuis 
l’application. 
Une section gestion des litiges permettra aux clients de signaler un paiement frauduleux ou 
erroné. Une équipe administrative pourra examiner ces requêtes et prendre des décisions 
(remboursement, enquête, etc.). 
Enfin, l’application offrira une intégration avec des comptes bancaires pour permettre le 
rechargement automatique des cartes via virement ou prélèvement programmé. 

 
 Modèle de Base de Données : 
• Client (id, nom, prénom, email, téléphone, adresse, date_inscription) 
• CarteBancaire (id, numero, cvv, date_expiration, solde, statut, client_id, 
limite_journalière, cashback) 
• Transaction (id, type (paiement/retrait), montant, date, carte_id, commerçant, statut 
(validé/rejeté)) 
• AuthentificationTransaction (id, transaction_id, code_otp, statut, date_generation) 
• Abonnement (id, carte_id, service, montant, date_prelevement, statut 
(actif/annulé)) 
• Litige (id, transaction_id, motif, date_signalement, statut, admin_id) 
• Fidélité (id, client_id, points_acquis, date_dernier_credit) 
• Admin (id, username, password, role) 


Fonctionnalités : 
Demande et gestion des cartes bancaires, avec activation et suspension. 
Effectuer des paiements en ligne et des retraits d’argent sécurisés. 
Vérification des transactions avec double authentification (OTP, PIN). 
Gestion des plafonds de dépenses pour limiter l’usage de la carte. 
Historique des transactions, avec statut de validation ou de rejet. 
Gestion des abonnements, avec possibilité de les résilier facilement. 
Système de fidélité et cashback, avec cumuls de points pour chaque paiement. 
Signalement des fraudes et gestion des litiges avec suivi de réclamations. 
Recharge automatique des cartes à partir des comptes bancaires. 
Dashboard administrateur avec analyse des transactions suspectes.
