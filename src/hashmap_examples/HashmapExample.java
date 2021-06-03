package hashmap_examples;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
	
	public static void main(String[] args) {
		
		Map<Goods, Integer> goodsMap = new HashMap<>();
		
//		// this part could work perfectly since I have rewritten hashCode and equals
//		Goods goods = new Goods(66L, "test good", 666L);
//		goodsMap.put(goods, 1);
//		goods = new Goods(66L, "test good", 666L);
//		goodsMap.put(goods, 66);
//		System.out.println(goodsMap.size());
		
		Goods goods = new Goods(66L, "test good", 666L);
		goodsMap.put(goods, 1);
		goods = new Goods(66L, "test good", 666L);
		goodsMap.put(goods, 66);
		System.out.println(goodsMap.size());
		
	}
	
	
	
	

}
