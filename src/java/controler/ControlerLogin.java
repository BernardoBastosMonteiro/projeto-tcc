/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.UsuarioDTO;
import model.dao.UsuarioDAO;

/**
 *
 * @author Senai
 */
public class ControlerLogin extends HttpServlet {

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
        String nextpage = "/WEB-INF/jsp/login.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextpage);
        dispatcher.forward(request, response);
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
        String url = request.getServletPath();
        if (url.equals("/signup")) {
            String nextPage = "/WEB-INF/jsp/login.jsp";
            UsuarioDTO user = new UsuarioDTO();
            UsuarioDAO valida = new UsuarioDAO();

            user.setNome(request.getParameter("nome"));
            user.setEmail(request.getParameter("email"));
            user.setSenha(request.getParameter("senha"));

            valida.cadastrar(user);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
            dispatcher.forward(request, response);

        } else if (url.equals("/signin")) {
            String nextPage = "/WEB-INF/jsp/index.jsp";
            UsuarioDTO user = new UsuarioDTO();

            user.setEmail(request.getParameter("email"));
            user.setSenha(request.getParameter("senha"));

            UsuarioDAO userD = new UsuarioDAO();
            user = userD.buscarLogin(user);
            if (user.getIdUsuario() > 0) {
                if (user.getStatus() == 2) {
                    // redirecionar para página de admin
                    response.sendRedirect("./HomeController");
                } else {
                    // redirecionar para página de usuario
                    response.sendRedirect("./controlerAdm");
                }
            } else {
                request.setAttribute("erroMensagem", "Erro ao realizar Login");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
                dispatcher.forward(request, response);
            }
        } else {
            processRequest(request, response);
        }
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
