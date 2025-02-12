package com.zoodel.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

import org.openqa.selenium.chrome.ChromeDriver;

public class CommandPromt {
	public static void main(String[] args) throws IOException {
		try {
			runCommand();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void runCommand() throws IOException, InterruptedException {
		String filePath = "C:\\Users\\ER\\AppData\\Local\\Android\\Sdk\\emulator";
		LinkedList<String> command = new LinkedList<String>();
		command.add("cmd.exe");
		command.add("/c");
		command.add("emulator @Pixel_9_Pro_XL_API_35");
		ProcessBuilder builder = new ProcessBuilder(command);
		builder.directory(new File(filePath));
		Process result = builder.start();
		BufferedReader reader = new BufferedReader(new InputStreamReader(result.getInputStream()));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		BufferedReader errorReader = new BufferedReader(new InputStreamReader(result.getErrorStream()));
		String errorLine;
		while ((errorLine = errorReader.readLine()) != null) {
			System.out.println(errorLine);
		}
		int exitCode = result.waitFor();
		System.out.println("Exit code: " + exitCode);
	}
}
