package com.test.main;

import com.test.controllers.MyController;
import com.test.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = "com.test")
public class DIAppTest {

    public static void main(String...args)
    {
        ApplicationContext ctx = SpringApplication.run(DIAppTest.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        List<Product> products = controller.getProducts();

        for(Product product : products){
            System.out.println("Product Example------- "+product.getDescription());
        }
    }
}
