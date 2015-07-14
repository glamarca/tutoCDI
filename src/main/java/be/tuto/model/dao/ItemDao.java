package be.tuto.model.dao;

import java.util.List;

import be.tuto.model.entity.Item;

public interface ItemDao {

	List<Item> fetchItem();
}
