package com.hust.mapper;

import com.hust.pojo.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherMapper {
    int insertTeacher(Teacher teacher);

    int deleteTeacher(int tid);

    Teacher getByTid(int tid);

    List<Teacher> getByTname(Map<String,Object> data);

    List<Teacher> getTeachers(Map<String,Object> data);

    Teacher queryByNamePwd(int tid, String pwd);
}
