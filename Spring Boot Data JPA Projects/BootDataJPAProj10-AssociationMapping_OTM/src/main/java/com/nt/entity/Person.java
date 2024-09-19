package com.nt.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="OTM_Person_Info")
@Setter
@Getter
@RequiredArgsConstructor

public class Person {

	@Id
	@SequenceGenerator(name="gen1",sequenceName = "otm_person_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer pId;
	@NonNull
	private String pName;
	@NonNull
	private String pAdd;
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,mappedBy = "personInfo",fetch = FetchType.LAZY)
	private Set<PhoneNumber> phoneNumbers;
	
	
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pAdd=" + pAdd + "]";
	}


	public Person() {
		//System.out.println("Person::0-param-constructor");
		
	}


	public Person(Integer pId, @NonNull String pName, @NonNull String pAdd) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pAdd = pAdd;
	}


	public Person(Integer pId, @NonNull String pName, @NonNull String pAdd, Set<PhoneNumber> phoneNumbers) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pAdd = pAdd;
		this.phoneNumbers = phoneNumbers;
	}
	
}
