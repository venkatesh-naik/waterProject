package com.xworkz.proj.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WaterTanDto implements Serializable{
	private Integer id;
	private String area;
	private Integer nol;

}
