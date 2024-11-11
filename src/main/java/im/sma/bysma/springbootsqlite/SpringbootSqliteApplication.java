package im.sma.bysma.springbootsqlite;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSqliteApplication {

	public static void main(String[] args) {
		File dbDirectory = new File("./db");
		if (!dbDirectory.exists()) {
			dbDirectory.mkdirs(); // Creates the db directory if it doesn't exist
			System.out.println("Created 'db' directory for SQLite database.");
		}

		SpringApplication.run(SpringbootSqliteApplication.class, args);
	}

}
