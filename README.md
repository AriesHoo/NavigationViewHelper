# NavigationViewHelper- 一个快速实现虚拟导航栏控制及底部软键盘控制帮助类库
--------------------------

[![](https://jitpack.io/v/AriesHoo/NavigationViewHelper.svg)](https://jitpack.io/#AriesHoo/NavigationViewHelper)
[![](https://img.shields.io/github/release/AriesHoo/NavigationViewHelper.svg)](https://github.com/AriesHoo/NavigationViewHelper/releases)
[![API](https://img.shields.io/badge/API-15%2B-green.svg?style=flat)](https://android-arsenal.com/api?level=15)
[![GitHub license](https://img.shields.io/github/license/AriesHoo/NavigationViewHelper.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)


## 简介：

一个Android项目中不常使用(国内就华为有)的虚拟导航栏控制帮助类.有问题欢迎issue。
后续版本迁移至[UIWidget](https://github.com/AriesHoo/UIWidget)维护不再做更新

## 主要功能

* 系统自带半透明效果
* 系统自带全透明效果
* 自定义半透明效果
* 自定义全透明效果
* 链式调用到底

其它功能请在demo中发现

[[Sample PC Download]](https://github.com/AriesHoo/NavigationViewHelper/blob/master/apk/sample.apk)


**Gradle集成**

```
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

```
dependencies {
     //compile 'com.github.AriesHoo:NavigationViewHelper:1.0.0'
     compile 'com.github.AriesHoo:NavigationViewHelper:${LATEST_VERSION}'
}
```

**Compile集成**

```
compile project(':navigationViewHelperLib')
```

## 预览

![](https://github.com/AriesHoo/NavigationViewHelper/blob/master/screenshot/00.png)

不控制导航栏效果

![](https://github.com/AriesHoo/NavigationViewHelper/blob/master/screenshot/01.png)

系统自带半透明导航栏效果

![](https://github.com/AriesHoo/NavigationViewHelper/blob/master/screenshot/02.png)

系统自带全透明导航栏效果

![](https://github.com/AriesHoo/NavigationViewHelper/blob/master/screenshot/03.png)

自定义半透明导航栏效果

![](https://github.com/AriesHoo/NavigationViewHelper/blob/master/screenshot/04.png)

自定义全透明导航栏效果


## License

```
Copyright 2018 Aries Hoo

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```



