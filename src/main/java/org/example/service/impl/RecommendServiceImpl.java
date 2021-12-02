package org.example.service.impl;

import org.example.dao.alsTab1DOMapper;
import org.example.dataobject.alsTab1DO;
import org.example.service.RecommendService;
import org.example.service.model.alsTab1Model;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class RecommendServiceImpl implements RecommendService {
    @Autowired
    private alsTab1DOMapper alsTab1DOMapper;
    @Override
    public List<alsTab1DO> getRecommend(Integer user_id) {
        alsTab1DO alsTab1DO=alsTab1DOMapper.selectByPrimaryKey(user_id);
        List<alsTab1DO> list=alsTab1DOMapper.selectByUserId(user_id);
        return list;
    }
}
