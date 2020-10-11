package com.hust.service;

import com.hust.pojo.Teacher;

import java.util.List;

public interface TeacherService {
    /**
     *  添加教师
     * @param teacher   学生教师
     * @return  插入结果 !=0则插入成功
     */
    int insertTeacher(Teacher teacher);
    /**
     *  根据教师编号删除教师信息
     * @param tid   教师编号
     * @return  删除结果，!=0则删除成功
     */
    int deleteTeacher(int tid);
    /**
     *  根据教师编号查询出教师实体
     * @param tid
     * @return
     */
    Teacher getByTid(int tid);
    /**
     *  根据教师姓名模糊查询出教师实体
     * @param tname
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Teacher> getByTname(String tname,int pageNo, int pageSize);
    /**
     *  查询所有教师
     * @param  pageNo
     * @param pageSize
     * @return
     */
    List<Teacher> getTeachers(int pageNo, int pageSize);
    /**
     *  教师登录设置
     * @param tid   教师编号（唯一）
     * @param pwd   密码
     * @return
     */
    Teacher queryByNamePwd(int tid, String pwd);
}
