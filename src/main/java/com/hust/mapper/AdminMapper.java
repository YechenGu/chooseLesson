package com.hust.mapper;

import com.hust.pojo.Admin;

public interface AdminMapper {
    Admin queryByNamePwd(int aid, String pwd);
}
