# MarqueeTextView
简单实现原生的跑马灯效果在一个页面多个效果

***注意：首先要保证TextView显示不全文本才会有效果***

## 关键属性

**设置为跑马灯显示**  

 `android:ellipsize="marquee"`

 **获取焦点**
  `android:focusable="true"`

**可以通过touch来获得focus**
 `android:focusableInTouchMode="true"`

**设置重复的次数**
 `android:marqueeRepeatLimit="marquee_forever"`

**单行显示文字**
 `android:singleLine="true"`

以上属性在`xml`文件设置之后运行程序，还是没有实现效果，这是因为还需要在代码中动态请求焦点，使用`requestFocus()`方法。

## 自定义TextView

但是使用该方法有个问题，一个界面只能有一个控件持有售点，所以一个界面只能有一个View实现跑马灯效果(取决于哪个最后申请焦点)。所以需要自定义。

自定义TextView完整代码如下：

```
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class MarqueeTextView extends TextView {
    public MarqueeTextView(Context context) {
        super(context);
    }

    public MarqueeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MarqueeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}

```

**使用方法：**

1. 在`xml`文件中使用，那些关键属性还是要添加上。

2. 不需要在代码中调用`requestFocus()`方法。
