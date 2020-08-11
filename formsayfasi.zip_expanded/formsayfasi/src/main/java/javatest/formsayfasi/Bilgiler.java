package javatest.formsayfasi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bilgiler {
private Long id;
private String isim_soyadi;
private String tc_kimlik;
private String adres;
private String e_posta;
private String dogumtarihi;
private String perakende_cevap;
private String telefon;
private String tercih_sebebi;
private String yer_tercihi;
private String yatirim_miktari;
private String ek_text;
protected Bilgiler() {
	super();
	
}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getIsim_soyadi() {
	return isim_soyadi;
}

public void setIsim_soyadi(String isim_soyadi) {
	this.isim_soyadi = isim_soyadi;
}
public String getTc_kimlik() {
	return tc_kimlik;
}
public void setTc_kimlik(String tc_kimlik) {
	this.tc_kimlik = tc_kimlik;
}
public String getAdres() {
	return adres;
}
public void setAdres(String adres) {
	this.adres = adres;
}

public String getTelefon() {
	return telefon;
}
public void setTelefon(String telefon) {
	this.telefon = telefon;
}
public String getE_posta() {
	return e_posta;
}
public void setE_posta(String e_posta) {
	this.e_posta = e_posta;
}

public String getDogumtarihi() {
	return dogumtarihi;
}
public void setDogumtarihi(String dogumtarihi) {
	this.dogumtarihi = dogumtarihi;
}
public String getPerakende_cevap() {
	return perakende_cevap;
}
public void setPerakende_cevap(String perakende_cevap) {
	this.perakende_cevap = perakende_cevap;
}
public String getTercih_sebebi() {
	return tercih_sebebi;
}
public void setTercih_sebebi(String tercih_sebebi) {
	this.tercih_sebebi = tercih_sebebi;
}
public String getYer_tercihi() {
	return yer_tercihi;
}
public void setYer_tercihi(String yer_tercihi) {
	this.yer_tercihi = yer_tercihi;
}

public String getYatirim_miktari() {
	return yatirim_miktari;
}
public void setYatirim_miktari(String yatirim_miktari) {
	this.yatirim_miktari = yatirim_miktari;
}
public String getEk_text() {
	return ek_text;
}
public void setEk_text(String ek_text) {
	this.ek_text = ek_text;
}

}
