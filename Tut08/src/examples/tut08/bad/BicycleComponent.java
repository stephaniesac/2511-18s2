package examples.tut08.bad;

public abstract class BicycleComponent {

	private float cost;
	private float weight;

	public BicycleComponent(float cost, float weight) {
		this.cost = cost;
		this.weight = weight;
	}

	public float getWeight() 	{	return weight; }
	public float getCost() 		{ return cost; }
}
