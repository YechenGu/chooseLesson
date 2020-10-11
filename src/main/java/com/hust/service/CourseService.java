package com.hust.service;

import com.hust.pojo.Course;

import java.util.List;

public interface CourseService {
    /**
     *  添加课程
     * @param course   课程信息
     * @return  插入结果 !=0则插入成功
     */
    int insertCourse(Course course);

    /**
     *  根据课程编号删除课程信息信息
     * @param cid   课程编号
     * @return  删除结果，!=0则删除成功
     */
    int deleteCourse(int cid);
    /**
     *  根据课程编号查询出课程实体
     * @param cid
     * @return
     */
    Course getByCouCid(int cid);
    /**
     * 查询全部可选课程，按照sql语句进行分页
     * @param pageNo
     * @param pageSize
     * @return      查询结果
     */
    List<Course> selectCourseBySql(int pageNo, int pageSize,int sid);
    /**
     * 根据课程名称查询课程信息
     * @param pageNo
     * @param pageSize
     * @param cname     课程名称
     * @return  查询结果
     */
    List<Course> getByCourseCname(int pageNo, int pageSize,String cname);


}
