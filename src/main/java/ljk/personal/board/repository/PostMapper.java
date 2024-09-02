package ljk.personal.board.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ljk.personal.board.model.Post;

@Mapper
public interface PostMapper {
	Post selectPostById(Long id);

	List<Post> selectAllPosts();

	void insertPost(Post post);
}
