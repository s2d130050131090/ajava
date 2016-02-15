import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
 

public class timerefresh extends HttpServlet {
 
  
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {

      response.setIntHeader("Refresh", 1);
      response.setContentType("text/html");
      Calendar calendar = new GregorianCalendar();
      String am_pm;
      int hour = calendar.get(Calendar.HOUR);
      int minute = calendar.get(Calendar.MINUTE);
      int second = calendar.get(Calendar.SECOND);
      if(calendar.get(Calendar.AM_PM) == 0)
        am_pm = "AM";
      else
        am_pm = "PM";
 
      String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
    
      PrintWriter out = response.getWriter();
      String title = "Second Refresh using Servlet";
      out.println(
        "<html>\n" +
        "<head><title>" + title + "</title></head>\n"+
		"<body>\n"+
        "<h1>Current Time is: " + CT + "</h1>\n"+
		"</body>\n"+
		"</html>\n");
  }

  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
     doGet(request, response);
  }
}