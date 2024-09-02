package ljk.personal.board.controller;

import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CommentController {

	@PostMapping("/post/{postId}/comment")
	public void createComment(@PathVariable Long postId) {

	}

	@DeleteMapping("/post/{postId}/comment/{commentId}")
	public void deleteComment(@PathVariable Long postId, @PathVariable Long commentId) {

	}

	@GetMapping("/post/{postId}/comment")
	public void getCommentList(@PathVariable Long postId) {

	}
}
