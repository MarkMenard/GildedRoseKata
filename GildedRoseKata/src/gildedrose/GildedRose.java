package gildedrose;

import java.util.List;

public class GildedRose {
	
	public void updateQuality(List<BaseItem> items) {
		for (BaseItem item : items) {
			item.update();
		}
	}
}
