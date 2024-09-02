package ljk.personal.board.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ljk.personal.board.service.PostService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/post")
@RequiredArgsConstructor
public class PostController {

	private final PostService postService;

	@PostMapping
	public void createPost() {

	}

	@PutMapping("/{postId}")
	public void updatePost(@PathVariable Long postId) {

	}

	@DeleteMapping("/{postId}")
	public void deletePost(@PathVariable Long postId) {

	}

	@GetMapping("/{postId}")
	public void readPost(@PathVariable Long postId
	) {

	}
}
