package be.tuto.util.validator;

import javax.enterprise.inject.Alternative;

import be.tuto.model.entity.Item;

@Alternative
public class RelaxedItemValidator implements ItemValidator {

	@Override
	public boolean isValid(Item item) {
		return item.getValue() < (item.getLimit() * 2);
	}

}
