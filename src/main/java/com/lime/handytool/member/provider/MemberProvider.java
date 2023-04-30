package com.lime.handytool.member.provider;

public interface MemberProvider {

    /*
        아이디 중복 체크
            tranId      : Mb-001
            tranName    : idCheck
            developer   : jmleeh4
            Desc        : 아이디 중복 체크
            parameter   : HashMap<S,S>
            result      : int
    */
    public int idCheck(String userId);

    //브랜치 테스트

}
