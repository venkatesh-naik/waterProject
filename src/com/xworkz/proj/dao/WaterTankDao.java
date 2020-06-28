package com.xworkz.proj.dao;

import org.springframework.stereotype.Repository;

import com.xworkz.proj.dto.WaterTanDto;
import com.xworkz.proj.entity.waterTankEntity;

@Repository
public interface WaterTankDao {
	public void save(waterTankEntity dto);

}
