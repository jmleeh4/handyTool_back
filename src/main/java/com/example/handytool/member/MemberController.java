package com.example.handytool.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/member")
@Slf4j
public class MemberController {


    @GetMapping("/idCheck")
    @ResponseBody
    public int idCheck(@RequestParam("userId") String userId){

        String userId2 = userId;
        if(log.isDebugEnabled()){
            log.debug(userId2);
            log.debug("디버깅 가능하냐?");
        }

        return 0;
    }

}
