package com.hust.service.impl;

import com.hust.mapper.CourseMapper;
import com.hust.pojo.Course;
import com.hust.service.CourseService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseServiceImpl implements CourseService {
    private CourseMapper courseMapper;

    public int insertCourse(Course course) {
        return courseMapper.insertCourse(course);
    }

    public int deleteCourse(int cid) {
        return courseMapper.deleteCourse(cid);
    }

    public Course getByCouCid(int cid) {
        return courseMapper.getByCouCid(cid);
    }

    public List<Course> selectCourseBySql(int pageNo, int pageSize, int sid) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("sid",sid);
        return courseMapper.selectCourseBySql(data);
    }

    public List<Course> getByCourseCname(int pageNo, int pageSize, String cname) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("cname",cname);
        return courseMapper.selectCourseBySql(data);
    }
}
