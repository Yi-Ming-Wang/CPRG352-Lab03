
package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author adamw
 */
public class AgeCalculatorServlet extends HttpServlet {
  

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/Style/agecalculator.jsp")
                .forward(request, response);
     
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        String nextBirthDay;
               nextBirthDay = request.getParameter("age");
       
        
         // Check the input condition. 1th layer valiation if is empty ?
    if( nextBirthDay  == null || nextBirthDay.isEmpty()){
        // External front-end exception message 
        request.setAttribute("MESSAGE", "You must give your current age...");
        
        getServletContext().getRequestDispatcher("/Style/agecalculator.jsp").forward(request,response);
        return;
    }
    
     // Check the input condition. 2nd layer valiation if is number ?
     // Note for myself.... DO NOT attempt Try.. CATCH Exception Object here...Since already define <error-page> Attribute in Web.xml....
    // REF : https://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java       
    for (char c : nextBirthDay.toCharArray()){
         if (!Character.isDigit(c))
         {
        // External front-end exception message 
        request.setAttribute("MESSAGE", "You must enter a number...");
        
        getServletContext().getRequestDispatcher("/Style/agecalculator.jsp").forward(request,response);
        return;
         }
             
    }
    
   
    request.setAttribute("MESSAGE","Your age next brithday will be " + (Integer.parseInt(nextBirthDay) + 1)); 
    getServletContext().getRequestDispatcher("/Style/agecalculator.jsp").forward(request,response);
    
  }
        

}
