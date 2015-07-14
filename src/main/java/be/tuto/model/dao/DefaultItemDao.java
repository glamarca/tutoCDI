package be.tuto.model.dao;

import java.util.ArrayList;
import java.util.List;

import be.tuto.model.entity.Item;
import be.tuto.util.qualifier.Demo;

@Demo
public class DefaultItemDao implements ItemDao{

	@Override
	public List<Item> fetchItem() {
		List<Item> results = new ArrayList<Item>();
        results.add(new Item(34, 7));
        results.add(new Item(4, 37));
        results.add(new Item(24, 19));
        results.add(new Item(89, 32));
        return results;
	}

}
