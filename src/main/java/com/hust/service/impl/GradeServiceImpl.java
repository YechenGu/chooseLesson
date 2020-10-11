package com.hust.service.impl;

import com.hust.mapper.GradeMapper;
import com.hust.pojo.Grade;
import com.hust.service.GradeService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeServiceImpl implements GradeService {
    private GradeMapper gradeMapper;

    public int insertGrade(Grade grade) {
        return gradeMapper.insertGrade(grade);
    }

    public int modifyGrade(Grade grade) {
        return gradeMapper.modifyGrade(grade);
    }

    public int queryCreditsSum(int sid) {
        return gradeMapper.queryCreditsSum(sid);
    }

    public List<Grade> getEedCourseBySid(int pageNo, int pageSize, int sid) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("sid",sid);
        return gradeMapper.getEedCourseBySid(data);
    }

}
