# LAB5CVDS
Andres Felipe Cubillos Hurtado
Brayan Santiago Buitrago

# Parte II. - Haciendo una aplicación Web dinámica a bajo nivel.
## La clase SampleServlet incluida a continuacion.

```
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
```

    
   
   Le solicita algo a la pagina y si todo sale bien, no se le agrega anda mas y  logra conectar, escribe hello name!
   
   ## Compile y ejecute la aplicación en el servidor embebido Tomcat, a través de Maven con:
   
```
    mvn package 
    mvn tomcat7:run
```
    
    ![](images/mvntomcat.png)
    
