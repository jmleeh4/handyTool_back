package com.lime.handytool.member.manager;

import com.lime.handytool.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/member")
@Slf4j
public class MemberController {





    @Autowired
    private MemberService memberService;

    /*
        아이디 중복 체크
            tranId      : Mb-001
            tranName    : idCheck
            developer   : jmleeh4
            Desc        : 아이디 중복 체크
            parameter   : HashMap<S,S>
            result      : int
    */
    @GetMapping("/idCheck")
    @ResponseBody
    public int idCheck(@RequestParam("userId") String paramUserId){

        String userId = paramUserId;
        int result = 0;
        try {
            result = memberService.idCheck(userId);
        }catch(Exception e){
            e.printStackTrace();
        }

        return result;
    }

}
