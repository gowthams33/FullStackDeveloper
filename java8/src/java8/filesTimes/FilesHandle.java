package java8.filesTimes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;
import java.util.List;

public class FilesHandle {

	public static void main(String[] args) {
		// Files Concepts in java8..............
		//Path path = Paths.get("E://file//text1.txt");
	/**	List<String> lines = null;
		String temp = "Hello World";
		Path newdir;
		try {
		// newdir = Files.createDirectories(path);
			Files.write(Paths.get("E://file//sample.txt"), temp.getBytes());
			System.out.println("Files write....");
			lines = Files.readAllLines(Paths.get("E://file//sample.txt"));
			//Files.delete(newdir);
			//Files.createFile(newdir);
			Files.copy(Paths.get("E://file//sample.txt"), Paths.get("E://file//text1.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String string : lines) {
			System.out.println(string);
		}
		*/
		
		System.out.println("Times New Interface  "+LocalDateTime.now() );
		System.out.println("local time  "+LocalDate.ofYearDay(2017, 21));
		System.out.println("local time  "+LocalDate.ofYearDay(2017, 21).atStartOfDay());
		System.out.println("local time  "+LocalDate.ofYearDay(2017, 01).plusDays(10));
	}

}
