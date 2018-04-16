package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.mapper.TbUserMapper;
import com.ssm.pojo.TbUser;
import com.ssm.pojo.TbUserExample;
import com.ssm.service.UserService;
import com.ssm.vo.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    /**
     *
     */
@Autowired
private TbUserMapper tbUserMapper;

    @Override
    public List<TbUser> findAll() {
        TbUserExample example=new TbUserExample();
        PageHelper.startPage(1,5);
        List<TbUser> tbUsers = tbUserMapper.selectByExample(example);
        PageInfo info=new PageInfo(tbUsers);
        DataResult result=new DataResult();
        result.setRows(tbUsers);
        result.setTotal(info.getTotal());
        return tbUsers;
    }
}
