package com.pofol.main.member.service;

import com.pofol.main.member.repository.MemberRepository;
import com.pofol.main.member.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;


    @Override
    public MemberDto select(String id) {
        return memberRepository.selectMember(id);
    }

}
