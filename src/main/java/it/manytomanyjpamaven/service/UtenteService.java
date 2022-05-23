package it.manytomanyjpamaven.service;

import java.util.List;

import it.manytomanyjpamaven.dao.RuoloDAO;
import it.manytomanyjpamaven.dao.UtenteDAO;
import it.manytomanyjpamaven.model.Ruolo;
import it.manytomanyjpamaven.model.Utente;

public interface UtenteService {

	public List<Utente> listAll() throws Exception;

	public Utente caricaSingoloElemento(Long id) throws Exception;

	public void aggiorna(Utente utenteInstance) throws Exception;

	public void inserisciNuovo(Utente utenteInstance) throws Exception;

	public void rimuovi(Long idUtente) throws Exception;

	public void aggiungiRuolo(Utente utenteEsistente, Ruolo ruoloInstance) throws Exception;
	
	public void rimuoviRuoloDaUtente(Long idUtente,Long idRuolo) throws Exception;

	public Utente caricaUtenteSingoloConRuoli(Long id) throws Exception;
	
	//- Voglio tutti gli utenti creati a giugno 2021
	public List<Utente> cercaUtentiCreatiAGiugnoDuemilaventuno() throws Exception;
	
//	//- Voglio il numero di utenti admin
//	public int contaQuantiUtentiAdmin() throws Exception;
//	
//	//- Voglio la lista di utenti che abbiano password con meno di 8 caratteri
//	public List<Utente> cercaUtentiConPasswordMinoreDiOttoCaratteri() throws Exception;
//	
//	//- Voglio sapere se tra gli utenti disabilitati c'è qualche admin (se quindi c'è almeno un admin)
//	public boolean cercaSeAlmenoUnUtenteDisabilitatoConRuoloAdmin() throws Exception;

	// per injection
	public void setUtenteDAO(UtenteDAO utenteDAO);
	public void setRuoloDAO(RuoloDAO ruoloDAO);

}
