package com.xworkz.proj.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.xworkz.proj.dao.WaterTankDao;
import com.xworkz.proj.entity.waterTankEntity;

import lombok.Setter;

@Repository
@Setter
public class WaterTankDaoImpl implements WaterTankDao {
	private SessionFactory factory;

	@Override
	public void save(waterTankEntity dto) {
		System.out.println("started to save.......");
		Session session = factory.openSession();

		try {
			session.beginTransaction();
			session.save(dto);
			session.getTransaction().commit();

		} catch (HibernateException e) {
			System.out.println("error in save" + e.getMessage());
			session.getTransaction().rollback();
		}finally {
			session.close();
		}

	}
	public SessionFactory getFactory() {
		return factory;
	}
}
