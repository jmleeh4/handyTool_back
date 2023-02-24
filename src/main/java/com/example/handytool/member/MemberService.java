package com.example.handytool.member;

import java.util.HashMap;

public interface MemberService {

    /*
        아이디 중복 체크
            tranId      : Mb-001
            tranName    : idCheck
            developer   : jmleeh4
            Desc        : 아이디 중복 체크
            parameter   : HashMap<S,S>
            result      : int
    */
    public int idCheck(HashMap<String, String> map);

}
