package gildedrose;

public class ConjuredItem extends NormalItem {

	public ConjuredItem(int quality, int sellIn) {
		super(quality, sellIn);
	}
	
	@Override
	public String getName () {
		return "Conjured Item";
	}
	
	@Override
	protected void updateQuality () {
		super.updateQuality();
		super.updateQuality();
	}

}
