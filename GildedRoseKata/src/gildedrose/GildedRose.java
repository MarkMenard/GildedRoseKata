package gildedrose;

import java.util.List;

public class GildedRose {
	
	public void updateQuality(List<BaseItem> items) {
		items.forEach(item -> item.update());
	}
}
