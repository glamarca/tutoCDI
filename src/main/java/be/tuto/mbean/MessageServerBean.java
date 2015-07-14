package be.tuto.mbean;

import javax.ejb.Stateless;
import javax.inject.Named;

@Named
@Stateless
public class MessageServerBean {
	
	public String getMessage(){
		return "Hello World";
	}

}
