
package com.springcloud.lab.feedservice.controller;

import com.springcloud.lab.feedservice.dao.elasticsearch.docs.FeedDoc;
import com.springcloud.lab.feedservice.dto.params.FeedQueryRequest;
import com.springcloud.lab.feedservice.dto.params.FeedRequest;
import com.springcloud.lab.feedservice.dto.result.FeedDetailResult;
import com.springcloud.lab.feedservice.dto.result.FeedResult;
import com.springcloud.lab.feedservice.dto.result.JsonResultVo;
import com.springcloud.lab.feedservice.service.FeedSearchService;
import com.springcloud.lab.feedservice.service.FeedService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by admin on 2017/7/9.
 */

@RestController
public class FeedController extends BaseController {

    @Autowired
    FeedService feedService;

    @Autowired
    FeedSearchService feedSearchService;

    private Logger logger=LoggerFactory.getLogger(FeedController.class);

    /**
     * 保存Feed
     * @param feedRequestVo
     * @return
     */
    public JsonResultVo save(@Valid FeedRequest feedRequestVo){
        logger.info("save...");
        FeedDetailResult detailResultVo=feedService.saveFeed(feedRequestVo);
        return JsonResultVo.buildResultVo(detailResultVo);
    }

    /**
     * 删除Feed
     * @return
     */
    public JsonResultVo delete(@PathVariable Long id){
        feedService.deleteFeed(id);
        return JsonResultVo.buildSuccessVo();
    }

    /**
     * 获取详情
     * @param id
     * @return
     */
    public JsonResultVo detail(@PathVariable Long id){

        System.out.println("=======detail=======");
        FeedDetailResult detailResultVo=feedService.getDetail(id);
        return JsonResultVo.buildResultVo(detailResultVo);
    }

    /**
     * 获取列表
     * @param requestVo
     * @return
     */
    public JsonResultVo list(FeedQueryRequest requestVo){
        FeedResult feedResultVo=feedService.queryList(requestVo);
        return JsonResultVo.buildResultVo(feedResultVo);
    }

    /**
     * 获取列表
     * @param requestVo
     * @return
     */
    public JsonResultVo search(FeedQueryRequest requestVo) {
        List<FeedDoc> feedDocList = feedSearchService.search(requestVo);
        return JsonResultVo.buildResultVo(feedDocList);
    }

}
