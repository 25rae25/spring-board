package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BoardController {

    @GetMapping("/board") // 해당 요청을 처리하도록, 메소드 등록하는곳
    public String board() {
        return "board/index"; // 뷰페이지 설정하는곳
    }
}
