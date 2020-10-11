package com.hust.service.impl;

import com.hust.mapper.ChooseCourseMapper;
import com.hust.pojo.Course;
import com.hust.service.ChooseCourseService;

public class ChooseCourseServiceImpl implements ChooseCourseService {
    private ChooseCourseMapper chooseCourseMapper;

    public int chooseCourse(int cid, int sid) {
        return chooseCourseMapper.chooseCourse(cid,sid);
    }

    public Course alreadyCourse(int cid, int sid) {
        return chooseCourseMapper.alreadyCourse(cid,sid);
    }

    public int exitCourse(int cid, int sid) {
        return chooseCourseMapper.exitCourse(cid,sid);
    }
}
