
public class MangoCake extends CakeBakeryi{
 private String size="small";

 public MangoCake(String name,double price,String size)
 {
	 super(name,price);
	 if(!size.equals("small"))
	 {
		 throw new IllegalArgumentException("Invlaid input");
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
