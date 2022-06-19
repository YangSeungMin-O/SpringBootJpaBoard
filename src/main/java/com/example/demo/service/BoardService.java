package com.example.demo.service;

import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Autowired
    /* = new BoardRepository 이런식으로 사용 안해도됨 */
    private BoardRepository boardRepository;

    public void write(Board board) {
        boardRepository.save(board);
    }
}
