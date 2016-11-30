package servlets;

import forms.UserForm;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Tigran.Mkrtchyan
 * @since 11/29/2016.
 */
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        UserForm user = mapper.readValue(req.getParameter("jsonName"), UserForm.class);
        String jsonInString = mapper.writeValueAsString(user);

        JSONObject obj = new JSONObject();

        try {
            obj.put("name", "foo");
            obj.put("num", new Integer(100));
            obj.put("balance", new Double(1000.21));
            obj.put("is_vip", true);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        System.out.println(user.toString());
        System.out.println(jsonInString);
        System.out.print(obj);
    }
}
