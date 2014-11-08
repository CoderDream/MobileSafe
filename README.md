手机安全卫士
==========

MobileSafe

----------

## 版本2.1 ##

更新日期

- 20141108

功能

- 手机防盗之设置密码与验证密码

新增文件

No  |文件名  | 说明
--- |------------- | -------------
1  |first_entry_dialog.xml| 布局文件
2  |normal_entry_dialog.xml  | 布局文件
3  |Md5Encoder.java | MD5加密工具类
4  |LostProtectedActivity.java | 手机防盗


修改文件

No  |文件名  | 说明
--- |------------- | -------------
1  |AndroidManifest.xml | 注册“手机防盗”activity
2  |MainActivity.java | 添加“手机防盗”响应事件

----------

## 版本1.3 ##

更新日期

- 20141108

功能

- 关闭自动更新

新增文件

No  |文件名  | 说明
--- |------------- | -------------
1  |setting_center.xml| 布局文件
2  |jiantou1.png  | 图片文件
3  |listview_devider.png | 图片文件
4  |SettingCenterActivity.java | 设置中心


修改文件

No  |文件名  | 说明
--- |------------- | -------------
1  |AndroidManifest.xml | 注册“控制中心”activity
2  |MainActivity.java | 添加“设置中心”响应事件
----------

## 版本1.2 ##

更新日期

- 20141108

功能

- 程序主界面的UI设计

新增文件

No  |文件名  | 说明
--- |------------- | -------------
1  |bg_normal_pressed.xml| 样式文件
2  |bg_normal.xml  | 样式文件
3  |bg_selector.xml | 样式文件
4  |widget01.png | 图片文件
5  |widget02.png | 图片文件
6  |widget03.png | 图片文件
7  |widget04.png | 图片文件
8  |widget05.png | 图片文件
9  |widget06.png | 图片文件
10  |widget07.png | 图片文件
11  |widget08.png | 图片文件
12  |widget09.png | 图片文件
13  |devide_line.png | 图片文件
14  |main_item.xml | 布局文件
15  |MainAdapter.java | 图片适配器


修改文件

No  |文件名  | 说明
--- |------------- | -------------
1  |main.xml | 布局文件
1  |MainActivity.java  | 响应焦点停留事件

----------

## 版本1.1.6 ##

更新日期

- 20141107

功能

- 替换安装下载后的apk


修改文件

No  |文件名  | 说明
--- |------------- | -------------
1  |SplashActivity.java  | 增加安装一个apk文件的方法

----------

## 版本1.1.5 ##

更新日期

- 20141107

功能

- 下载服务端的apk文件

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
## 版本1.1.4 ##

更新日期

- 20141107

功能

- 连接服务器获取更新信息

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