package gildedrose;

public class ItemFactory {
	public static BaseItem build (String name, int quality, int sellIn) {
		if (name.equals("Sulfuras, Hand of Ragnaros")) {
			return new SulfurasItem (quality, sellIn);
		}
		if (name.equals("NORMAL ITEM")) {
			return new NormalItem (quality, sellIn);
		}
			
		if (name.equals("Aged Brie")) {
			return new AgedBrieItem (quality, sellIn);
		}
			
		if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			return new BackstagePassesItem (quality, sellIn);
		}
			
		if (name.equals("Conjured Mana Cake")) {
			return new ConjuredItem (quality, sellIn);
		}
		throw new RuntimeException ("ERROR: Unsupported Item Type: " + name);
	}
}
