package com.example.handytool.member.provider.impl;

import com.example.handytool.member.dao.MemberDAO;
import com.example.handytool.member.provider.MemberProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberProviderImpl implements MemberProvider {

    @Autowired
    private MemberDAO memberDAO;

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
        return memberDAO.idCheck(userId);
    }
}
