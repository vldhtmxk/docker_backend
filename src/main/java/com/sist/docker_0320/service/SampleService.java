package com.sist.docker_0320.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sist.docker_0320.mapper.SampleMapper;
import com.sist.docker_0320.vo.SampleVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleService {
    
    private final SampleMapper sampleMapper;

    public List<SampleVO> getAll(){
        return sampleMapper.all();
    }
}
