# 一个Spring Boot开发模板
需要安装lombok插件


**swagger-bootstrap-ui RESTful APIs**


**简介**：swagger-bootstrap-ui

**HOST**:localhost:8023

**联系人**:developer@mail.com

**Version**:1.0

**接口路径**：/v2/api-docs


# feed-controller

## 删除Feed


**接口说明**:



**接口地址**:`/feed/v1/delete/{id}`


**请求方式**：`DELETE`


**consumes**:``


**produces**:`["*/*"]`



**请求参数**：

| 参数名称         | 说明     |     in |  是否必须      |  类型   |  schema  |
| ------------ | -------------------------------- |-----------|--------|----|--- |
|id| id  | path | true |integer  |    |

**响应数据**:

```json
{
	"data": {},
	"message": "",
	"status": 0
}
```

**响应参数说明**:


| 参数名称         | 说明                             |    类型 |  schema |
| ------------ | -------------------|-------|----------- |
|data|   |object  |    |
|message|   |string  |    |
|status|   |int32  |    |





**响应状态码说明**:


| 状态码         | 说明                             |    schema                         |
| ------------ | -------------------------------- |---------------------- |
| 200 | OK  |JsonResultVo|
| 204 | No Content  ||
| 401 | Unauthorized  ||
| 403 | Forbidden  ||
## 查看详情


**接口说明**:



**接口地址**:`/feed/v1/detail/{id}`


**请求方式**：`GET`


**consumes**:``


**produces**:`["*/*"]`



**请求参数**：

| 参数名称         | 说明     |     in |  是否必须      |  类型   |  schema  |
| ------------ | -------------------------------- |-----------|--------|----|--- |
|id| id  | path | true |integer  |    |

**响应数据**:

```json
{
	"data": {},
	"message": "",
	"status": 0
}
```

**响应参数说明**:


| 参数名称         | 说明                             |    类型 |  schema |
| ------------ | -------------------|-------|----------- |
|data|   |object  |    |
|message|   |string  |    |
|status|   |int32  |    |





**响应状态码说明**:


| 状态码         | 说明                             |    schema                         |
| ------------ | -------------------------------- |---------------------- |
| 200 | OK  |JsonResultVo|
| 401 | Unauthorized  ||
| 403 | Forbidden  ||
| 404 | Not Found  ||
## 获取列表


**接口说明**:



**接口地址**:`/feed/v1/list`


**请求方式**：`GET`


**consumes**:``


**produces**:`["*/*"]`



**请求参数**：

| 参数名称         | 说明     |     in |  是否必须      |  类型   |  schema  |
| ------------ | -------------------------------- |-----------|--------|----|--- |
|id|   | query | false |integer  |    |
|title|   | query | false |string  |    |
|type|   | query | false |integer  |    |
|author|   | query | false |string  |    |
|tag|   | query | false |string  |    |
|createTime|   | query | false |string  |    |
|page|   | query | false |integer  |    |
|limit|   | query | false |integer  |    |
|nativeQuery|   | query | false |integer  |    |

**响应数据**:

```json
{
	"data": {},
	"message": "",
	"status": 0
}
```

**响应参数说明**:


| 参数名称         | 说明                             |    类型 |  schema |
| ------------ | -------------------|-------|----------- |
|data|   |object  |    |
|message|   |string  |    |
|status|   |int32  |    |





**响应状态码说明**:


| 状态码         | 说明                             |    schema                         |
| ------------ | -------------------------------- |---------------------- |
| 200 | OK  |JsonResultVo|
| 401 | Unauthorized  ||
| 403 | Forbidden  ||
| 404 | Not Found  ||
## 发布/修改Feed


**接口说明**:



**接口地址**:`/feed/v1/save`


**请求方式**：`POST`


**consumes**:`["application/json"]`


**produces**:`["*/*"]`



**请求参数**：

| 参数名称         | 说明     |     in |  是否必须      |  类型   |  schema  |
| ------------ | -------------------------------- |-----------|--------|----|--- |
|id| Feed ID,如果大于0更新，否则创建  | query | false |integer  |    |
|userId| UserId用户ID  | query | false |integer  |    |
|title| Feed标题  | query | false |string  |    |
|type| Feed类型  | query | false |integer  |    |
|content| Feed内容  | query | false |string  |    |
|author| Feed作者名称  | query | false |string  |    |
|tags| Tag列表，多个用逗号隔开  | query | false |string  |    |

**响应数据**:

```json
{
	"data": {},
	"message": "",
	"status": 0
}
```

**响应参数说明**:


| 参数名称         | 说明                             |    类型 |  schema |
| ------------ | -------------------|-------|----------- |
|data|   |object  |    |
|message|   |string  |    |
|status|   |int32  |    |





**响应状态码说明**:


| 状态码         | 说明                             |    schema                         |
| ------------ | -------------------------------- |---------------------- |
| 200 | OK  |JsonResultVo|
| 201 | Created  ||
| 401 | Unauthorized  ||
| 403 | Forbidden  ||
| 404 | Not Found  ||
