package com.honeywords.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.honeywords.dao.RegistrationDao;
import com.honeywords.db.EMailer;
import com.honeywords.dto.Profilebean;



public class RegistrationServlet extends HttpServlet {

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
		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String loginid=request.getParameter("uid");
		String password=request.getParameter("pass");
		String username=request.getParameter("uname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mob");
		String gender=request.getParameter("g");
		String address=request.getParameter("uaddress");	
		String role=request.getParameter("role");
		
		String petname=request.getParameter("petname");
		String age=request.getParameter("age");
		String fruit=request.getParameter("fruit");
		String yob=request.getParameter("yob");
		
		
		Random rn = new Random();
		char ch[]={'@','!','#','$','%','&','*','+','?','|'};
		
		int i1 = rn.nextInt(10);
		int i2 = rn.nextInt(10);
		int i3= rn.nextInt(10);
		int i4= rn.nextInt(10);
		int i5 = rn.nextInt(10);
		int j = rn.nextInt(999);
		char randomNum1 = ch[i1];
		char randomNum2 = ch[i2];
		char randomNum3 = ch[i3];
		char randomNum4 = ch[i4];
		char randomNum5 = ch[i5];
		
		String honey1=username+randomNum1+age;
		String honey2=petname+randomNum2+yob;
		String honey3=fruit+randomNum3+j;
		String honey4=petname+randomNum4+fruit;
		String honey5=petname+fruit+randomNum5+yob;

		String email1="bedarullaskar@gmail.com";
		String details="<strong>Userid:</strong>"+loginid+"\n<br/><strong>HoneyWord1:</strong>"+honey1+"\n<br/><strong>HoneyWord2:</strong>"+honey2+"\n <br/><strong>HoneyWord3:</strong>"+honey3+"\n<br/> <strong>HoneyWord4:</strong>"+honey4+"\n<br/><strong>HoneyWord5:</strong>"+honey5+"\n<br/><strong>Dont Share Honey Key Words With Any One </strong>";
				
		System.out.println("EMAIL===="+details);
		//String mail=request.getParameter("email");
		EMailer.send("bedarullaskar@gmail.com","Green1@hkd",email1,"Your Secrete key details",details);
		
		
		
		/*String role="Admin";*/
				
		Profilebean pb=new Profilebean();
		
		pb.setLoginid(loginid);
		pb.setPassword(password);
		pb.setUsername(username);
		pb.setEmail(email);
		pb.setMobileno(mobile);
		pb.setGender(gender);
		pb.setAddress(address);		
		pb.setRole(role);
		pb.setHoney1(honey1);
		pb.setHoney2(honey2);
		pb.setHoney3(honey3);
		pb.setHoney4(honey4);
		pb.setHoney5(honey5);
		
		RegistrationDao rdao=new RegistrationDao();
		try{
		int i=rdao.register(pb);
			
		if(i!=0){
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp?status=Registration Successfully Completed");
			rd.include(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("Registration.jsp?status=Registration Faild Plz Try Again");
			rd.include(request, response);
		}
		}
		catch (Exception e) {
			RequestDispatcher rd=request.getRequestDispatcher("Registration.jsp?status=Registration Faild Plz Try Again");
			rd.include(request, response);
		}
		}
	}

