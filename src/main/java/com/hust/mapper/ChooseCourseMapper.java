package com.hust.mapper;

import com.hust.pojo.Course;

public interface ChooseCourseMapper {
    int chooseCourse(int cid, int sid);

    Course alreadyCourse(int cid, int sid);

    int exitCourse(int cid,int sid);
}
