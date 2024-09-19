package com.nt.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Table(name = "MTO_PhoneNumber_Info")
@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor

public class PhoneNumber {

	public PhoneNumber() {
		// System.out.println("PhoneNumber::0-param-constructor");
	}

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "mto_phoneNumber_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer regNo;
	@NonNull
	private Long number;
	@NonNull
	private String provider;

	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Person_Id", referencedColumnName = "pId")
	private Person personInfo;

	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", number=" + number + ", provider=" + provider + "]";
	}
}
