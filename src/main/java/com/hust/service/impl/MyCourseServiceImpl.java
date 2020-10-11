package com.hust.service.impl;

import com.hust.mapper.MyCourseMapper;
import com.hust.pojo.Course;
import com.hust.service.MyCourseService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyCourseServiceImpl implements MyCourseService {
    private MyCourseMapper myCourseMapper;

    public List<Course> selectCourseBySql(int sid, int pageNo, int pageSize) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("sid",sid);
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        return myCourseMapper.selectCourseBySql(data);
    }

    public List<Course> getByCourseCname(int pageNo, int pageSize, String cname) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("cname",cname);
        return myCourseMapper.selectCourseBySql(data);
    }
}
