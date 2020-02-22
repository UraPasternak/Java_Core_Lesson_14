package ua.lviv.lgs.hw14.zavdania1;

public class Car implements Comparable<Car> {
	
	private String marka;
	private int rikVypusku;

	public Car(String marka, int rikVypusku) {
		super();
		this.marka = marka;
		this.rikVypusku = rikVypusku;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getRikVypusku() {
		return rikVypusku;
	}

	public void setRikVypusku(int rikVypusku) {
		this.rikVypusku = rikVypusku;
	}

	@Override
	public String toString() {
		return "Car [marka=" + marka + ", rikVypusku=" + rikVypusku + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marka == null) ? 0 : marka.hashCode());
		result = prime * result + rikVypusku;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (marka == null) {
			if (other.marka != null)
				return false;
		} else if (!marka.equals(other.marka))
			return false;
		if (rikVypusku != other.rikVypusku)
			return false;
		return true;
	}

	@Override
	public int compareTo(Car o) {
		return this.marka.compareTo(o.getMarka());
	}


}
