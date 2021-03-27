/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.CompanyDAO;
import dao.MachineDAO;
import entity.Company;
import entity.Machine;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Zuy Fun
 */
@WebServlet(name = "HomeController", urlPatterns = {"/HomeController"})
public class HomeController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            Company c = new CompanyDAO().getInfor();
            c.setLongDes(c.getLongDes().substring(0, 150));
            request.setAttribute("company", c);
            int totalMachine = new MachineDAO().getTotalMachineInHomePage();
            int pageSize = 6;
            int maxPage = totalMachine / pageSize;
            if (totalMachine % pageSize != 0) {
                maxPage++;
            }
            String page_index = request.getParameter("pageIndex");
            int pageIndex = 1;
            if (page_index != null) {
                pageIndex = Integer.parseInt(page_index);
            }
            List<Machine> listM = new MachineDAO().getMachineByPagingInHomePage(pageIndex, pageSize);
            request.setAttribute("listM", listM);
//            List<Share> listS = new ShareDAO().getShare();
//            request.setAttribute("listS", listS);
            request.setAttribute("maxPage", maxPage);
            request.getRequestDispatcher("HomePage.jsp").forward(request, response);
        } catch (IOException | NumberFormatException | ServletException e) {
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
