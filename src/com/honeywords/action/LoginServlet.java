package com.honeywords.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.honeywords.dao.Attackdao;
import com.honeywords.dao.Logindao;
import com.honeywords.db.EMailer;
import com.honeywords.dto.Profilebean;



public class LoginServlet extends HttpServlet {

	int count=0;
	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname=request.getParameter("uid");
		String password=request.getParameter("pass");
		int length=password.length();
		String honeyword=request.getParameter("honeyword");
		String role=null;
		String username=null;
		String status=null;
		String mail=null;
		String honey1=null;
		String honey2=null;
		String honey3=null;
		String honey4=null;
		String honey5=null;
		
		Profilebean pb=new Profilebean();
		pb.setLoginid(uname);
		pb.setPassword(password);
		Attackdao adao=new Attackdao();

		if(length>=8){
		Logindao ld=new Logindao();
		try{
		
			ArrayList<Profilebean> list=ld.datauserlogin(pb);
		
			for(Profilebean p:list){
			 role=p.getRole();
			 username=p.getUsername();
			 status=p.getStatus();
			 honey1=p.getHoney1();
			 honey2=p.getHoney2();
			 honey3=p.getHoney3();
			 honey4=p.getHoney4();
			 honey5=p.getHoney5();			 		 
			 
		}
		if("Admin".equals(role)){
			
			HttpSession session=request.getSession();
			session.setAttribute("uname", uname);
			session.setAttribute("username", username);
			
			RequestDispatcher rd=request.getRequestDispatcher("AdminHome.jsp");
			rd.include(request, response);
			
		}
		
		else if("User".equals(role)&& status.equals("Active")&& honeyword.equals(honey1)){
		/*else if("User".equals(role)){*/
			
			HttpSession session=request.getSession();
			session.setAttribute("uname", uname);
			session.setAttribute("username", username);
			
			RequestDispatcher rd=request.getRequestDispatcher("UserHome.jsp");
			rd.include(request, response);
			
		}
		else if("User".equals(role)&& status.equals("Active")&& honeyword.equals(honey2)){
			/*else if("User".equals(role)){*/
				
				HttpSession session=request.getSession();
				session.setAttribute("uname", uname);
				session.setAttribute("username", username);
				
				RequestDispatcher rd=request.getRequestDispatcher("UserHome.jsp");
				rd.include(request, response);
				
			}
		else if("User".equals(role)&& status.equals("Active") && honeyword.equals(honey3)){
			/*else if("User".equals(role)){*/
				
				HttpSession session=request.getSession();
				session.setAttribute("uname", uname);
				session.setAttribute("username", username);
				
				RequestDispatcher rd=request.getRequestDispatcher("UserHome.jsp");
				rd.include(request, response);
				
			}
		else if("User".equals(role)&& status.equals("Active") && honeyword.equals(honey4)){
			/*else if("User".equals(role)){*/
				
				HttpSession session=request.getSession();
				session.setAttribute("uname", uname);
				session.setAttribute("username", username);
				
				RequestDispatcher rd=request.getRequestDispatcher("UserHome.jsp");
				rd.include(request, response);
				
			}
		else if("User".equals(role)&& status.equals("Active") && honeyword.equals(honey5)){
			/*else if("User".equals(role)){*/
				
				HttpSession session=request.getSession();
				session.setAttribute("uname", uname);
				session.setAttribute("username", username);
				
				RequestDispatcher rd=request.getRequestDispatcher("UserHome.jsp");
				rd.include(request, response);
				
			}
        else if("User".equals(role)&& status.equals("Pending")){
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp?status=Your Request is in Pending");
			rd.include(request, response);
			
		}       
		
		else {
			count++;
			if(count==1){
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp?status=Invalid Userid And Password");
			rd.include(request, response);
			}
			if(count>=2){
				String email1="bedarullaskar@gmail.com";
				String details="<strong>No.Of Times Attempts:</strong>"+count+"\n<br/><strong>Some Body Try to Login Your Account Please Check and Please Protect Your Account</strong>";
						
				System.out.println("EMAIL===="+details);
				//String mail=request.getParameter("email");
				EMailer.send("bedarullaskar@gmail.com","Green1@hkd",email1,"Your Secrete key details",details);
				
				int i=adao.dosattack(pb);
				RequestDispatcher rd=request.getRequestDispatcher("Login.jsp?status=Invalid Userid And Password");
				rd.include(request, response);
			}
		  }
		}
		
		catch (Exception e) {
			
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp?status=Some Internal Problem");
			rd.include(request, response);
			
		}
		}
		else {
			String email1="bedarullaskar@gmail.com";
			String details="<strong>Some Body Try to Login Your Account Please Check and Please Protect Your Account</strong>";
					
			System.out.println("EMAIL===="+details);
			//String mail=request.getParameter("email");
			EMailer.send("bedarullaskar@gmail.com","Green1@hkd",email1,"Your Secrete key details",details);
			
			int i=adao.bruteforceattack(pb);
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp?status=Please Enter Correct password......Password Too Short");
			rd.include(request, response);
		}
		
	}

}
