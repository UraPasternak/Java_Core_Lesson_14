package ua.lviv.lgs.hw14.zavdania2;

import java.util.Comparator;

public class WidthCommodityComparator implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {
		if (o1.getWidth() > o2.getWidth()) {
			return 1;
		} else if (o1.getWidth() < o2.getWidth()) {
			return -1;
		}
		return 0;
	}

}
