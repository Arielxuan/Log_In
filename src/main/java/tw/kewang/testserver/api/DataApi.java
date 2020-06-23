package tw.kewang.testserver.api;

import com.google.gson.Gson;
import tw.kewang.testserver.Login_In;
import tw.kewang.testserver.User;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("User")
public class DataApi {
    private static final Gson GSON = new Gson();

    @Produces("application/json")
    @POST
    @Path("Log_in")
    public Response userLogIn(String body) {
        System.out.println("in");
        Login_In login_in = new Login_In();
        User user = new User();
        user = GSON.fromJson(body, User.class);
        if (user.getName().equals("apple") && user.getPassword().equals("123456")) {
            login_in.setRe_code(0);
            login_in.setRe_me("Success");
        } else {
            login_in.setRe_code(1);
            login_in.setRe_me("failure");
        }
        return Response.ok().entity(GSON.toJson(login_in)).build();
    }
}





