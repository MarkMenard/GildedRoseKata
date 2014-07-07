package gildedrose;

public class BackstagePassesItem extends NormalItem {

	public BackstagePassesItem (int quality, int sellIn) {
		super(quality, sellIn);
	}
	
	@Override
	public String getName () {
		return "Back Stage Passes";
	}
	
	protected void updateQuality () {
		if (sellIn > 10) quality += 1;
		if (sellIn <= 10) quality += 2;
		if (sellIn <= 5) quality += 1;
		if (isExpired()) quality = 0;
	}

}
