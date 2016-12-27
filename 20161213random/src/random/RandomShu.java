package random;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomShu {
	public static void main(String[] args) {
		List<Double> numlist = new ArrayList<Double>();
		for (int i = 0; i < 1000000; i++) {
			double num = new Random().nextDouble();
		
			numlist.add(num);
		}
		Collections.sort(numlist);
		System.out.println(numlist.size());
		String str = numlist.toString();
		File txt = new File("E:/a.txt");
		try {
			if (!txt.exists()) {
				txt.createNewFile();
			}
			byte bytes[] = new byte[512];
			bytes = str.getBytes(); // 新加的
			int b = str.length(); // 改
			FileOutputStream fos = new FileOutputStream(txt);
			fos.write(bytes, 0, b);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
