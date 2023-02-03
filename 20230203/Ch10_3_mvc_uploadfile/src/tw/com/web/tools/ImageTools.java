package tw.com.web.tools;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Collectors;

public class ImageTools {
	private static String imagePath;

	 static String getImagePath() {
		return imagePath;
	}

	public static void setImagePath(String imagePath) {
		ImageTools.imagePath = imagePath;
	}
	
	public static boolean uploadFile(InputStream srcInput,
			String fileName) throws IOException {			
		 Path target =  Paths.get(getImagePath(), fileName);
		
		  Files.copy(srcInput, target, 
					StandardCopyOption.REPLACE_EXISTING);
	
		return true;
	}
	
	public static List<String> getImageFileNames() throws IOException {
			Path filePath =  Paths.get(getImagePath());
		List<String> fileNameList = Files.list(filePath).
				map(p->p.getFileName().toString()).
						collect(Collectors.toList());
		return fileNameList;
	}
}
