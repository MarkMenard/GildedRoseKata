package gildedrose;

public class NormalItem extends BaseItem {

	private final int maxQuality = 50;

	public NormalItem (int quality, int sellIn) {
		super(quality, sellIn);
	}
	
	@Override
	public void update () {
		updateQuality();
		decrementSellIn();
		zeroFloorQuality();
		assureMaxQuality();
	}
	
	@Override
	public String getName () {
		return "NORMAL ITEM";
	}

	private void assureMaxQuality() {
		if (quality > maxQuality) quality = maxQuality ;
	}

	private void decrementSellIn () {
		sellIn -= 1;
	}
	
	protected void updateQuality() {
		quality -= 1;
		if (isExpired()) quality -= 1;
	}
	
	public void zeroFloorQuality () {
		if (quality < 0) quality = 0;
	}

}
