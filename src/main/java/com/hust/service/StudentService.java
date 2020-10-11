package com.hust.service;

import com.hust.pojo.Student;

import java.util.List;

public interface StudentService {
    /**
     *  添加学生
     * @param student   学生信息
     * @return  插入结果 !=0则插入成功
     */
    int insertStudent(Student student);
    /**
     *  根据学号删除学生信息
     * @param sid   学号
     * @return  删除结果，!=0则删除成功
     */
    int deleteStudent(int sid);
    /**
     *  根据学号查询出学生实体
     * @param sid
     * @return
     */
    Student getBySid(int sid);
    /**
     *  根据学生姓名模糊查询出学生实体
     * @param sname
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Student> getBySname(String sname,int pageNo, int pageSize);
    /**
     *  查询所有学生
     * @param  pageNo
     * @param pageSize
     * @return
     */
    List<Student> getStudents(int pageNo, int pageSize);
    /**
     *  学生登录设置
     * @param sid   学号（唯一）
     * @param pwd   密码
     * @return
     */
    Student queryByNamePwd(int sid, String pwd);
}
