package com.hust.service;

import com.hust.pojo.Course;

public interface ChooseCourseService {
    /**
     * 选课
     * @return  选课结果
     */
    int chooseCourse(int cid, int sid);
    /**
     * 判断是否加入过此课程
     * @param cid   课程编号
     * @param sid   学号
     * @return
     */
    Course alreadyCourse(int cid, int sid);
    /**
     * 退选
     * @param cid
     * @return
     */
    int exitCourse(int cid,int sid);

}
