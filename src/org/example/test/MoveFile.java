package org.example.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MoveFile {
	
	public static void main(String[] args) {
		try {
			Files.move(new File("/Users/eppra01/Documents/work1.txt").toPath(), new File("/Users/eppra01/Documents/work/work1.txt").toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
