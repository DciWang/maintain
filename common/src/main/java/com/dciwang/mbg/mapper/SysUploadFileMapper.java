package com.dciwang.mbg.mapper;

import com.dciwang.mbg.model.SysUploadFile;
import com.dciwang.mbg.model.SysUploadFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUploadFileMapper {
    int countByExample(SysUploadFileExample example);

    int deleteByExample(SysUploadFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysUploadFile record);

    int insertSelective(SysUploadFile record);

    List<SysUploadFile> selectByExample(SysUploadFileExample example);

    SysUploadFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysUploadFile record, @Param("example") SysUploadFileExample example);

    int updateByExample(@Param("record") SysUploadFile record, @Param("example") SysUploadFileExample example);

    int updateByPrimaryKeySelective(SysUploadFile record);

    int updateByPrimaryKey(SysUploadFile record);
}