package com.ccssoft.rsas.common.spring.exception;

/**
 * <p>����: BeanNotFoundException.java</p>
 * <p>����: Beanû�����쳣</p>
 * <p>Copyright: Copyright (c) 2007</p>
 * @��˾ ��Ѷ���
 * @���� Ф�� 
 * @����ʱ�� 2010-1-11
 * @�޸ļ�¼
 *      ��ʷ�޸ļ�¼��������
 *		�޸�ʱ�䣺YYYY-MM-DD    �޸��ˣ�XXX
 *		�޸�ԭ������ 
 */
public class BeanNotFoundException extends SpringException {

	/** serialVersionUID*/
	private static final long serialVersionUID = 1L;
	
	public BeanNotFoundException(String msg){
		super(msg);
	}

}
