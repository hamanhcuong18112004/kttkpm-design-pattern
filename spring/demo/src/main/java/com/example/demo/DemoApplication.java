package com.example.demo;

import com.example.demo.config.AppConfig;
import com.example.demo.decorator.Beverage;
import com.example.demo.decorator.BobaPearlDecorator;
import com.example.demo.decorator.MilkDecorator;
import com.example.demo.factory.DrinkFactory;
import com.example.demo.factory.ItalianDrinkFactory;
import com.example.demo.factory.VietnameseDrinkFactory;
import com.example.demo.factory.products.Coffee;
import com.example.demo.factory.products.Tea;
import com.example.demo.model.Order;
import com.example.demo.strategy.CashPayment;
import com.example.demo.strategy.CreditCardPayment;
import com.example.demo.strategy.EWalletPayment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		// 1. SINGLETON
		System.out.println("=== CẤU HÌNH HỆ THỐNG (Singleton) ===");
		AppConfig config = AppConfig.getInstance();
		System.out.println("Quán: " + config.getConfig("shopName") + " | DB: " + config.getConfig("dbHost") + ":" + config.getConfig("dbPort"));
		System.out.println("Cùng instance? " + (config == AppConfig.getInstance()));

		// 2. FACTORY
		System.out.println("\n=== TẠO ĐỒ UỐNG (Factory) ===");
		DrinkFactory vnFactory = new VietnameseDrinkFactory();
		DrinkFactory itFactory = new ItalianDrinkFactory();
		Coffee vnCoffee = vnFactory.createCoffee();
		Tea vnTea = vnFactory.createTea();
		Coffee itCoffee = itFactory.createCoffee();
		Tea itTea = itFactory.createTea();
		System.out.printf("[VN] %s - %,d VND%n", vnCoffee.getDescription(), vnCoffee.getPrice());
		System.out.printf("[VN] %s - %,d VND%n", vnTea.getDescription(), vnTea.getPrice());
		System.out.printf("[IT] %s - %,d VND%n", itCoffee.getDescription(), itCoffee.getPrice());
		System.out.printf("[IT] %s - %,d VND%n", itTea.getDescription(), itTea.getPrice());

		// 3. DECORATOR
		System.out.println("\n=== THÊM TOPPING (Decorator) ===");
		Beverage beverage = vnFactory.createCoffee();
		beverage = new MilkDecorator(beverage);
		beverage = new BobaPearlDecorator(beverage);
		System.out.println(beverage.getDescription());
		System.out.printf("Giá: %,d VND%n", beverage.getCost());

		// 4. STATE
		System.out.println("\n=== TRẠNG THÁI ĐƠN HÀNG (State) ===");
		Order order = new Order("001");
		order.addItem(beverage);
		order.next();
		order.addItem(vnFactory.createTea());
		order.next();
		order.next();
		order.next();

		// 5. STRATEGY
		System.out.println("\n=== THANH TOÁN (Strategy) ===");
		Order order2 = new Order("002");
		order2.addItem(beverage);
		order2.setPaymentStrategy(new CashPayment(60000));
		order2.pay();
		order2.setPaymentStrategy(new CreditCardPayment("1234567890123456"));
		order2.pay();
		order2.setPaymentStrategy(new EWalletPayment("MoMo", 1000000));
		order2.pay();
	}

}
