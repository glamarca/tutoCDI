package be.tuto.mbean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

import be.tuto.model.dao.ItemDao;
import be.tuto.model.entity.Item;
import be.tuto.util.handler.ItemErrorHandler;
import be.tuto.util.qualifier.Demo;
import be.tuto.util.qualifier.Notify;
import be.tuto.util.validator.ItemValidator;

@Named("itemProcessor")
@RequestScoped
public class ItemProcessor {

	@Inject
	@Demo
	private ItemDao itemDao;
	@Inject
	private ItemValidator itemValidator;
	@Inject
	@Notify
	private ItemErrorHandler itemErrorHandler;
	@Inject
	private Event<Item> processorEvent;

	public void execute() {
		List<Item> items = itemDao.fetchItem();
	    for (Item item : items) {
	        processorEvent.fire(item);
	        if (!itemValidator.isValid(item)) {
	            itemErrorHandler.handleItem(item);
	        }
	    }
	}

}
