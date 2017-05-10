package cn.edu.cumt.service;

import java.util.List;

import cn.edu.cumt.dao.GuitarDao;
import cn.edu.cumt.entity.Guitar;

public interface GuitarService {

	/**
	 * ��������
	 * @param guitar
	 * @return
	 */
	public boolean add(Guitar guitar);
	/**
	 * ��ѯ��������
	 * @return
	 */
	public List<Guitar> getAll();
	/**
	 * ���ݱ�Ų�ѯ����
	 * @param serialNumber
	 * @return
	 */
	public Guitar getBySerialNumber(String serialNumber);
	/**
	 * ע��
	 * @param guitarDao
	 */
	void setGuitarDao(GuitarDao guitarDao);
	
}
