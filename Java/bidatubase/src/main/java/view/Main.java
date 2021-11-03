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
		
		ApplicationContext appContext1 = new AnnotationConfigApplicationContext(SQLserverKonfigurazioa.class);
		
		ProduktuaDao sd = appContext1.getBean(ProduktuaDao.class);
		
		List <SaleOrder> produktuak = pd.getAll();
		
		for (SaleOrder pt : produktuak) {
			
				System.out.println(pt.getName());

		}
		
		
		((AnnotationConfigApplicationContext) appContext1).close();

	}

}
