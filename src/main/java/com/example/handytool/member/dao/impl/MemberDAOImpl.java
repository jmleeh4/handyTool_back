package com.example.handytool.member.dao.impl;

import com.example.handytool.member.dao.MemberDAO;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {

    /*
        아이디 중복 체크
            tranId      : Mb-001
            tranName    : idCheck
            developer   : jmleeh4
            Desc        : 아이디 중복 체크
            parameter   : HashMap<S,S>
            result      : int
    */
    @Override
    public int idCheck(String userId) {

        return 0;
    }
}
