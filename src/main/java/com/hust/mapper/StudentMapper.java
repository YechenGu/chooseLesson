package com.hust.mapper;

import com.hust.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    int insertStudent(Student student);

    int deleteStudent(int sid);

    Student getBySid(int sid);

    List<Student> getBySname(Map<String,Object> data);

    List<Student> getStudents(Map<String,Object> data);

    Student queryByNamePwd(int sid,String pwd);
}
