package gildedrose;

public class AgedBrieItem extends NormalItem {

	public AgedBrieItem(int quality, int sellIn) {
		super(quality, sellIn);
	}
	
	@Override
	public String getName () {
		return "Aged Brie";
	}
	
	protected void updateQuality () {
		quality += 1;
		if (isExpired()) quality += 1;
	}

}
