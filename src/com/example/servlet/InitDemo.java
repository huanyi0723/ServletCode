package com.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

//http://localhost:8080/Servlet/InitDemo
public class InitDemo extends HttpServlet {
	//�в�����init���޲ε�init����
	
	/**
	 * �в�����init����
	 * �÷�����servlet���������ڷ�����һ���ᱻtomcat����������
	 */
	/**
	 * ע�⣺���Ҫ��д��ʼ���룬����Ҫ�����в�����init����
	 */
	/*@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("�в�����init����");
	}*/
	
	/**
	 * �޲�����init����
	 * �÷�����servlet�ı�д��ʼ������ķ�������Sun��˾��Ƴ���ר�Ÿ������߽��и��ǣ�Ȼ���������дservlet�ĳ�ʼ�߼�����ķ�����
	 */
	@Override
	public void init() throws ServletException {
		System.out.println("�޲�����init����");
	}
	

}
