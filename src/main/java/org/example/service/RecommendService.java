package org.example.service;

import org.example.dataobject.alsTab1DO;
import org.example.service.model.alsTab1Model;

import java.util.List;

public interface RecommendService {
    public List<alsTab1DO> getRecommend(Integer user_id);
}
