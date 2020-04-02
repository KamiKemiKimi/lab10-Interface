public class Midterm implements Measurable
{
	private double score = 0;
	private String name = "";

	public Midterm(double score, String name)
	{
		this.score = score;
		this.name = name;
	}

	public double getMeasurement()
	{
		return this.score;
	}
}