package web.project.seok.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.project.seok.dao.BoardDao;
import web.project.seok.dto.BoardDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BoardService {

    private BoardDao boardDao;

    @Autowired
    public BoardService(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    public List<BoardDto> getAllList(){
        return boardDao.getAllList();
    }

    public void savePost(BoardDto dto){
        boardDao.savePost(dto);
    }
}
