# springboot message demo
一个简单的消息系统demo

1.springboot框架，移植友好
2.观察者模式： 不错过每一条消息
3.消息配置模板 :自动组装消息
4.支持 已读、未读、批量已读、删除、分页


# 思考

1.如果是多种客户端怎么获取消息
2.这套系统最大并发量是多少  瓶颈在哪里
3.如果用户获取了第一页消息，此时收到一条公共，再翻到第二页会发生什么，怎么进一步处理
4.怎么支持 对话消息


# 调试参数
url: http://localhost:8080/message/message-notice
POST
```json
{
    "templateType": 1,
    "message":{"age":"26","name":"zitong","staffName":"陈一凡"}

}
```