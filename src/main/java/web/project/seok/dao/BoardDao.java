package web.project.seok.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import web.project.seok.dto.BoardDto;
import web.project.seok.dto.TestDto;

import java.util.List;

@Repository
@Mapper
public interface BoardDao {
    public void savePost(BoardDto boardDto);
    public List<BoardDto> getAllList();
    public void deletePost(Long id);
    public void testInsert(TestDto dto);
}
