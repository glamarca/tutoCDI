package be.tuto.model.dao;

import java.util.ArrayList;
import java.util.List;

import be.tuto.model.entity.Item;
import be.tuto.util.qualifier.Prod;

@Prod
public class AnotherItemDao implements ItemDao{

	@Override
	public List<Item> fetchItem() {
        List<Item> results = new ArrayList<Item>();
        results.add(new Item(99, 9));
        return results;
    }
}
