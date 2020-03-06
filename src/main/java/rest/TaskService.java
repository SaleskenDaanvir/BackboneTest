package rest;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.github.javafaker.Faker;
import com.google.gson.Gson;

import pojo.TaskPojo;
  
@Path("/task")
public class TaskService {
	private static final Gson gson = new Gson();
	private static final Faker faker = new Faker();

	@GET
    public String getMsg()
    {
        
	List<TaskPojo> taskPojos = new ArrayList<TaskPojo>();
	
	for(int i =0;i<10 ;i++) {
		TaskPojo taskPojo = new TaskPojo(faker.name().firstName(), faker.internet().avatar(), faker.number().randomDigit()+"", faker.animal().name(), faker.book().title(), i+"", faker.superhero().name(), faker.ancient().god(), faker.number().randomDigit()+"", faker.number().randomDigit()+"", faker.app().author(), faker.business().creditCardNumber());
		taskPojos.add(taskPojo);
	}
	
	
	return gson.toJson(taskPojos);
		
		
    }
	
	
}
