package org.example.controller;

import org.example.dataobject.alsTab1DO;
import org.example.service.RecommendService;
import org.example.service.UserService;
import org.example.service.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class FindRecommend {
    @Autowired
    private RecommendService recommendService;

    @RequestMapping("/getRecommend")
    public List<alsTab1DO> getRecommend(@RequestParam(name="user_id")Integer Sno){
        //调用service 返回对象
        List<alsTab1DO> list=recommendService.getRecommend(Sno);
        return list;



    }

    public String toString(alsTab1DO als){
        return "Recommendation"+" id= "+als.getUserId()+", article_id"+als.getArticleId();
    }
}
