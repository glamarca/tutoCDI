package be.tuto;

import javax.inject.Named;

@Named
public class MessageServerBean {
	
	public String getMessage(){
		return "Hello World";
	}

}
