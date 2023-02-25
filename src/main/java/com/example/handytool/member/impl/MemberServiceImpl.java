package com.example.handytool.member.impl;

import com.example.handytool.member.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    private Logger log = LoggerFactory.getLogger(MemberServiceImpl.class);

    @Override
    public int idCheck(HashMap<String, String> map) {
        String userId = map.get("userId");
        log.debug(userId);
        return 0;
    }
}
