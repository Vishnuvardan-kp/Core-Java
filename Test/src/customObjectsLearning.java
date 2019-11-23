import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import test.learning.cutom.Mobile;
import test.learning.cutom.MobileSpecifications;

public class customObjectsLearning {

	public static void main(String[] args) {
		
		List<Mobile> mobiles = new ArrayList<Mobile>();
		List<MobileSpecifications> mbSpecifications = new ArrayList<MobileSpecifications>();
		
		String[] mobileNames = new String[] {"Apple","Nexus","Asus"};
		String[] mobilePrice = new String[] {"50000","30000","15000"};
		
		String[] ram = {"32","16","8"};
		String[] processor = {"i9","i5","i3"};
		String[] camPixel = {"32px","16px","8px"};
		String[] batteryCapacity = {"5000","4000","4500"};
		String[] inch = {"6inch","5.5inch","5inch"};
		String[] warranty = {"3yrs","2yrs","1yr"};
		
		
		for (int i = 0; i < 3; i++) {
			
			MobileSpecifications ms = new MobileSpecifications();
			ms.setMbRAM(ram[i]);
			ms.setMbProcessor(processor[i]);
			ms.setMbCameraPixel(camPixel[i]);
			ms.setMbBatteryCapacity(batteryCapacity[i]);
			ms.setMbInch(inch[i]);
			ms.setMbWarranty(warranty[i]);			
			mbSpecifications.add(ms);
			
		}
		

		for (int i = 0; i < 3; i++) {
			
			Mobile mobile = new Mobile(mobileNames[i], mobilePrice[i]);
			mobile.setMobileSpecifications(mbSpecifications.get(i));
			mobiles.add(mobile);
		}
		
		Collections.sort(mobiles, new Comparator<Mobile>() {

			@Override
			public int compare(Mobile mble1, Mobile mble2) {
				
				int result = mble1.getMobileName().compareTo(mble2.getMobileName());
				return result;
			}
			
			
		});
		
		for (int i = 0; i < mobiles.size(); i++) {
			Mobile mble = mobiles.get(i);
			System.out.println("Mobile Name : "+mble.getMobileName().toUpperCase());
			System.out.println("Mobile RAM : "+mble.mobileSpecifications.getMbRAM());
			System.out.println("Mobile Processor : "+mble.mobileSpecifications.getMbProcessor());
			System.out.println("Mobile Camera pixel : "+mble.mobileSpecifications.getMbCameraPixel());
			System.out.println("Mobile Battery Capacity : "+mble.mobileSpecifications.getMbBatteryCapacity());
			System.out.println("Mobile Inch : "+mble.mobileSpecifications.getMbInch());
			System.out.println("Mobile Warranty : "+mble.mobileSpecifications.getMbWarranty());
			System.out.println("Mobile Price : "+mble.getMobilePrice());
			System.out.println("*******");
		}
	}

}
