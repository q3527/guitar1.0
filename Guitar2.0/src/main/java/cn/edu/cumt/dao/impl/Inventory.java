package cn.edu.cumt.dao.impl;

import java.util.LinkedList;
import java.util.List;

import cn.edu.cumt.dao.GuitarDao;
import cn.edu.cumt.dao.impl.GuitarDaoImpl;
import cn.edu.cumt.entity.Guitar;
import cn.edu.cumt.entity.GuitarSpec;
import cn.edu.cumt.service.GuitarService;
import cn.edu.cumt.service.impl.GuitarServiceImpl;

public class Inventory {
	
		private List<Guitar> guitars;
		
		public Inventory() {
			guitars = new LinkedList<Guitar>();
		}
	
		/**
		 * ��Ӽ���
		 * @param serialNumber
		 * @param price
		 * @param builder
		 * @param model
		 * @param type
		 * @param backWood
		 * @param topWood
		 */
		public void addGuitar(String serialNumber, double price,
		              GuitarSpec spec) {
			Guitar guitar = new Guitar(serialNumber, price, spec);
			
			GuitarDao guitarDao = new GuitarDaoImpl();
			
			GuitarService guitarService = new GuitarServiceImpl();
			
			guitarService.setGuitarDao(guitarDao);
			guitarService.add(guitar);
			guitars.add(guitar);
		}
		/**
		 * ��ѯ����
		 * @param serialNumber ���
		 * @return
		 */
		public Guitar getGuitar(String serialNumber) {
			 for (Guitar guitar : guitars) {
				   if (guitar.getSerialNumber().equals(serialNumber)) {
					   return guitar;
				   }
			 }
		  return null;
		}
	  /**
	   * ���б�������������Ϣ
	   * @param searchSpec �����ļ�����Ϣ
	   * @return
	   */
	  public List<Guitar> search(GuitarSpec searchSpec) {
		  //������������ļ�����Ϣ
		  List<Guitar> matchingGuitars = new LinkedList<Guitar>();
		  //���������б�
		  for ( Guitar guitar : guitars ) {
			  if (guitar.getSpec().matches(searchSpec))
			        matchingGuitars.add(guitar);
		  }
		  return matchingGuitars;
	  }

	public List<Guitar> getGuitars() {
		return guitars;
	}

	public void setGuitars(List<Guitar> guitars) {
		this.guitars = guitars;
	}
	  
}
