# Android_QQ
 【Android Studio】简单的QQ登录界面

@[toc]
注：实验环境 Android studio 2021.2.1
# 1、头像设计
+ 首先在layout文件里面选择了RelativeLayout（相对布局）作为整个页面的布局。用下面的属性设置布局中子元素的排列方式为垂直排列；

```
android:orientation="vertical"  
```

+ 在顶端放置了一个ImageView控件，id设为“iv”，宽度和高度设置的都是70dp。设置为水平居中；

```
android:layout_centerHorizontal="true"  
```
+ 然后使头像在整个页面下调一点，不要紧贴着顶端，所以layout_marginTop设置为40dp。
最后选择drawable文件夹中的head文件作为头像。
![在这里插入图片描述](https://i-blog.csdnimg.cn/blog_migrate/fea0b0a6166f5eff6dbd6552d28977d8.png)
# 2、账号输入框
+ 利用LinearLayout（线性布局）作为账号输入框的外层布局，orientation设置的为水平排列。
+ 放置了一个TextView控件，宽度和高度设置的wrap_content，即适应内容大小，显示文本“账号”。紧接着放置一个EditText控件，用于输入账号内容，使用layout_toRightOf属性定位于账号的右侧。
+ 使用android:layout_marginLeft="5dp"和android:padding="10dp"进行微调，margin是外边距，padding是内边距。
![在这里插入图片描述](https://i-blog.csdnimg.cn/blog_migrate/c0455a01828ba84494ac81e55d5171c6.png)
3、密码输入框
+ 最外层依旧是LinearLayout（线性布局），整体放置在上一个LinearLayout的下面，控件排列依然为horizontal（水平）。
+ 放置一个TextView文本显示框，文本内容是“密码”，文本颜色为黑色，文本大小为20sp。
android:background="@null"去除了输入框的背景横线。
+ 再放置一个EditText文本输入框，`inputType设置为textPassword`，输入时候会`隐藏输入内容`，使用*** 代替。
![在这里插入图片描述](https://i-blog.csdnimg.cn/blog_migrate/a428af1b44d3b62429c7f0dc27860742.png)
# 4、复选框
+ 在文本框和输入框下面，放置两个复选框，用来显示“自动登录”和"记住密码"这两个选项。另外还有TextView文本显示框，内容为找回密码。
![在这里插入图片描述](https://i-blog.csdnimg.cn/blog_migrate/a513039bae226ab290b9482598437c44.png)
# 5、登录按钮
最下面放置一个Button控件，文本内容为“登录”，文本颜色为蓝色，就是用来登录的。
![在这里插入图片描述](https://i-blog.csdnimg.cn/blog_migrate/a6ea9941a216fe2acff01997d8b91c11.png)
# 6、设置点击事件
+ 对登录按钮设置了setOnClickListener，即点击事件监听器。
+ 在监听器里面重写了onClick方法，首先获取到输入框中的账号和密码
+ `AlertDialog dialog;`声明一个对话框对象。
`AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this)`初始化该对象。
`.setTitle("账号或密码错误")`设置了对话框的标题为。
`.setIcon(R.mipmap.ic_launcher)`设置了对话框图标.
`.setMessage("请输入正确的账号和密码")`设置了对话框的提示信息。
（由于这里没有设置登录之后的页面，所以这里将做输入的信息都视作账号或密码错误）
![在这里插入图片描述](https://i-blog.csdnimg.cn/blog_migrate/487a833fdd43913b14b75048db831a8e.png)
# 7、总体效果：
![在这里插入图片描述](https://i-blog.csdnimg.cn/blog_migrate/c7c085760293eaad9e6caf41b215f419.png)


# github源码地址：
[https://github.com/xinyangwy/Android_QQ](https://github.com/xinyangwy/Android_QQ)
（含有build、release文件夹，约60多M）

> + 可以下载提取出来的APK直接运行在手机上体验：
> + 链接：[https://pan.baidu.com/s/1pbor5-NlBn7C2h_zK_O7_Q?pwd=5er0](https://pan.baidu.com/s/1pbor5-NlBn7C2h_zK_O7_Q?pwd=5er0)  提取码：5er0 
> --来自百度网盘超级会员V2的分享
