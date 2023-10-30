/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.school.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ma.school.beans.Machine;
import ma.school.beans.Marque;
import ma.school.service.MachineService;
import ma.school.service.MarqueService;

/**
 *
 * @author a
 */
@WebServlet(name = "MachineController", urlPatterns = {"/MachineController"})
public class MachineController extends HttpServlet {

    MarqueService ms = new MarqueService();
    MachineService mms = new MachineService();
        String op = null;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void init()
            throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        op = null;
       
    }
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         op = request.getParameter("op");
        if (op.equalsIgnoreCase("envoyer")) {
            String ref = request.getParameter("ref");
            double prix = Double.parseDouble(request.getParameter("prix"));
            Date dateAchat = new Date(request.getParameter("dateAchat").replace("-", "/"));
            Marque marque = ms.findById(Integer.parseInt(request.getParameter("marque")));
            mms.create(new Machine(ref, dateAchat, prix, marque));
            response.sendRedirect("machineForm.jsp");
        } else if (op.equalsIgnoreCase("delete")) {
            mms.delete(mms.findById(Integer.parseInt(request.getParameter("id"))));
            response.sendRedirect("machineForm.jsp");
        } else if (op.equals("update")) {
            int id = Integer.parseInt(request.getParameter("id"));
            Machine ma = mms.findById(id);
            RequestDispatcher dispatcher = request.getRequestDispatcher("machineForm.jsp");
            request.setAttribute("machine", ma);
            dispatcher.forward(request, response);;
        } else if (op.equals("Apply")) {
    int id = Integer.parseInt(request.getParameter("machineId"));
    Machine ma = mms.findById(id);
    String ref = request.getParameter("ref");
    double prix = Double.parseDouble(request.getParameter("prix"));
    Date dateAchat = new Date(request.getParameter("dateAchat").replace("-", "/"));
    Marque marque = ms.findById(Integer.parseInt(request.getParameter("marque")));
    ma.setReference(ref);
    ma.setPrix(prix);
    ma.setDateAchat(dateAchat);
    ma.setMarque(marque);
    mms.update(ma);
    response.sendRedirect("machineForm.jsp");
}
    }
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
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
