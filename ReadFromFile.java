package task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFromFile {
	
	//从文件中读取数据
	public static String readFromCsv(String filePath) {
		
		StringBuilder content = new StringBuilder("");
		
		try {
						
			File file = new File(filePath);
			
			if(file.isFile() && file.exists()) {
				
				InputStreamReader input = new InputStreamReader(new FileInputStream(file), "UTF-8");
				
				BufferedReader buff = new BufferedReader(input);
				
				String nextLine = null;
				
				while((nextLine = buff.readLine()) != null) {
					
					content.append(nextLine + "/n");
					
					System.out.println(nextLine);
				}
				
				buff.close();
				
			}else {
				
				System.out.println("找不到指定的文件！");
			}
			
		}catch(Exception e) {
			
			System.out.println("文件读取错误！");
			
			e.printStackTrace();
		}
		
		return content.toString();
		
	}
	
	//从文件中读取某一行的数据
	public static String getRow(String filePath, int row) {
		
		String content = "";
		
		try {
						
			File file = new File(filePath);
			
			if(file.isFile() && file.exists()) {
				
				InputStreamReader input = new InputStreamReader(new FileInputStream(file), "UTF-8");
				
				BufferedReader buff = new BufferedReader(input);
				
				String nextLine = null;
				
				int count = 0;
				
				while((nextLine = buff.readLine()) != null) {
					
					
					if(count == row) {		
							
							content = nextLine;					
					}
					
					count++;
				}
				
				buff.close();
				
			}else {
				
				System.out.println("找不到指定的文件！");
			}
			
		}catch(Exception e) {
			
			System.out.println("文件读取错误！");
			
			e.printStackTrace();
		}
		
		return content.toString();
		
	}
	
}
