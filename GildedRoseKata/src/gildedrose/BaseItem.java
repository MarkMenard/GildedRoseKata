package gildedrose;

public class BaseItem {

	public int quality;
	public int sellIn;
	
	public BaseItem (int quality, int sellIn) {
		this.quality = quality;
		this.sellIn = sellIn;
	}

	public int getSellIn() {
		return sellIn;
	}

	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public String getName() {
		return "Base Item";
	}

	
	public Boolean isExpired () {
		return sellIn <= 0;
	}
	
	public void update () {
		
	}
	
}
