package test.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;
import com.service.EmpServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		EmpServiceImpl emp=(EmpServiceImpl)context.getBean("empService");
		
		Employee e=new Employee();
		e.setId(1);
		e.setName("Ganesh");
		emp.isAdd(e);
		System.out.println("Success...............");
		
    }
}
