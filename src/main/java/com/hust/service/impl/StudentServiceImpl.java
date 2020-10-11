package com.hust.service.impl;

import com.hust.mapper.StudentMapper;
import com.hust.pojo.Student;
import com.hust.service.StudentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService {
    private StudentMapper studentMapper;

    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    public int deleteStudent(int sid) {
        return studentMapper.deleteStudent(sid);
    }

    public Student getBySid(int sid) {
        return studentMapper.getBySid(sid);
    }

    public List<Student> getBySname(String sname, int pageNo, int pageSize) {
        Map<String,Object> data = new HashMap<String, Object>();
        data.put("sname",sname);
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        return studentMapper.getBySname(data);
    }

    public List<Student> getStudents(int pageNo, int pageSize) {
        Map<String,Object> data = new HashMap<String, Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        return studentMapper.getBySname(data);
    }

    public Student queryByNamePwd(int sid, String pwd) {
        return studentMapper.queryByNamePwd(sid,pwd);
    }


}
