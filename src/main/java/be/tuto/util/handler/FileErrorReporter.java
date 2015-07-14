package be.tuto.util.handler;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;

import be.tuto.model.entity.Item;

@RequestScoped
public class FileErrorReporter implements ItemErrorHandler,Serializable {

	@Override
	public void handleItem(Item item) {
		System.out.println("Saving "+item+" to file");
	}

	@PostConstruct
	public void init() {
		System.out.println("Creating file error reporter");
	}

	@PreDestroy
	public void release() {
		System.out.println("Closing file error reporter");
	}
	
	public void eventFired(@Observes Item item){
		handleItem(item);
	}
}
