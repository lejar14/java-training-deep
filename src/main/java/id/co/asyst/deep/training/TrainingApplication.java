package id.co.asyst.deep.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);
	}

}

// Add a REST controller class to create an endpoint
@RestController
class MyController {

	// Define a GET endpoint to return a list of 5 string elements using ResponseEntity
	@GetMapping("/list")
	public ResponseEntity<List<String>> getList() {
		List<String> values = Arrays.asList("satu", "dua", "tiga", "empat", "lima");

		// Simple 200 OK response with the body
		return ResponseEntity.ok(values);
	}

}
