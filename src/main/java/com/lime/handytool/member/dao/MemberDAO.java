package com.lime.handytool.member.dao;

import org.apache.ibatis.annotations.Mapper;

public interface MemberDAO {

    /*
        아이디 중복 체크
            tranId      : Mb-001
            tranName    : idCheck
            developer   : jmleeh4
            Desc        : 아이디 중복 체크
            parameter   : HashMap<S,S>
            result      : int
    */
    @Mapper
    public int idCheck(String userId);

}
