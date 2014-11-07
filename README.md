手机安全卫士
==========

MobileSafe



----------

## 版本1.2 ##

更新日期

- 20141107

功能

- 提供新版本下载

新增文件

No  |文件名  | 说明
--- |------------- | -------------
1  |DownLoadUtil.java  | 提供下载功能
2  |MainActivity.java  | 主界面

修改文件

No  |文件名  | 说明
--- |------------- | -------------
1  |SplashActivity.java  | 增加响应下载的方法
2  |AndroidManifest.xml  | 注册MainActivity


----------
## 版本1.1 ##

更新日期

- 20141107

功能

- 提示版本升级

运行前准备

1. 解压缩tomcat至D:\adt-bundle-windows-x86-20130219\apache-tomcat-6.0.37\
2. 将documents\v1.1下的info.xml拷贝到D:\adt-bundle-windows-x86-20130219\apache-tomcat-6.0.37\webapps\ROOT下

运行结果

- 见documents\v1.1\update_info.png

新增文件

- UpdateInfoParser.java
- UpdateInfo.java
- notification.png
- config.xml


----------
## 版本1.0 ##

更新日期

- 20141106

功能

- 初始化界面，包含版本信息和程序加载进度框

开发环境（ADT）

- adt-bundle-windows-x86-20130219

新增文件

- activity_splash.xml
- logo2.jpg
- SplashActivity.java