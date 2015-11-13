package com.github.jskarulis.dealsentry;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country implements Serializable {

	private static final long serialVersionUID = -1801714432822866390L;

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	  
	  @Column(name="country_code", nullable = false)
	  private String countryCode;
	  
	  @Column(name="country_name", nullable = false)
	  private String countryName;
	  
	  @Column(name="country_description", nullable = false)
	  private String countryDescription;
	  
	  protected Country(){
	    
	  }
	  
	  public Country(String countryCode, String countryName, String countryDescription){
	    this.countryCode = countryCode;
	    this.countryName = countryName;
	    this.countryDescription = countryDescription;
	  }
	  
	  public String toString(){
	    StringBuilder builder = new StringBuilder();
	    builder.append(this.getId()).append(", ")
	      .append(this.getCountryCode()).append(", ")
	      .append(this.getCountryName()).append(", ")
	      .append(this.getCountryDescription()).append(", ");
	    
	    return builder.toString();
	  }

	  public long getId() {
	    return id;
	  }

	  public void setId(long id) {
	    this.id = id;
	  }
	  
	  public String getCountryCode() {
		    return countryCode;
		  }

	  public void setCountryCode(String countryCode) {
	    this.countryCode = countryCode;
	  }
	  
	  public String getCountryName() {
		    return countryName;
		  }

	  public void setCountryName(String countryName) {
	    this.countryName = countryName;
	  }
	  
	  public String getCountryDescription() {
	    return countryDescription;
	  }

	  public void setCountryDescription(String countryDescription) {
	    this.countryDescription = countryDescription;
	  }

}