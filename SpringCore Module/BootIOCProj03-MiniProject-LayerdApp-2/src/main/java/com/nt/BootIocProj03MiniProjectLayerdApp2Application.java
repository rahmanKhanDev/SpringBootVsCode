package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.EmployeeController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootIocProj03MiniProjectLayerdApp2Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj03MiniProjectLayerdApp2Application.class, args);
	   EmployeeController controller= ctx.getBean("empController",EmployeeController.class);
	   try {
	List<Employee>	list=controller.getEmployeeBydesgns("CLERK","MANAGER", "ANALYST");
	list.forEach(emp->{
		System.out.println(emp);
	});
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   ((ConfigurableApplicationContext) ctx).close();
	}

}
