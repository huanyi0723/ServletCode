package com.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/Servlet/TheradDemo
public class TheradDemo extends HttpServlet {
	//servlet�Ķ��̲߳�������
	
	int count = 1;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		synchronized (TheradDemo.class) {//���������Ψһ������ʹ�������
			response.getWriter().write("�������ǵ�ǰ��վ�ĵ�"+count+"���ÿ�");   //�߳�1ִ����  �� �߳�2ִ��
		
		//�߳�1��û��ִ��count++
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
			count++;
		}
	}

}
