package step03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
  public static void main(String[] args) {
    ApplicationContext ctx =
        new ClassPathXmlApplicationContext("step03/application-context01.xml");
    
    Car p1 = (Car)ctx.getBean("c1");
    Car p2 = (Car)ctx.getBean("c2");
    
    System.out.println(p1);
    System.out.println(p2);
  }
  
  /*
  public static void main(String[] args) {
    Car c = new Car();
    c.setModel("티코");
    c.setCapacity(5);
    c.setOutDate(Date.valueOf("2015-06-19"));
    
    System.out.println(c);

  }*/

}
