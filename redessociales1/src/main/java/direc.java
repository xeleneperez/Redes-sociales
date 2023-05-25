import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class direc extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion=req.getParameter("accion");
        System.out.println(accion);
    
        switch (accion) {
            case "whatsapp":
            req.getRequestDispatcher("resources/views/whatsapp.jsp").forward(req, resp);
                break;
            case"instagram":
            req.getRequestDispatcher("resources/views/instagram.jsp").forward(req, resp);
               break;
            case"inicio":
            req.getRequestDispatcher("resources/views/inicio.jsp").forward(req, resp);
            break;
            case"iniciow":
            req.getRequestDispatcher("resources/views/whatsapp.jsp").forward(req, resp);
            break;
            case "index":
             req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;
            case "usuario":
            req.getRequestDispatcher("resources/views/usuario.jsp").forward(req, resp);
            break;
            case"ingresar":
            req.getRequestDispatcher("resources/views/ingresar.jsp").forward(req, resp);
            break;  

            default:
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String enviar=req.getParameter("enviar");
        switch (enviar) {
            case "inicio":
                String usuario="xelene";
                String contrasena="12345";
                String usuario1=req.getParameter("usuario");
                String contrasena1=req.getParameter("contrasena");
                if (usuario1.equals(usuario) && contrasena1.equals(contrasena)) {
                    req.getRequestDispatcher("resources/views/usuario.jsp").forward(req, resp);
                }
                else{
                    req.getRequestDispatcher("resources/views/inicio.jsp").forward(req, resp);
                }
            break;
             case "btn":
                String reaccion=req.getParameter("reaccion");
                String comentario=req.getParameter("comentario");

            default:
                break;
        }
    }
    
    
}
