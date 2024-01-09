package pac1;

import java.io.File;
import java.util.Date;
import java.util.Random;

public class FileDemo {
	public static void main(String[] args)throws Exception {
		// File operation
		//  file, folder, folder/files 
		
		// User dir path
		
//		System.out.println("user.home = " + System.getProperty("user.home"));
//		System.out.println("user.dir = " + System.getProperty("user.dir"));
		
		String currentProjectPath = System.getProperty("user.dir");
//		System.out.println(currentProjectPath);
		File file1 = 
				new File(currentProjectPath+"\\allFiles");
//		file1.mkdir();
		// file, dir
//		System.out.println(file1.exists());
//		System.out.println(file1.isDirectory());
//		System.out.println(file1.isFile());
		//file1.createNewFile();
//		file1.mkdir();
		
		//  first create one folder - all files
		// inside that folder , create 5 files
		// Apache Common Utils
		
//		for(int i = 1; i <= 5 ;i++) {
//			Random rand = new Random();
//			File file2 = 
//			new File(currentProjectPath+"\\allFiles\\fl"+rand.nextInt(1000)+".txt");
//			file2.createNewFile();
//		}
		
		File[] allFiles = file1.listFiles();
		System.out.println(allFiles.length);
		for(File file : allFiles) {
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
			System.out.println(new Date(file.lastModified()));
			System.out.println(file.length());
			file.delete();
			System.out.println("----------");
			
		}
	}
}
