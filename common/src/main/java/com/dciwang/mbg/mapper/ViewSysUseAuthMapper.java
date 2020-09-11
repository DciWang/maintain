package com.dciwang.mbg.mapper;

import com.dciwang.mbg.model.ViewSysUseAuth;
import com.dciwang.mbg.model.ViewSysUseAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewSysUseAuthMapper {
    int countByExample(ViewSysUseAuthExample example);

    int deleteByExample(ViewSysUseAuthExample example);

    int insert(ViewSysUseAuth record);

    int insertSelective(ViewSysUseAuth record);

    List<ViewSysUseAuth> selectByExampleWithBLOBs(ViewSysUseAuthExample example);

    List<ViewSysUseAuth> selectByExample(ViewSysUseAuthExample example);

    int updateByExampleSelective(@Param("record") ViewSysUseAuth record, @Param("example") ViewSysUseAuthExample example);

    int updateByExampleWithBLOBs(@Param("record") ViewSysUseAuth record, @Param("example") ViewSysUseAuthExample example);

    int updateByExample(@Param("record") ViewSysUseAuth record, @Param("example") ViewSysUseAuthExample example);
}