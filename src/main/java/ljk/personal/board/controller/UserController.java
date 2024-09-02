package ljk.personal.board.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@PostMapping("/join")
	public void createUser() {

	}

	@GetMapping("/{userId}")
	public void readUserInfo(@PathVariable Long userId) {

	}

	@PutMapping("/{userId}")
	public void editUserInfo(@PathVariable Long userId) {

	}

	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable Long userId) {

	}

}
