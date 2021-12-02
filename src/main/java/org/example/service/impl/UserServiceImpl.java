package org.example.service.impl;

import org.example.dao.StudentDOMapper;
import org.example.dataobject.StudentDO;
import org.example.service.UserService;
import org.example.service.model.StudentModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private StudentDOMapper studentDOMapper;
    @Override
    public StudentModel getRecommend(String Sno) {
        //调用DoMapper返回学生对象
        StudentDO studentDO=studentDOMapper.selectByPrimaryKey(Sno);
        return convertFromDataObject(studentDO);

    }

    private StudentModel convertFromDataObject(StudentDO studentDO){
        if(studentDO==null)return null;
        StudentModel studentModel=new StudentModel();
        BeanUtils.copyProperties(studentDO,studentModel);
        return studentModel;
    }
}
