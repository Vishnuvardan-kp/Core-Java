import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.attribute.FileAttribute;

public class DebugAnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printResult();
	}
	
	public static void printResult() {
		String s = "Vishnu";
		FileAttribute<String> fs = new FileAttribute<String>() {

			@Override
			public String name() {
				if(s.length() > 1)
					return addLastName(s);
				return s;
			}

			@Override
			public String value() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String addLastName(String fullName) {
				
				return fullName + " KP";
			}
			
			
		};
		
		System.out.println(fs.name());
	}

	public static void test() throws IOException {
		
		
	}
}
