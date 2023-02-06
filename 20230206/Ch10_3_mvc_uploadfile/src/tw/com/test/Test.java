package tw.com.test;

import tw.com.web.tools.ImageTools;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Test {
		public static void testImageTools() {
			
		}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path src = Paths.get("C:", "my_imags","fox1.png");
		Path target = Paths.get("C:", "test_image");
	
		ImageTools.setImagePath(target.toString());
		FileInputStream srcInput = new FileInputStream(src.toFile());
		String fileName = "test.png";
		Path targetPath = target.resolve(fileName);
		Files.deleteIfExists(targetPath);			
		ImageTools.uploadFile(srcInput, fileName);
		
		if (Files.exists(targetPath)) {
			System.out.println("Pass!");
		}else {
			System.out.println("Fail");
		}
	}

}
