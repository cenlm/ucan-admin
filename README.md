# ucan-admin

#### 介绍
基于RBAC3的权限管理系统。<br>
该系统使用Shiro作为用户认证与授权管理框架，实现了基于RBAC权限管理功能。<br>
技术栈:SSM + Shiro + Mysql + Maven + LayUi（及LayUi第三方插件）。<br>
基本功能：<br>
1.用户登录、认证授权、Session管理。<br>
2.组织结构管理、职位管理、用户管理、组织分配。<br>
3.角色管理：<br>
	3.1 角色基本信息管理。<br>
	3.2 角色分层、角色互斥、角色权限继承、角色分配、权限分配、角色用户数限制（待办）等。<br>
4.权限管理。<br>

#### 软件架构
软件架构说明<br>
1.数据库表结构图：<br>
![Image text](https://gitee.com/mrcen/ucan-admin/raw/master/src/main/webapp/imgs/db-erd.png)<br>

表名称说明：<br>
users: 用户表<br>
organization: 组织表（有上下级关系）<br>
post: 职位表（有上下级关系）<br>
roles: 角色表（有上下级关系）<br>
permissions: 权限表（有上下级关系）<br>
user_organization: <用户-组织>关系表<br>
user_post: <用户-职位>关系表<br>
role_organization: <角色-组织>关系表<br>
role_post: <角色-职位>关系表<br>
role_permission: <角色-权限>关系表<br>
mutex_roles: 互斥角色表<br>

其他后续可能会用到的表：<br>
group: 其他用户分组（非组织结构内人员或其他特殊情况）<br>
user_group: <用户-其他分组>关系表<br>
role_group: <角色-其他分组>关系表<br>
system: 系统编码表 （用于区分不同系统的权限信息）<br>
cross_role: 跨角色<br>
cross_permission: 跨权限<br>

#### 运行环境
1.  JDK 1.8+
2.  Spring 5.2.12.RELEASE
3.  shiro-core 1.10.1
4.  mysql 5.7.33
5.  layui 2.7.6
6.  tomcat-8.5.63
7.  maven

#### 效果图
![Image text](https://gitee.com/mrcen/ucan-admin/raw/master/src/main/webapp/imgs/login-effect.png)<br>
![Image text](https://gitee.com/mrcen/ucan-admin/raw/master/src/main/webapp/imgs/home-effect.png)<br>
![Image text](https://gitee.com/mrcen/ucan-admin/raw/master/src/main/webapp/imgs/user-effect.png)<br>
![Image text](https://gitee.com/mrcen/ucan-admin/raw/master/src/main/webapp/imgs/role-effect.png)<br>
![Image text](https://gitee.com/mrcen/ucan-admin/raw/master/src/main/webapp/imgs/permission-effect.png)<br>
![Image text](https://gitee.com/mrcen/ucan-admin/raw/master/src/main/webapp/imgs/setting-effect.png)<br>



#### 特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  Gitee 官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解 Gitee 上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是 Gitee 最有价值开源项目，是综合评定出的优秀开源项目
5.  Gitee 官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  Gitee 封面人物是一档用来展示 Gitee 会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
