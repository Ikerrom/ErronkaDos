package view;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import controller.Postgre.*;
import model.Postgre.*;
import controller.SQLserver.*;
import model.SQLserver.*;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(PostgreKonfigurazioa.class);
		
		SaleOrderDao pd = appContext.getBean(SaleOrderDao.class);
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SQLserverKonfigurazioa.class);
		
		PruduktuaDao sd = appContext.getBean(PruduktuaDao.class);
		
		List <SaleOrder> produktuak = pd.getAll();
		
		for (SaleOrder pt : produktuak) {
			
				System.out.println(pt.getName());

		}
		
		
		((AnnotationConfigApplicationContext) appContext).close();

	}

}
