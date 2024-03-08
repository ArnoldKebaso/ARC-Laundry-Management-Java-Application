package com.servlet;

import java.io.IOException;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.DBconnect.ConnectionMySql;
import com.Models.Order;

/**
 * Servlet implementation class UpdateOrderServlet
 * 
 * @author Oshadi
 */
@WebServlet("/UpdateOrderServlet")
public class UpdateOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
     * @param request
     * @param response
     * @throws jakarta.servlet.ServletException
     * @throws java.io.IOException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
     * @param request
     * @param response
     * @throws jakarta.servlet.ServletException
     * @throws java.io.IOException
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		if(session.getAttribute("E_NIC")!=null){
			/*Works only when Employee logged in*/
			
			Order order=new Order();
			/*set all the order details to setters */
			order.setRecieptNo(request.getParameter("receiptno"));
			order.setNIC(request.getParameter("nic"));
			order.setWeight(request.getParameter("weight"));
			order.setRate(request.getParameter("rate"));
	
	
			try {	/*calling the mysql connection class*/
					ConnectionMySql db=new ConnectionMySql();
					Connection conn=db.getCon();
					
					/*get all the order details through getters */
			        String receiptno=order.getRecieptNo();
			        String nic=order.getNIC();	
					String weight=order.getWeight();
					String rate=order.getRate();
					String date=request.getParameter("date");
					
					double rte=Double.parseDouble(rate);//convert string to double
		        	double wei = Double.parseDouble(weight);//convert string to double
		        	double payment=wei*rte;
		        	String fullpayment = String.valueOf(payment);//convert double to string
					
					String query = "UPDATE LaundryOrder SET E_NIC='"+session.getAttribute("E_NIC")+"',C_NIC='"+nic+"',O_Weight='"+weight+"',O_Date='"+date+"',O_Payment='"+fullpayment+"' WHERE O_ID='"+receiptno+"' ";
					Statement stmt= conn.createStatement();
			        int i=stmt.executeUpdate(query);
			        
			        request.setAttribute("NIC",nic);
		        	request.setAttribute("RecieptId",receiptno);
		        	request.setAttribute("Date",date);
		        	request.setAttribute("Payment",fullpayment);
			        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ShowOrder.jsp");
		            requestDispatcher.forward(request, response);
			} catch (Exception e) {
			       System.err.println(e);
			    }
		   
		}else {
			/*Works only when Employee isn't logged in*/
			response.sendRedirect("Login.jsp");
		}
		
	}

}
