package com.xworkz.proj.service;

import org.springframework.stereotype.Service;

import com.xworkz.proj.dto.WaterTanDto;

@Service
public interface WaterTankService {
	public String save(WaterTanDto dto);

}
