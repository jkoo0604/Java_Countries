package com.jkoo.countries.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Country {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
	private String name;
    private String continent;
    private String region;
    private double surface_area;
    private short indep_year;
    private int population;
    private double life_expectancy;
    private double gnp;
    private double gnp_old;
    private String local_name;
    private String government_form;
    private String head_of_state;
    private int capital;
    private String code2;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    @OneToMany(cascade=CascadeType.ALL, mappedBy="country", fetch = FetchType.LAZY)
    private List<Language> languages;
    @OneToMany(cascade=CascadeType.ALL, mappedBy="country", fetch = FetchType.LAZY)
    private List<City> cities;
    

    public Country() {
	}
    
    
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContinent() {
		return continent;
	}


	public void setContinent(String continent) {
		this.continent = continent;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public double getSurface_area() {
		return surface_area;
	}


	public void setSurface_area(double surface_area) {
		this.surface_area = surface_area;
	}


	public short getIndep_year() {
		return indep_year;
	}


	public void setIndep_year(short indep_year) {
		this.indep_year = indep_year;
	}


	public int getPopulation() {
		return population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}


	public double getLife_expectancy() {
		return life_expectancy;
	}


	public void setLife_expectancy(double life_expectancy) {
		this.life_expectancy = life_expectancy;
	}


	public double getGnp() {
		return gnp;
	}


	public void setGnp(double gnp) {
		this.gnp = gnp;
	}


	public double getGnp_old() {
		return gnp_old;
	}


	public void setGnp_old(double gnp_old) {
		this.gnp_old = gnp_old;
	}


	public String getLocal_name() {
		return local_name;
	}


	public void setLocal_name(String local_name) {
		this.local_name = local_name;
	}


	public String getGovernment_form() {
		return government_form;
	}


	public void setGovernment_form(String government_form) {
		this.government_form = government_form;
	}


	public String getHead_of_state() {
		return head_of_state;
	}


	public void setHead_of_state(String head_of_state) {
		this.head_of_state = head_of_state;
	}


	public int getCapital() {
		return capital;
	}


	public void setCapital(int capital) {
		this.capital = capital;
	}


	public String getCode2() {
		return code2;
	}


	public void setCode2(String code2) {
		this.code2 = code2;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


	public List<Language> getLanguages() {
		return languages;
	}


	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}


	public List<City> getCities() {
		return cities;
	}


	public void setCities(List<City> cities) {
		this.cities = cities;
	}


	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	

}