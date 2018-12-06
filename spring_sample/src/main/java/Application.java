import com.sampleproject.service.CustomerService;
import com.sampleproject.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		CustomerService service= new CustomerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
