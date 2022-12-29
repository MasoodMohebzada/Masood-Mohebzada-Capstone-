package tek.sdet.framework.utilities;

import java.util.List;
import java.util.Map;

import com.github.javafaker.Faker;

public class DataGenerator {
	
	public static final String addressGenerator = null;

	public static String addressGenerator(String string)	{
		
		Faker faker = new Faker();
		
		String output = "";
		
		if (string.equalsIgnoreCase("countryValue"))	{
			output = "United States";	
		}else if(string.equalsIgnoreCase("fullnameValue")) {
			output = faker.name().fullName();
		}else if(string.equalsIgnoreCase("PhoneValue")) {
			output = faker.phoneNumber().cellPhone();
		}else if(string.equalsIgnoreCase("stAddress")) {
			output = faker.address().streetAddress();
		}else if(string.equalsIgnoreCase("aptValue")) {
			output = faker.address().secondaryAddress(); 
		}else if(string.equalsIgnoreCase("cityValue")) {
			output = faker.address().city();
		}else if(string.equalsIgnoreCase("stateValue")) {
			output = faker.address().state();
		}else if(string.equalsIgnoreCase("zipCodeValue"));{
			String zipcode = faker.address().zipCode().substring(0,5);
		}
		return output;
	}
				
	}
	


	
	

			


