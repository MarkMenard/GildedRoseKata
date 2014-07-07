package gildedrose;

import java.util.List;

public class GildedRose {
	
	private final int maxQuality = 50;
	
	public void updateQuality(List<BaseItem> items) {
		for (BaseItem item : items) {
			item.update();
		}
	}

	private void updateConjured(BaseItem item) {
		item.setQuality(item.getQuality() - 2);
		if (item.isExpired()) {
			item.setQuality(item.getQuality() - 2);
		}
	}

	private void updateNormalItem(BaseItem item) {
		item.setQuality(item.getQuality() - 1);
		
		if (item.isExpired()) {
			item.setQuality(item.getQuality() - 1);
		}
	}

	private void updateBackstagePasses(BaseItem item) {
		if (item.getSellIn() > 10) {
			item.setQuality(item.getQuality() + 1);
		}
		if (item.getSellIn() <= 10) {
			item.setQuality(item.getQuality() + 2);
		}
		if (item.getSellIn() <= 5) {
			item.setQuality(item.getQuality() + 1);
		}
		if (item.isExpired()) {
			item.setQuality(0);
		}
	}
	
	private void updateAgedBrie (BaseItem item) {
		item.setQuality(item.getQuality() + 1);
		
		// The older Brie is the better it is.
		if (item.isExpired()) {
			item.setQuality(item.getQuality() + 1);
		}
	}

	// Helpers
	
	private void decrementSellIn(BaseItem item) {
		item.setSellIn(item.getSellIn() - 1);
	}

	private void zeroFloorQuality(BaseItem item) {
		if (item.getQuality() < 0) {
			item.setQuality(0);
		}
	}

	private void assureMaxQuality(BaseItem item) {
		if (item.getQuality() > maxQuality) {
			item.setQuality(maxQuality);
		}
				
	}

	
}
