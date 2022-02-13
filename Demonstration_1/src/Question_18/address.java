package Question_18;

public class address implements Comparable{
	private int streetNo;
	private String city;
	private String country;
	
	public address(int streetNo, String city, String country) {
		this.streetNo = streetNo;
		this.city = city;
		this.country = country;
	}

	public int getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int compareTo(Object comparestreetNo) {
		int CompareStreet =((address)comparestreetNo).getStreetNo();
		return this.streetNo - CompareStreet;
	}

	@Override
	public String toString() {
		return "address [streetNo=" + streetNo + ", city=" + city + ", country=" + country + "]";
	}

}
