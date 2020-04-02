public class Country implements Measurable, Comparable<Country>
{
	private String country = "";
	private double surface_area = 0.0;

	public Country(String country, double surface_area)
	{
		this.country = country;
		this.surface_area = surface_area;
	}

	public double getMeasurement()
	{
		return this.surface_area;
	}

	public int compareTo(Country c)
	{
		if (this.getMeasurement() < c.getMeasurement())
		{
			return -1;
		}
		else if (this.getMeasurement() > c.getMeasurement())
		{
			return 1;
		}
		else
			return 0;
	}
}