package inheritence;

public class Tv {
	protected  String brand;
    protected String model;
    protected int Scrensize;
    protected boolean Smartfeatues;
    protected int brightness;
    protected int price;
	public Tv(String brand, String model, int scrensize, boolean smartfeatues, int brightness, int price) {
		super();
		this.brand = brand;
		this.model = model;
		Scrensize = scrensize;
		Smartfeatues = smartfeatues;
		this.brightness = brightness;
		this.price = price;
	}
	public void display()
	{
		System.out.println("display the tv class");
	}
	@Override
	public String toString() {
		return "Tv [brand=" + brand + ", model=" + model + ", Scrensize=" + Scrensize + ", Smartfeatues="
				+ Smartfeatues + ", brightness=" + brightness + ", price=" + price + "]";
	}
}
