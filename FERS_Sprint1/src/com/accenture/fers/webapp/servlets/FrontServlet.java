//package com.accenture.fers.webapp.servlets;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.accenture.fers.webapp.controllers.*;
//
///**
// * Servlet implementation class FrontServlet2
// */
//@WebServlet("/*.do")
//public class FrontServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	private Map<String, IController> controllers;
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public FrontServlet() {
//        super();
//        controllers = new HashMap<>();
//    	controllers.put("/register.do", new NewVisitorController());
//    	controllers.put("/login.do", new SearchVisitorController());
//    	controllers.put("/updateVisitor.do", new UpdateVisitorController());
//    	controllers.put("/eventUnreg.do", new EventUnregController());
//    	controllers.put("/eventReg.do", new EventRegController());
//    	controllers.put("/displayView.do", new DisplayViewController());
//    	controllers.put("/changePassword.do", new ChangePasswordController());
//    	controllers.put("/logoutController.do", new LogoutController());
//        // TODO Auto-generated constructor stub
//    }
//    
//    
//    private void process(HttpServletRequest request, HttpServletResponse response) {
//		IController controller;
//		String view;
//
//        controller = controllers.get(request.getServletPath());
//        view = controller.process(request, response);
//
//        RequestDispatcher dispatcher = request.getRequestDispatcher(view+".jsp");
//
//		if (dispatcher != null) {
//			try {
//				dispatcher.forward(request, response);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		process(request,response);
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		process(request,response);
//	}
//
//}
