package tw.com.web;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import tw.com.beans.Car;


@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//jackson
		ObjectMapper objMap = new ObjectMapper();
		Car car1 = new Car();
		car1.setColor("red");
		car1.setDoors(2);
		car1.setType("SUV");
		String carJson = objMap.writeValueAsString(car1);		
		resp.getWriter().println(carJson);
				
		String jsonStr = "{\"type\":\"CRV\",\"doors\":4,\"color\":\"yellow\"}";
		Car car2 = objMap.readValue(jsonStr, Car.class);
		resp.getWriter().println(car2);
		
		 Map<String,Object> map =  objMap.readValue(jsonStr, Map.class);
		 resp.getWriter().println(map);
	}
}
