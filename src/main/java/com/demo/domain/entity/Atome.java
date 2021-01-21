package com.demo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity for mapping Table 'demo.atome'
 * 
 * @author Ramroum
 *
 */
@Entity
@Table(name = "atome", schema = "demo")
public class Atome {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "slug")
	private String slug;

	@Column(name = "electron")
	private String electron;

	@Column(name = "numero")
	private Integer numero;

	@Column(name = "symbole")
	private String symbole;

	@Column(name = "info_groupe")
	private String infoGroupe;

	@Column(name = "info_periode")
	private String infoPeriode;

	@Column(name = "info_bloc")
	private String infoBloc;

	@Column(name = "masse_volumique")
	private String masseVolumique;

	@Column(name = "cas")
	private String cas;

	@Column(name = "einecs")
	private String einecs;

	@Column(name = "masse_atomique")
	private String masseAtomique;

	@Column(name = "rayon_atomique")
	private String rayonAtomique;

	@Column(name = "rayon_de_covalence")
	private String rayonCovalence;

	@Column(name = "rayon_de_van_der_waals")
	private String rayonVanDerWaals;

	@Column(name = "configuration_electronique")
	private String configurationElectronique;

	@Column(name = "etat_oxydation")
	private String etatOxydation;

	@Column(name = "decouverte_annee")
	private String decouverteAnnee;

	@Column(name = "decouverte_noms")
	private String decouverteNoms;

	@Column(name = "decouverte_pays")
	private String decouvertePays;

	@Column(name = "electronegativite")
	private String electroNegativite;

	@Column(name = "point_de_fusion")
	private String pointFusion;

	@Column(name = "point_d_ebullition")
	private String pointEbullition;

	@Column(name = "is_radioactif")
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
