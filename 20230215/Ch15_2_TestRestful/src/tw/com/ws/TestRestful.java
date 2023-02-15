package tw.com.ws;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
@Produces(MediaType.APPLICATION_JSON)
public class TestRestful {
	//http://localhost:8080/Ch15_2_TestRestful/test
	//GET �ΨӰ��d�� ���|�׸Ӹ��
			//POST �Ψӷs�W���
			//PATCH �i�Ψӭק���
			//DELETE �ΨӧR�����
	@GET
	public String testHello() {
		return "{\"value\":\"Hello\"}";
	}
	
	@POST
	public String testPost(@FormParam("name") String name) {
		return  "{\"name\":\""+name+"\"}";
	}
}
