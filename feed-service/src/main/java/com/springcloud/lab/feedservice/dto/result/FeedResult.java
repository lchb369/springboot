package com.springcloud.lab.feedservice.dto.result;

import lombok.Data;

import java.util.List;

@Data
public class FeedResult {

    List<FeedRowResult> list;

    Integer total;
}