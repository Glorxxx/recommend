package org.example.service;

import org.example.service.model.StudentModel;

public interface UserService {

    //通过ID获取推荐信息
    StudentModel getRecommend(String Sno);
}
