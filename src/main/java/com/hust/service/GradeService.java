package com.hust.service;

import com.hust.pojo.Grade;

import java.util.List;

public interface GradeService {
    /**
     *添加成绩
     * @param grade   成绩
     * @return  插入结果 !=0则插入成功
     */
    int insertGrade(Grade grade);
    /**
     *修改成绩
     * @param grade   成绩
     * @return  修改结果 !=0则修改成功
     */
    int modifyGrade(Grade grade);
    /**
     * 	查询学生自己的总学分
     * @param sid
     * @return
     */
    int queryCreditsSum(int sid);
    /**
     * 	学生查看本人已修课程
     * @param sid
     * @return
     */
    List<Grade> getEedCourseBySid(int pageNo, int pageSize,int sid);
}
