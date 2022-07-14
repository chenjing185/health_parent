# 传智健康
## 项目的使用效果图
**后台**
![后台首页](https://s3.bmp.ovh/imgs/2022/07/13/3409a3971859a026.png)
![预约设置](https://s3.bmp.ovh/imgs/2022/07/13/515c3079176c8055.png)
![检查项管理](https://s3.bmp.ovh/imgs/2022/07/13/f12247ba8e057ec9.png)
**微信端**
![微信端首页](https://s3.bmp.ovh/imgs/2022/07/13/14408884f372f480.png)
## 技术栈
- 前端技术栈: HTML5、bootstrap、ElementUI、Vue.js、ajax 
- 分布式架构及权限技术栈: zookeeper、dubbo、Spring MVC、Spring Security 
- 分布式版本控制及报表技术栈: Git、Apache POI、Echarts 
- 持久化技术栈: MyBatis、MySQL
## 功能介绍
### 管理后台
- 运营统计: 将总的数据统计在表格中,如:预约套餐的统计、总会员数等 
- 套餐占比统计: 将会员预约的套餐以饼图的形式展示 
- 检查项管理: 检查项的列表查询、新增、修改以及删除 
- 检查组管理: 检查组的列表查询、新增以及修改 
- 套餐管理: 套餐的列表查询以及新增 
- 预约设置: 批量导入预约设置信息、日历展示预约设置信息以及基于日历实现预约设置
### 微信前端
- 体检预约：套餐列表展示以及套餐详情展示
## 安装/使用教程
- 首先克隆下载代码后，执行源码中/doc/health.sql的数据库脚本，创建数据库及数据表。
- 导入父工程pom.xml文件中的所有依赖包及插件。 
- 创建好数据库及数据表后，在health_service_provider/src/main/resources/spring-dao.xml文件中设置mysql的数据库连接字符串。 
- 运行启动，登录后台，默认登录名：admin，密码：admin
- > 本项目使用Mysql 8.0.29，注意数据库连接驱动包名与旧版不一致，导致连接失败的问题。
## 鸣谢
开发参考视频课程: [黑马传智健康](https://www.bilibili.com/video/BV1Bo4y117zV?vd_source=097405c691a08489951f9715804a0a90)