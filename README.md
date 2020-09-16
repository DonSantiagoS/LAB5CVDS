# LAB5CVDS
Andres Felipe Cubillos Hurtado
Brayan Santiago Buitrago


# 1. La clase SampleServlet incluida a continuacion.

´´´´
    @WebServlet(
        urlPatterns = "/helloServlet"
    )
    public class SampleServlet extends HttpServlet{
        static final long serialVersionUID = 35L;

      @Override
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         Writer responseWriter = resp.getWriter();
         Optional<String> optName = Optional.ofNullable(req.getParameter("name"));
         String name = optName.isPresent() && !optName.get().isEmpty() ? optName.get() : "";

         resp.setStatus(HttpServletResponse.SC_OK);
         responseWriter.write("Hello" + name + "!");
         responseWriter.flush();
     }
  }
´´´
   Le solicita algo a la pagina y si todo sale bien, y logra conectar escribe hello name!
