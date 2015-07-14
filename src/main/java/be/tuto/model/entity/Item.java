package be.tuto.model.entity;

public class Item {
	
	private Integer value;
	private Integer limit;
	
	
	
	public Item(Integer value, Integer limit) {
		super();
		this.value = value;
		this.limit = limit;
	}

	@Override
    public String toString() {
        return super.toString() + String.format(" [Value=%d, Limit=%d]", value,limit);
    }

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

}
