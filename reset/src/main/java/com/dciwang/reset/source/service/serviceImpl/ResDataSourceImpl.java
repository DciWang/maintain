package com.dciwang.reset.source.service.serviceImpl;

import com.dciwang.common.api.CommonResult;
import com.dciwang.common.api.DataSourceKeyCode;
import com.dciwang.common.code.OptType;
import com.dciwang.mbg.mapper.ResDataSourceMapper;
import com.dciwang.mbg.mapper.ResDataSourcePropMapper;
import com.dciwang.mbg.model.ResDataSource;
import com.dciwang.mbg.model.ResDataSourceExample;
import com.dciwang.mbg.model.ResDataSourceProp;
import com.dciwang.mbg.model.ResDataSourcePropExample;
import com.dciwang.message.MessageIdConstants;
import com.dciwang.common.code.DataSourceType;
import com.dciwang.reset.source.mapper.RestDataSouceDao;
import com.dciwang.reset.source.mapper.RestDataSoucePropDao;
import com.dciwang.reset.source.service.ResDataSourceService;
import com.dciwang.reset.source.vo.ResDataSourceVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author DciWang
 * @Description TODO  ResDataSourceService实现类
 * @Date 2020/8/27 下午3:59
 * @Version 1.0
 */
@Service
public class ResDataSourceImpl implements ResDataSourceService {
    @Autowired
    private ResDataSourceMapper resDataSourceMapper;
    @Autowired
    private RestDataSouceDao restDataSouceDao;
    @Autowired
    private ResDataSourcePropMapper resDataSourcePropMapper;
    @Autowired
    private RestDataSoucePropDao restDataSoucePropDao;


    /**
     * 获取数据源列表
     *
     * @return list
     */
    @Override
    public List<ResDataSourceVO> resDataSourceList() {
        List<ResDataSource> result = resDataSourceMapper.selectByExample(new ResDataSourceExample());
        List<ResDataSourceVO> resDataSourceVOList = new ArrayList<>();
        result.stream().forEach(item -> {
            ResDataSourceVO resDataSourceVO = new ResDataSourceVO();
            /*将ResDataSource实例转换成resDataSourceVO实例*/
            BeanUtils.copyProperties(item, resDataSourceVO);
            resDataSourceVOList.add(resDataSourceVO);
        });
        /*根据name排序*/
        resDataSourceVOList.sort((t1, t2) -> t1.getName().compareToIgnoreCase(t2.getName()));

        return resDataSourceVOList;
    }

    /**
     * save ResDataSource
     * @param resDataSourceVO
     * @return
     */

    @Override
    public CommonResult<ResDataSource> insertOrEditDataSource(ResDataSourceVO resDataSourceVO) {
        ResDataSource resDataSource;
        String resDataSourceId;
        /*判断写类型， 在resDataSource set数据*/
        if (OptType.ADD.is(resDataSourceVO.getOptType())) {
            int count = restDataSouceDao.countDataSouceByName(resDataSourceVO.getName());
            if (count > 0) {
                return CommonResult.failed(MessageIdConstants.MESSAGE_E0001);
            }
            resDataSource = new ResDataSource();
            resDataSourceId = UUID.randomUUID().toString();
            resDataSource.setId(resDataSourceId);
        } else {
            int count = restDataSouceDao.countDataSouceByIdAndName(resDataSourceVO.getId(), resDataSourceVO.getName());
            if (count > 0) {
                return CommonResult.failed(MessageIdConstants.MESSAGE_E0001);
            } else {
                resDataSource = resDataSourceMapper.selectByPrimaryKey(resDataSourceVO.getId());
                resDataSourceId = resDataSource.getId();
            }
        }
        BeanUtils.copyProperties(resDataSourceVO,resDataSource);
            resDataSource.setId(resDataSourceId);
          /*  resDataSource.setName(resDataSourceVO.getName());
            resDataSource.setType(resDataSourceVO.getType());
            resDataSource.setHost(resDataSourceVO.getHost());
            resDataSource.setPort(resDataSourceVO.getPort());
            resDataSource.setSchemaName(resDataSourceVO.getSchemaName());
            resDataSource.setUsername(resDataSourceVO.getUsername());
            resDataSource.setPassword(resDataSourceVO.getPassword());
            resDataSource.setRemark(resDataSourceVO.getRemark());*/

        /*判断写类型，数据库写数据*/
        if (OptType.ADD.is(resDataSourceVO.getOptType())) {
            resDataSourceMapper.insert(resDataSource);
        } else {
            resDataSourceMapper.updateByPrimaryKey(resDataSource);
        }
        saveResDataSourceProp(resDataSourceVO, resDataSourceId);

        return CommonResult.success(resDataSource);
    }

    /**
     * save  ResDataSourceProp
     *
     * @param resDataSourceVO
     * @param resDataSourceId
     * @return
     */
    public CommonResult<ResDataSourceProp> saveResDataSourceProp(ResDataSourceVO resDataSourceVO, String resDataSourceId) {

        ResDataSourcePropExample resDataSourcePropExample;
        /*判断是否为hdfs*/
        ResDataSourceProp resDataSourceProp = new ResDataSourceProp();
        if (DataSourceType.HDFS.is(resDataSourceVO.getType())) {
            //如果是修改则删除之前记录
            if (OptType.EDIT.is(resDataSourceVO.getOptType())) {
                resDataSourcePropExample = restDataSoucePropDao.getDataSouceByResDataSourceId(resDataSourceId);
                resDataSourcePropMapper.deleteByExample(resDataSourcePropExample);
            }

            //set  datasourceId
            resDataSourceProp.setDataSourceId(resDataSourceId);
            //set property key
            resDataSourceProp.setKey(DataSourceKeyCode.DataSourceKeyCode.HDFS_ROOT_PATH);
            //set property value
            resDataSourceProp.setValue(resDataSourceVO.getRootPath());
            resDataSourcePropMapper.insert(resDataSourceProp);
        }
        //判断是否为oracle
        if (DataSourceType.ORACLE.is(resDataSourceVO.getType())) {
            //如果是修改则删除之前记录
            if (OptType.EDIT.is(resDataSourceVO.getOptType())) {
                resDataSourcePropExample = restDataSoucePropDao.getDataSouceByResDataSourceId(resDataSourceId);
                resDataSourcePropMapper.deleteByExample(resDataSourcePropExample);
            }
            resDataSourceProp.setDataSourceId(resDataSourceId);
            //set  oracle连接方式key
            resDataSourceProp.setKey(DataSourceKeyCode.DataSourceKeyCode.ORACLE_DB_TYPE);
            //set  oracle连接方式value
            resDataSourceProp.setValue(resDataSourceVO.getDbType());
            resDataSourcePropMapper.insert(resDataSourceProp);
        }
        return CommonResult.success(resDataSourceProp);
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @Override
    public CommonResult<ResDataSource> delete(String id) {
        ResDataSource resDataSource=resDataSourceMapper.selectByPrimaryKey(id);
        ResDataSourcePropExample resDataSourcePropExample=restDataSoucePropDao.getDataSouceByResDataSourceId(resDataSource.getId());
        try {
            resDataSourceMapper.deleteByPrimaryKey(id);
            //删除res_data_source_prop中的记录
            resDataSourcePropMapper.deleteByExample(resDataSourcePropExample);
        }catch (Exception e){
            //失败返回message
            return CommonResult.failed(MessageIdConstants.MESSAGE_E0074);
        }
            //成功返回data
        return CommonResult.success(resDataSource);
    }
}
