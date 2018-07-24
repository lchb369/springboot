package com.springcloud.lab.feedservice.dto.result;

import lombok.Data;

/**
 * Created by lchb on 2017-9-14.
 */
@Data
public class FeedTagResult {

    private Integer id;

    private Long feedId;

    private String name;
}
