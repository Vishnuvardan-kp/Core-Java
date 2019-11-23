package test.learning.cutom;
import java.util.List;

public class Mobile {

	public String mobileName;
	public String mobilePrice;
	public MobileSpecifications mobileSpecifications;
	
	public MobileSpecifications getMobileSpecifications() {
		return mobileSpecifications;
	}

	public void setMobileSpecifications(MobileSpecifications mobileSpecifications) {
		this.mobileSpecifications = mobileSpecifications;
	}

	public Mobile(String mobileName, String mobilePrice) {
		super();
		this.mobileName = mobileName;
		this.mobilePrice = mobilePrice;
	}
	
	public String getMobileName() {
		return mobileName;
	}

	public String getMobilePrice() {
		return mobilePrice;
	}

	
}
