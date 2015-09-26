package com.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/Servlet/ForwardDemo1
public class ForwardDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/**
		 * �������ݵ�request�����
		 */
		request.setAttribute("name", "rose");

		// ת��
		/**
		 * ע�⣺����ת����ǰwebӦ���������Դ��
		 */
		/*
		 * RequestDispatcher rd =
		 * this.getServletContext().getRequestDispatcher("/GetDataServlet");
		 * rd.forward(request, response);
		 */
		getServletContext().getRequestDispatcher("/GetDataServlet").forward(request, response);
	}

}
