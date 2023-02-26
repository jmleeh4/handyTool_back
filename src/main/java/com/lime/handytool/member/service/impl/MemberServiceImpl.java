package com.lime.handytool.member.service.impl;

import com.lime.handytool.member.provider.MemberProvider;
import com.lime.handytool.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberProvider memberProvider;

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

        return memberProvider.idCheck(userId);
    }
}
