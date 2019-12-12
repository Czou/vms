#### 应用架构
![image](http://m.qpic.cn/psb?/V10Seycz1c5XVt/rFqciD0ZWRsHPZhmuLcCc1IH1qA96qQg2*vgiUr2q4k!/b/dL8AAAAAAAAA&bo=XwU4BAAAAAARB1Y!&rf=viewer_4)

#### 核心依赖 


依赖 | 版本
---|---
Spring Boot |  2.1.6.RELEASE  
Spring Cloud Alibaba | 2.1.1.RELEASE   
Spring Cloud | Spring Cloud Greenwich


#### 模块说明
```lua
vms
├── vms-common -- 系统公共模块 
     ├── vms-common-core -- 公共工具类核心包
     └── vms-common-log -- 日志服务
├── vms-iot-gateway -- 会话管理模块[9999]
├── vms-nacos -- 服务注册与发现[8848]
├── vms-service 业务模块
     ├──vms-service-device -- 设备管理服务模块[7100]

```

#### 编码规范

###### 参照Alibaba Java规范手册


#### 注意事项

#### 版本功能
