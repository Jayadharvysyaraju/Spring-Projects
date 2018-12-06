import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.sampleproject"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySource() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	//@Bean(name="customerService")
	//public CustomerService getCustomerService() {
		
		// setter injection
		//CustomerServiceImpl service = new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRepository());
		
		//constructor injection
		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		
		//return service;
	//}
	
	/*@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}*/

}
