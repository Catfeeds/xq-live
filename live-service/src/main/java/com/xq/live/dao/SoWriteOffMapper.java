package com.xq.live.dao;

import com.xq.live.model.SoWriteOff;
import com.xq.live.vo.in.SoWriteOffInVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SoWriteOffMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SoWriteOff record);

    int insertSelective(SoWriteOff record);

    SoWriteOff selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SoWriteOff record);

    int updateByPrimaryKey(SoWriteOff record);

    List<SoWriteOff> list(SoWriteOffInVo inVo);

    int listTotal(SoWriteOffInVo inVo);
}