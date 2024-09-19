package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "Marriage_Seeker_Large_Object_Data")
public class MarriageSeeker {

	@Column(name = "Seeker_Id")
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer sId;
    @Column(name="Seeker_name",length = 25)
    @NonNull
	private String sName;
    @Column(name="Seeker_Add",length = 35)
    @NonNull
	private String sAdd;
    @NonNull
	private Boolean isIndian;
    @NonNull
	@Lob
	@Column(length=27000)
	private byte[] photo;
    @NonNull
	@Lob
	@Column(length=1254)
	private char[] resume;

}
