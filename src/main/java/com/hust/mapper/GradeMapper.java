package com.hust.mapper;

import com.hust.pojo.Grade;

import java.util.List;
import java.util.Map;

public interface GradeMapper{
    int insertGrade(Grade grade);

    int modifyGrade(Grade grade);

    int queryCreditsSum(int sid);

    List<Grade> getEedCourseBySid(Map<String,Object> data);
}
