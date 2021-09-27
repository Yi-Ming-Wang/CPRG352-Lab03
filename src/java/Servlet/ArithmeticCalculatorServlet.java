/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class ArithmeticCalculatorServlet extends HttpServlet {

    

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
      getServletContext().getRequestDispatcher("/Style/arithmeticcalculator.jsp").forward(request,response);
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
         String first;
         String second;
         String action;
         boolean flag = false;
         String checkNums;
                first = request.getParameter("first");
                second = request.getParameter("second");
                checkNums = first + second;
                action = request.getParameter("action");
         request.setAttribute("FIRST",first);
         request.setAttribute("SECOND",second);
        
         
         // NO Calculation performed same as no inputs.... Checking if var is empty string.
         if(first.isEmpty() && second.isEmpty())
         {
              request.setAttribute("MESSAGE","---");
              getServletContext().getRequestDispatcher("/Style/arithmeticcalculator.jsp").forward(request,response);
              return;
         }    
         
         
         // Validation on blank textbox or text as per request of simple run of part 2 EX3.
         if(first == null || first.isEmpty() || second  == null || second.isEmpty())
         {
              flag = true;
         } 
         // Validation on invalid data type input as per request of simple run of part 2 EX4.
         else
         {
             for (char c : checkNums.toCharArray())
            {
                   if (!Character.isDigit(c))
                    {
                      flag = true;
                    }
             
            }  
                  
         }       
         if(flag){
              // External front-end exception message 
                        request.setAttribute("MESSAGE", "Invalid...");
        
                        getServletContext().getRequestDispatcher("/Style/arithmeticcalculator.jsp").forward(request,response);
                        return;
         }     
             
         if(action.equals("+")){
             request.setAttribute("MESSAGE",Integer.toString((Integer.parseInt(first) + Integer.parseInt(second)))); 
             
             getServletContext().getRequestDispatcher("/Style/arithmeticcalculator.jsp").forward(request,response);
                        
         } 
         if(action.equals("-")){
             request.setAttribute("MESSAGE",Integer.toString((Integer.parseInt(first) - Integer.parseInt(second)))); 
             
             getServletContext().getRequestDispatcher("/Style/arithmeticcalculator.jsp").forward(request,response);
                        
         } 
         if(action.equals("*")){
             request.setAttribute("MESSAGE",Integer.toString((Integer.parseInt(first) * Integer.parseInt(second)))); 
             
             getServletContext().getRequestDispatcher("/Style/arithmeticcalculator.jsp").forward(request,response);
                        
         }    
         if(action.equals("%")){
             request.setAttribute("MESSAGE",Integer.toString((Integer.parseInt(first) % Integer.parseInt(second)))); 
             
             getServletContext().getRequestDispatcher("/Style/arithmeticcalculator.jsp").forward(request,response);
                        
         }
         
         
            
           
    }

  

}
