package com.demo.dto;

import javax.validation.constraints.NotNull;

/**
 * DTO to hide the domain logic and expose data as a REST API
 * @author Ramroum
 *
 */
public class AtomeDto {

	// Validation using @Valid
	@NotNull
	private Long id;

	private String nom;

	private String slug;

	private String electron;

	private Integer numero;

	private String symbole;

	private String infoGroupe;

	private String infoPeriode;

	private String infoBloc;

	private String masseVolumique;

	private String cas;

	private String einecs;

	private String masseAtomique;

	private String rayonAtomique;

	private String rayonCovalence;

	private String rayonVanDerWaals;

	private String configurationElectronique;

	private String etatOxydation;

	private String decouverteAnnee;

	private String decouverteNoms;

	private String decouvertePays;

	private String electroNegativite;

	private String pointFusion;

	private String pointEbullition;
	
	private int isRadioactif;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getElectron() {
		return electron;
	}

	public void setElectron(String electron) {
		this.electron = electron;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getSymbole() {
		return symbole;
	}

	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}

	public String getInfoGroupe() {
		return infoGroupe;
	}

	public void setInfoGroupe(String infoGroupe) {
		this.infoGroupe = infoGroupe;
	}

	public String getInfoPeriode() {
		return infoPeriode;
	}

	public void setInfoPeriode(String infoPeriode) {
		this.infoPeriode = infoPeriode;
	}

	public String getInfoBloc() {
		return infoBloc;
	}

	public void setInfoBloc(String infoBloc) {
		this.infoBloc = infoBloc;
	}

	public String getMasseVolumique() {
		return masseVolumique;
	}

	public void setMasseVolumique(String masseVolumique) {
		this.masseVolumique = masseVolumique;
	}

	public String getCas() {
		return cas;
	}

	public void setCas(String cas) {
		this.cas = cas;
	}

	public String getEinecs() {
		return einecs;
	}

	public void setEinecs(String einecs) {
		this.einecs = einecs;
	}

	public String getMasseAtomique() {
		return masseAtomique;
	}

	public void setMasseAtomique(String masseAtomique) {
		this.masseAtomique = masseAtomique;
	}

	public String getRayonAtomique() {
		return rayonAtomique;
	}

	public void setRayonAtomique(String rayonAtomique) {
		this.rayonAtomique = rayonAtomique;
	}

	public String getRayonCovalence() {
		return rayonCovalence;
	}

	public void setRayonCovalence(String rayonCovalence) {
		this.rayonCovalence = rayonCovalence;
	}

	public String getRayonVanDerWaals() {
		return rayonVanDerWaals;
	}

	public void setRayonVanDerWaals(String rayonVanDerWaals) {
		this.rayonVanDerWaals = rayonVanDerWaals;
	}

	public String getConfigurationElectronique() {
		return configurationElectronique;
	}

	public void setConfigurationElectronique(String configurationElectronique) {
		this.configurationElectronique = configurationElectronique;
	}

	public String getEtatOxydation() {
		return etatOxydation;
	}

	public void setEtatOxydation(String etatOxydation) {
		this.etatOxydation = etatOxydation;
	}

	public String getDecouverteAnnee() {
		return decouverteAnnee;
	}

	public void setDecouverteAnnee(String decouverteAnnee) {
		this.decouverteAnnee = decouverteAnnee;
	}

	public String getDecouverteNoms() {
		return decouverteNoms;
	}

	public void setDecouverteNoms(String decouverteNoms) {
		this.decouverteNoms = decouverteNoms;
	}

	public String getDecouvertePays() {
		return decouvertePays;
	}

	public void setDecouvertePays(String decouvertePays) {
		this.decouvertePays = decouvertePays;
	}

	public String getElectroNegativite() {
		return electroNegativite;
	}

	public void setElectroNegativite(String electroNegativite) {
		this.electroNegativite = electroNegativite;
	}

	public String getPointFusion() {
		return pointFusion;
	}

	public void setPointFusion(String pointFusion) {
		this.pointFusion = pointFusion;
	}

	public String getPointEbullition() {
		return pointEbullition;
	}

	public void setPointEbullition(String pointEbullition) {
		this.pointEbullition = pointEbullition;
	}

	public int getIsRadioactif() {
		return isRadioactif;
	}

	public void setIsRadioactif(int isRadioactif) {
		this.isRadioactif = isRadioactif;
	}

	
}
