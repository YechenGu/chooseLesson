package com.hust.pojo;

import lombok.Data;

@Data
public class Course {
    private int cid;
    private String cname;
    private String classroom;
    private int startWeek;
    private int endWeek;
    private int startLesson;
    private int endLesson;
    private int credit;
    private int hours;
    private int capacity;
    private int tid;
}
