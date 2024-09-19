package com.nt.entity;


import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Customer_Info_JPA_JODA")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Customer {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer cId;
@NonNull
private String cName;
@NonNull
private String cAdd;
@NonNull
private LocalDateTime dob; 
@NonNull
private LocalTime orderTime;

}
