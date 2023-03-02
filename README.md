<h1 align="center">FACE-UI</h1>

FACE-UI 基于前后端分离Web端项目，主要实现了网页版的人脸登录，通过调取前端摄像头拍照，传入后台进行跟数据库人脸库的相似度比对，技术的用点：Springboot，Mysql，JWT，VUE 2.X 等等技术实现，主要功能点：人脸列表CRUD，日志列表CRUD，基于自建人脸库通过base64编码方式存储人脸图片，通过调用腾讯云人脸对比API场景实现

### 工程介绍

#### 1，face-easy (后端springboot工程)

项目地址：[susantyp/face-easy (gitee.com)](https://gitee.com/susantyp/face-easy)

0.1-拉取代码

0.2-在工程sql文件夹下面，有基于mysql的sql脚本

0.3-在application.yml文件中配置腾讯云的secretId和secretKey

0.4-无腾讯云账号先去开通，参考帖子https://blog.csdn.net/Susan003/article/details/125914027

0.5-启动FaceEasyApplication

0.6-swagger地址http://localhost:8089/swagger-ui.html#/

#### 2，face-ui(前端VUE 2.X 工程)

项目地址：[susantyp/face-ui (gitee.com)](https://gitee.com/susantyp/face-ui)

0.1-拉取代码

0.2-npm install 安装依赖

0.3-npm run serve 运行服务

0.4-http://127.0.0.1:8080/

0.5-刚进入浏览器，需要授权浏览器摄像头权限，点击同意即可

### 配置腾讯云
详细文档：https://blog.csdn.net/Susan003/article/details/125914027?spm=1001.2014.3001.5502
### 工程搭建教程
https://mp.weixin.qq.com/s?__biz=MzI4Njc5NjM1NQ==&mid=2247536082&idx=1&sn=3b6e42ab1b73bdfae5b399cfbc4c303a&chksm=ebd572fedca2fbe89a052ca61c894f2f02fac9d7a7278f959d18b1372ea00b9f5d0777cd7a1a&scene=132#wechat_redirect