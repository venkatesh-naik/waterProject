package com.xworkz.proj.service.Impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.xworkz.proj.dao.WaterTankDao;
import com.xworkz.proj.dto.WaterTanDto;
import com.xworkz.proj.entity.waterTankEntity;
import com.xworkz.proj.service.WaterTankService;

@Service
public class WaterTankServiceImpl implements WaterTankService {

	@Autowired
	 private WaterTankDao dao;
	
	
	@Override
	public String save(WaterTanDto dto) {
		System.out.println("invoked save");
		System.out.println("stating validation.........");

		boolean validation = false;
		if (!StringUtils.isEmpty(dto.getArea())) {
			System.out.println("valid area");
			validation = true;
		} else {
			return "area is required";
		}
		if (validation && !StringUtils.isEmpty(dto.getNol())) {
			System.out.println("valid nol");
			validation = true;
		} else {
			return "nol is required";
		}

		if (validation) {
			System.out.println("started storing data to db.......");
			
			try {
				waterTankEntity entity=new waterTankEntity();
				BeanUtils.copyProperties(dto, entity);
				dao.save(entity);
				
				
			}catch (Exception e) {
				System.out.println("err in storng service layer"+e.getMessage());
			}


		}
		return null;
	}
}
