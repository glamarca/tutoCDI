package be.tuto.util.handler;

import javax.enterprise.event.Event;
import javax.inject.Inject;

import be.tuto.model.entity.Item;
import be.tuto.util.qualifier.Notify;

@Notify
public class EventItemHandler implements ItemErrorHandler {

	@Inject
	private Event<Item> itemEvent;
	
	@Override
	public void handleItem(Item item) {
		System.out.println("Firing Event");
        itemEvent.fire(item);
	}

}
