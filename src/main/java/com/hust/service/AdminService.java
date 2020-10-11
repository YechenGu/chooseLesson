package com.hust.service;

import com.hust.pojo.Admin;

public interface AdminService {
    /**
     *  管理员登录设置
     * @param aid   管理员账号
     * @param apassword   密码
     * @return
     */
    Admin queryByNamePwd(int aid, String apassword);
}
