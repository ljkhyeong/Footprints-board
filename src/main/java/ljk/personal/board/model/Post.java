package ljk.personal.board.model;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Post {
	private Long id;
	private Long userId;
	private String title;
	private String content;
	private String status;
	private Date createdAt;
}
