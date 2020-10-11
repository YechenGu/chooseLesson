package com.hust.service.impl;

import com.hust.mapper.TeacherMapper;
import com.hust.pojo.Teacher;
import com.hust.service.TeacherService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherServiceImpl implements TeacherService {
    private TeacherMapper teacherMapper;

    public int insertTeacher(Teacher teacher) {
        return teacherMapper.insertTeacher(teacher);
    }

    public int deleteTeacher(int tid) {
        return teacherMapper.deleteTeacher(tid);
    }

    public Teacher getByTid(int tid) {
        return teacherMapper.getByTid(tid);
    }

    public List<Teacher> getByTname(String tname, int pageNo, int pageSize) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("tname",tname);
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        return teacherMapper.getByTname(data);
    }

    public List<Teacher> getTeachers(int pageNo, int pageSize) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        return teacherMapper.getTeachers(data);
    }

    public Teacher queryByNamePwd(int tid, String pwd) {
        return teacherMapper.queryByNamePwd(tid,pwd);
    }
}
