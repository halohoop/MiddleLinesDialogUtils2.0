## MiddleLinesDialogUtils

Use just one line code to get a Custum Dialog in Android!

#### This is a module of Android Studio Project;

Feel free and help yourself!
## 
# Sample Pictures

![demo0](./demo0.gif)

## 
# Usage
* compile 'com.halohoop:middlelinesdialogutilslib:2.0.3'
<pre><code>
        //使用示例,一行代码一句对话框,示例示例示例示例示例,参数越多,越多自定义
        //sample to use,use just one line of code to open a dialog;
        MiddleLinesDialogUtils.show(this, this, "上传封面");
        MiddleLinesDialogUtils.show(this, this, "上传封面", "转发", "拍照", "录像", "需要再往后加");
        MiddleLinesDialogUtils.show(this, 10, this, "上传封面", "转发", "拍照", "录像", "需要再往后加");
        MiddleLinesDialogUtils.show(this, 10, 30, this, "上传封面", "转发", "拍照", "录像", "需要再往后加");
        MiddleLinesDialogUtils.show(this, 10, 10, 20, this, "上传封面", "转发", "拍照", "录像", "需要再往后加");
        MiddleLinesDialogUtils.show(this, 100, 20, 4, 4, this, "上传封面", "转发", "拍照", "录像", "需要再往后加");
        MiddleLinesDialogUtils.show(this, 100, 20, 4, 4, this, this, "上传封面", "转发", "拍照", "录像", "需要再往后加");
        MiddleLinesDialogUtils.show(this, 100, 20, 4, 4, 100, this, this, "上传封面", "转发", "拍照", "录像", "需要再往后加");
        MiddleLinesDialogUtils.show(this, 100, 20, 30, 30, 10, 0.50f, "ff00ff", this, this, "上传封面", "转发", "拍照", "录像", "需要再往后加");
        MiddleLinesDialogUtils.show(this, 100, 20, 30, 10, 10, 0.50f, "ff0000", 0.30f, "00ff00", this, this, "上传封面", "转发", "拍照", "录像", "需要再往后加");
        MiddleLinesDialogUtils.show(this,
                100/*对话框距离左右的margin*/,
                20/*每行textview 的paddingTop和paddingBottom*/,
                30/*对话框上左和上右的圆角值*/,
                10/*对话框下左和下右的圆角值*/,
                10/*每个item之间的分割线的左右margin值*/,
                0.50f, "ff0000",//对话框背景的透明度和颜色十六进制代码
                0.30f, "00ff00", //每个item之间的分割线透明度和颜色十六进制代码
                0.20f, "0000ff",//每行textview的透明度和颜色十六进制代码
                this,//点击监听回调
                this,//对话框取消监听回调
                //以下为设置每一行的文字
                "上传封面", "转发", "拍照", "录像", "需要再往后加...");
        MiddleLinesDialogUtils.show(this,
                100/*对话框距离左右的margin*/,
                20/*每行textview 的paddingTop和paddingBottom*/,
                30/*对话框上左和上右的圆角值*/,
                10/*对话框下左和下右的圆角值*/,
                0/*每个item之间的分割线的左右margin值*/,
                0.30f, "42B0FF",//对话框背景的透明度和颜色十六进制代码
                0.50f, "0000ff", //每个item之间的分割线透明度和颜色十六进制代码
                1.0f, "000000",//每行textview的透明度和颜色十六进制代码
                Gravity.LEFT,50,//每行textview的gravity 如果是left就是paddingLeft,如果是Right,就是paddingRight
                this,//点击监听回调
                this,//对话框取消监听回调
                //以下为设置每一行的文字
                "上传封面", "转发", "拍照", "录像", "需要再往后加...");
	//--------------------------------------------------
	//--------------------------------------------------
	//--------------------------------------------------
	//or when you want several line to show after sth is done in non-ui thread;
    MiddleLinesDialogUtils.show(view.getId(), this, 20, 30,
            20, 20,
            0,
            1.0f, "ffffff",
            0.3f, "000000",
            1.0f, "000000",
            Gravity.CENTER, 10,
            this,
            new int[]{0, 2},
            "Upload File", "Take Picture", "Parse The QRcode from Picture");
    new Thread(new Runnable() {
        @Override
        public void run() {
            SystemClock.sleep(2000);//simulation of sth is done in thread!
            MiddleLinesDialogUtils.showItemByIndex(view.getId(), 0);
            SystemClock.sleep(2000);//simulation of sth is done in thread!
            MiddleLinesDialogUtils.showItemByIndex(view.getId(), 2);
        }
    }).start();
</code></pre>

# Customization

To customize dialog style:

  * just use more the 'show' with more params; 

# Compatibility
  
  * Android GINGERBREAD 2.3+

# Changelog
### Version: 2.0.3

  * update:to show serveral line when sth is done is non-ui thread; 

## License

    Copyright 2016, Halohoop

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
