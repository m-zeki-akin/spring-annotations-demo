package com.springannotations.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Read Fortune Services from fortune-services
	// Add Fortune Services to array
	// Return the random Fortune Service from Fortune Services array
	@PostConstruct
	@Override
	public String getFortune() {
		try {
			
			String filePath = "D:\\Users\\mzakin\\eclipse-workspace\\spring-demo-annotations\\src\\fortune-services.txt";
			
			Path path = Paths.get(filePath);
			
			BufferedReader br = new BufferedReader(new FileReader(filePath));

			int lineCount = (int) Files.lines(path).count();

			ArrayList<String> arr = new ArrayList<String>();

			Random rand = new Random();
			
			String temp;
			
			for (int i = 0; i < lineCount; i++) {
				temp = br.readLine();
				if (!temp.isEmpty()) {
					arr.add(temp);
					System.out.println(temp);
				}
			}
			
			br.close();

			return arr.get(rand.nextInt(arr.size()));

		} catch (Exception e) {
			return "Exception catched..";
		}

	}

}
