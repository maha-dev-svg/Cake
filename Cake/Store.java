import java.util.Scanner;
import java.io.*;
public class Store {
	private CakeBakeryi[] CakeBakery = new CakeBakeryi[100];
    private int count = 0;
 
    public void addItem(String name, double price) {
        if (count < CakeBakery.length) {
        	CakeBakery[count] = new CakeBakeryi(name, price);
            count++;
        }
    }
 
    public CakeBakeryi[] getCakeBakery() {
        return CakeBakery;
    }
 
    public int getCount() {
        return count;
    }
 
  
    public CakeBakeryi[] searchByMaxPrice(double maxPrice) {
    	CakeBakeryi[] result = new CakeBakeryi[100];
        int rCount = 0;
 
        for (int i = 0; i < count; i++) {
            if (CakeBakery[i].getPrice() <= maxPrice) {
                result[rCount] = CakeBakery[i];
                rCount++;
            }
        }
        return result;
 
    }
}
