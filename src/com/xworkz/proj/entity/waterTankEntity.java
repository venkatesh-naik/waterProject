package com.xworkz.proj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@ToString
@Table(name="Water_Tank")
public class waterTankEntity implements Serializable{
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	
	@Column(name="id")
	private Integer id;
	@Column(name = "area")
	private String area;
	@Column(name = "nol")
	private Integer nol;

}
