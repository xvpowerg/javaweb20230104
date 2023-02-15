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
	//GET 用來做查詢 不會修該資料
			//POST 用來新增資料
			//PATCH 可用來修改資料
			//DELETE 用來刪除資料
	@GET
	public String testHello() {
		return "{\"value\":\"Hello\"}";
	}
	
	@POST
	public String testPost(@FormParam("name") String name) {
		return  "{\"name\":\""+name+"\"}";
	}
}
