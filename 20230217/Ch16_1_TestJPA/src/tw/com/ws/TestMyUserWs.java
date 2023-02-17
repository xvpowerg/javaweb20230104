package tw.com.ws;

import javax.ejb.EJB;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import tw.com.ejb.MyUserBeanLocal;
import tw.com.jpa.MyUser;

@Path("myuser")
@Produces(MediaType.APPLICATION_JSON)
public class TestMyUserWs {
	@EJB
	private MyUserBeanLocal myUserBean;
	public class Msg{
		private String msg;

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}		
	}
	
	
	@POST
	public Response regisrter(@FormParam("account") String account,
			@FormParam("password") String password) {
		MyUser myUser = new MyUser();
		myUser.setAccount(account);
		myUser.setPassword(password);
		boolean pass = myUserBean.regisrter(myUser);
		if (pass) {
			return Response.ok().encoding("UTF-8").entity(myUser).build();
		}
		Msg msg = new Msg();
		msg.setMsg("����");
		
		return Response.status(400).entity(msg).build();
	}
	@POST
	@Path("login")
	public Response login(@FormParam("account") String account,
			@FormParam("password") String password) {
		MyUser myUser =  myUserBean.findUserByAccount(account);
		if (myUser!= null && myUser.getPassword().equals(password)) {
			return Response.ok().encoding("UTF-8").entity(myUser).build();
		}
		Msg msg = new Msg();
		msg.setMsg("�n�J����");
		return Response.status(400).entity(msg).build();
	}
	
	
}
