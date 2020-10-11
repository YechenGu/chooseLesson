package com.hust.service.impl;

import com.hust.mapper.AdminMapper;
import com.hust.pojo.Admin;
import com.hust.service.AdminService;

public class AdminServiceImpl implements AdminService {
    private AdminMapper adminMapper;

    public Admin queryByNamePwd(int aid, String pwd) {
        return adminMapper.queryByNamePwd(aid,pwd);
    }
}
