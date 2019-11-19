# 介绍
## 自用项目，自定义吐司工具类

### 图片
<div style="align: center">
       <img src="https://github.com/yiranchunqiu/ToastUtil/blob/master/pic/%E5%9B%BE%E7%89%871.png" width="32%">
       <img src="https://github.com/yiranchunqiu/ToastUtil/blob/master/pic/%E5%9B%BE%E7%89%872.png" width="32%">
       <img src="https://github.com/yiranchunqiu/ToastUtil/blob/master/pic/%E5%9B%BE%E7%89%873.png" width="32%">
       <img src="https://github.com/yiranchunqiu/ToastUtil/blob/master/pic/%E5%9B%BE%E7%89%874.png" width="32%">
</div>


### 使用方法
### 添加

```
allprojects {
 		repositories {
 			maven { url 'https://jitpack.io' }
 		}
 	}
```

### 添加依赖

```
 	dependencies {
    	        implementation 'com.github.yiranchunqiu:ToastUtil:1.0'
    	}
```

### 使用

```

 ToastUtil.shortShow("短时间系统吐司", MainActivity.this);
 ToastUtil.longShowStyleIc("长时间自定义图片吐司", R.mipmap.ic_launcher, MainActivity.this);

```