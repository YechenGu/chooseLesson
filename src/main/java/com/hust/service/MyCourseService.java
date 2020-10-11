package com.hust.service;

import com.hust.pojo.Course;

import java.util.List;

public interface MyCourseService {
    /**
     * 查询全部已修课程，按照sql语句进行分页
     * @param sid
     * @param pageNo
     * @param pageSize
     * @return      查询结果
     */
    List<Course> selectCourseBySql(int sid,int pageNo, int pageSize);
    /**
     * 根据课程名称查询课程信息
     * @param pageNo
     * @param pageSize
     * @param cname     课程名称
     * @return  查询结果
     */
    List<Course> getByCourseCname(int pageNo, int pageSize, String cname);
}
