package com.javacodegeeks.snippets.enterprise.app;

import com.javacodegeeks.snippets.enterprise.model.Address;
import com.javacodegeeks.snippets.enterprise.model.Employee;
import com.javacodegeeks.snippets.enterprise.service.EmployeeService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Praktykant on 09.09.14.
 */
public class Main {

    public static void main(String[] args) {
     run();
    }
    public static void run() {
        System.out.println("load context");
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee em = new Employee();
        Address emAdd = new Address();
        em.setId(123);
        em.setName("John");
        em.setAge(35);
        emAdd.setCity("Lublin");
        emAdd.setId_address(1);
        emAdd.setPost_code(12345);
        emAdd.setStreet("Dluga");
        em.setAddress(emAdd);
        EmployeeService emService ;
        emService = (EmployeeService)context.getBean("employeeService");
        emService.persistEmployee(em);
        emService.persistAddress(emAdd);
        System.out.println("Updated age :" + emService.findEmployeeById(123).getAge());
        em.setAge(32);
        emService.updateEmployee(em);
        System.out.println("Updated age :" + emService.findEmployeeById(123).getAge());
//		emService.deleteEmployee(em);
        context.close();
    }
}
