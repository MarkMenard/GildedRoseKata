package gildedrose;

import java.util.List;

public class GildedRose {
	
	private final int maxQuality = 50;
	
	public void updateQuality(List<Item> items) {
		for (Item item : items) {
			if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
				if (item.getName().equals("NORMAL ITEM")) {
					updateNormalItem(item);
				}
				
				if (item.getName().equals("Aged Brie")) {
					updateAgedBrie(item);
				}
				
				if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
					updateBackstagePasses(item);
				}
				
				if (item.getName().equals("Conjured Mana Cake")) {
					updateConjured(item);
				}

				decrementSellIn(item);
				zeroFloorQuality(item);
				assureMaxQuality(item);
			}
			
		}
	}

	private void updateConjured(Item item) {
		item.setQuality(item.getQuality() - 2);
		if (item.isExpired()) {
			item.setQuality(item.getQuality() - 2);
		}
	}

	private void updateNormalItem(Item item) {
		item.setQuality(item.getQuality() - 1);
		
		if (item.isExpired()) {
			item.setQuality(item.getQuality() - 1);
		}
	}

	private void updateBackstagePasses(Item item) {
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
	
	private void updateAgedBrie (Item item) {
		item.setQuality(item.getQuality() + 1);
		
		// The older Brie is the better it is.
		if (item.isExpired()) {
			item.setQuality(item.getQuality() + 1);
		}
	}

	// Helpers
	
	private void decrementSellIn(Item item) {
		item.setSellIn(item.getSellIn() - 1);
	}

	private void zeroFloorQuality(Item item) {
		if (item.getQuality() < 0) {
			item.setQuality(0);
		}
	}

	private void assureMaxQuality(Item item) {
		if (item.getQuality() > maxQuality) {
			item.setQuality(maxQuality);
		}
				
	}

	
}
