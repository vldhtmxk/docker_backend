package com.sist.docker_0320.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sist.docker_0320.vo.SampleVO;

@Mapper
public interface SampleMapper {
    List<SampleVO> all();
}
