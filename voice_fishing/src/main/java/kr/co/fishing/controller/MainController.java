package kr.co.fishing.controller;

import kr.co.fishing.service.AdminLoginProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 사용자의 요청을 처리하는 Controller
 */
@Controller
public class MainController {

    @Autowired
    private AdminLoginProcess loginProcess;

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String homePage() {
        return "redirect:http://localhost:8080/index.html";
    }

}
