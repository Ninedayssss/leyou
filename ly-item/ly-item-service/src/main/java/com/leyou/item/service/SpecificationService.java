package com.leyou.item.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.item.mapper.SpecGroupMapper;
import com.leyou.item.mapper.SpecParamMapper;
import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author itsNine
 * @create 2019-04-01-22:45
 */
@Service
public class SpecificationService {

    @Autowired
    private SpecGroupMapper groupMapper;

    @Autowired
    private SpecParamMapper paramMapper;


    public List<SpecGroup> queryGroupByCid(Long cid) {
        //查询条件
        SpecGroup group = new SpecGroup();
        group.setCid(cid);
        //查询
        List<SpecGroup> list = groupMapper.select(group);
        if (CollectionUtils.isEmpty(list)){
            //没查到
            throw new LyException(ExceptionEnum.SPEC_GROUP_NOT_FOND);
        }
        return list;
    }


    public List<SpecParam> queryParamList(Long gid,Long cid,Boolean searching) {
        SpecParam param = new SpecParam();
        param.setGroupId(gid);
        param.setCid(cid);
        param.setSearching(searching);


        List<SpecParam> list = paramMapper.select(param);
        if (CollectionUtils.isEmpty(list)){
            //没查到
            throw new LyException(ExceptionEnum.SPEC_PARAM_NOT_FOND);
        }
        return list;
    }

    public void saveSpecGroup(SpecGroup specGroup) {
        int count = groupMapper.insert(specGroup);
        if (count != 1){
            //插入未成功
            throw new LyException(ExceptionEnum.SPEC_GROUP_CREATE_FAILED);
        }
    }

    public void deleteSpecGroup(Long id) {
        if (id == null){
            throw new LyException(ExceptionEnum.INVALID_PARAM);
        }
        SpecGroup specGroup = new SpecGroup();
        specGroup.setId(id);
        int count = groupMapper.deleteByPrimaryKey(specGroup);
        if (count != 1){
            throw new LyException(ExceptionEnum.DELETE_SPEC_GROUP_FAILED);
        }
    }

    public void updateSpecGroup(SpecGroup specGroup) {
        int count = groupMapper.updateByPrimaryKey(specGroup);
        if (count != 1){
            throw new LyException(ExceptionEnum.UPDATE_SPEC_GROUP_FAILED);
        }
    }

    public void saveSpecParam(SpecParam specParam) {
        int count = paramMapper.insert(specParam);
        if (count != 1){
            throw new LyException(ExceptionEnum.SPEC_PARAM_CREATED_FAILED);
        }
    }


    public void deleteSpecParam(Long id) {
        if (id == null){
            throw new LyException(ExceptionEnum.INVALID_PARAM);
        }
        int count = paramMapper.deleteByPrimaryKey(id);
        if (count != 1){
            throw new LyException(ExceptionEnum.DELETE_SPEC_PARAM_FAILED);
        }
    }

    public void updateSpecParam(SpecParam specParam) {
        int count = paramMapper.updateByPrimaryKeySelective(specParam);
        if (count != 1){
            throw new LyException(ExceptionEnum.UPDATE_SPEC_PARAM_FAILED);
        }
    }

    public List<SpecGroup> queryListByCid(Long cid) {
        //查询规格组
        List<SpecGroup> specGroups = queryGroupByCid(cid);
        //查询当前分类下的参数
        List<SpecParam> specParams = queryParamList(null, cid, null);
        //先把规格参数变成map，map 的key是规格组的id，map是组下的所有参数
        Map<Long,List<SpecParam>> map = new HashMap<>();
        for (SpecParam param : specParams) {
            if (!map.containsKey(param.getGroupId())){
                //这个组id在map中不存在，新增一个list
                map.put(param.getGroupId(),new ArrayList<>());
            }
            map.get(param.getGroupId()).add(param);
        }

        //填充param到group
        for (SpecGroup specGroup : specGroups) {
            specGroup.setParams(map.get(specGroup.getId()));
        }

        return specGroups;
    }
}
