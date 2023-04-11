package javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BooksConfig {
	
	@Bean
	public Book getBook() {
		return new Book(1901,"Spring Notes", "Daniel Presty");
	}

}
