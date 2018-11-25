package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="assets")
public class Asset implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String code;
	
	private String name;
	
	private int category;
	
	private String feature;
	
	private int price;
	
	@Column(name="startyear")
	private int startYear;
	
	@Column(name="usingperson")
	private String usingPerson;
	
	@Column(name="dep_rate")
	private int depRate;
	
	@Column(name="dep_year")
	private int depYear;
	
	@ManyToOne
	@JoinColumn(name="country_id")
	private Country country;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name="producer_id")
	private Producer producer;
	
}
