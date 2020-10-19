package web.project.seok.dao;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import web.project.seok.dto.BoardDto;
import web.project.seok.dto.TestDto;


@SpringBootTest
@Transactional
class BoardDaoTest {

    @Autowired
    private BoardDao dao;

    @Test
    void savePost() {
        BoardDto dto=new BoardDto();
        dto.setWriter("mybatis");
        dto.setTitle("mybatis");
        dto.setContent("mybatis");

        Assertions.assertThat(dto.getContent()).isEqualTo("mybatis");

        dao.savePost(dto);
    }
    @Test
    void testPost(){
        TestDto dto=new TestDto();
        dto.setAge(100);
        dto.setName("seok");
        dao.testInsert(dto);
    }

    @Test
    void deletePost(){
        dao.deletePost((long) 1);
    }
}