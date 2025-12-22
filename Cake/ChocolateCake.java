
public class ChocolateCake extends CakeBakeryi{
	 private final String size="large";

	 public ChocolateCake(String name,double price,String size)
	 {
		 super(name,price);
		 if(!size.equals("large"))
		 {
			 throw new IllegalArgumentException("Invalid size");
		 }
		 this.size=size;
	 }
	public String getSize() {
		return size;
	}
	 public String toString()
	 {
		 return String.format("%s %s",size,super.toString());
	 }
}
