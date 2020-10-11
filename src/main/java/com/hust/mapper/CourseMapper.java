package com.hust.mapper;

import com.hust.pojo.Course;

import java.util.List;
import java.util.Map;

public interface CourseMapper {
    int insertCourse(Course course);

    int deleteCourse(int cid);

    Course getByCouCid(int cid);

    List<Course> selectCourseBySql(Map<String,Object> data);

    List<Course> getByCourseCname(Map<String,Object> data);
}
