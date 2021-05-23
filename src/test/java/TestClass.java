import org.junit.Test;

import com.github.javafaker.Faker;

public class TestClass {
	
	@Test
	public void TestMethod() {
		System.out.println("Nolur calis lan!");
		Faker faker = new Faker();
		
		System.out.println(faker.address().city());
		
		
	}
	
}
