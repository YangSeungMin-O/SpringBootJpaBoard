package com.example.demo.controller;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    //localhost:8080/board/write
    @GetMapping("/board/write")
    public String boardWriteForm() {
        return "boardWrite";
    }

    @PostMapping("/board/write/data")
    public String boardWriteData(Board board) {
        //sysout 단축키는 sout
        System.out.println("제목 : " + board.getTitle() + "\n" + "내용 : " + board.getContent());

        boardService.write(board);
        return "";
    }
}
