package com.what.eat.web.controller;

import com.what.eat.domain.dto.EatWhatDto;
import com.what.eat.domain.dto.Response;
import com.what.eat.domain.entity.FoodListEntity;
import com.what.eat.service.EatWhatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author dubaolong
 * @Date 2019/2/3 9:46 AM
 * @PackageName com.what.eat.web.controller
 */
@Controller
@RequestMapping("/")
public class BaseController {

    private Logger logger = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    private EatWhatService eatWhatService;

    @RequestMapping(value = "/getEat", method = RequestMethod.GET)
    public Response<FoodListEntity> getEat(EatWhatDto eatWhatDto) {
        Response<FoodListEntity> response = new Response<>();
        try {
            FoodListEntity eatFood = eatWhatService.getEatWhat(eatWhatDto);
            response.setEntity(eatFood);
            response.setMessage("成功");
        } catch (Exception e) {
            logger.info("##### 查询数据异常 ", e);
            response.setMessage("失败");
        }
        return response;
    }




}
