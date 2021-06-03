package hashmap_examples;


//@AllArgsConstructor
//@Getter
//@Setter
public class Goods {
	
	private long id;
	private String name;
	private long amount;
	
	public Goods(long pId, String pName, long pAmount) {
		id = pId;
		name = pName;
		amount = pAmount;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public long getAmount() {
		return amount;
	}
	
	public void setId(long pId) {
		id = pId;
	}
	
	public void setName(String pName) {
		name = pName;
	}
	
	public void setAmount(long pAmount) {
		amount = pAmount;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Goods)){
			return false;
		}
		Goods g = (Goods) o;
		if(g.id != this.id || !g.name.equals(this.name) || g.amount != this.amount) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		return (int)id*5%6;
	}
	
	
	
	

}
