package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IndividualDAO;
import dto.bookDTO;

/**
 * Servlet implementation class Bookservlet1
 */
@WebServlet("/Bookservlet1")
public class Bookservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bookservlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 request.setCharacterEncoding("UTF-8");
	        
			String name = request.getParameter("name");
			String tyosya = request.getParameter("tyosya");
			String syuppan = request.getParameter("syuppan");
			int Isbn= Integer.parseInt(request.getParameter("Isbn"));
			
			// 入力された情報を元にインスタンスを生成
			bookDTO book = new bookDTO (name,tyosya,syuppan,Isbn);
			
			// SQL実行
			int result = IndividualDAO.regibook(book);
			
			if(result == 1) {
				String view = "WEB-INF/view/book1.jsp";
				RequestDispatcher dispatcher = request.getRequestDispatcher(view);
				dispatcher.forward(request, response);
			} else {
				String view = "WEB-INF/view/book2.jsp";
				RequestDispatcher dispatcher = request.getRequestDispatcher(view);
				dispatcher.forward(request, response);
			}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
