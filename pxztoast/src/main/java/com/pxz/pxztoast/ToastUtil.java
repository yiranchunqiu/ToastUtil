package com.pxz.pxztoast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 类说明：吐司(问题：LENGTH_SHORT持续时间比LENGTH_LONG持续时间长)
 * 联系：530927342@qq.com
 *
 * @author peixianzhong
 * @date 2019/9/3 10:48
 */
public class ToastUtil {
    /**
     * ToastUtil
     */
    @SuppressLint("StaticFieldLeak")
    private static ToastUtil td;
    /**
     * 上下文
     */
    private Context context;
    /**
     *
     * 吐司
     */
    private static Toast toast = null;
    /**
     * 文字信息
     */
    private String msg;
    /**
     * 图片信息
     */
    private int id;

    /**
     * 构造方法
     *
     * @param context 上下文
     */
    private ToastUtil(Context context) {
        this.context = context;
    }

    /**
     * 设置文字
     *
     * @param text 文字
     */
    private void setText(String text) {
        msg = text;
    }

    /**
     * 设置图片路径
     *
     * @param ic 路径
     */
    private void setID(int ic) {
        id = ic;
    }

    /**
     * 短时间系统样式吐司
     *
     * @param msg 吐司文字
     */
    public static void shortShow(String msg,Context context) {
        if (td == null) {
            td = new ToastUtil(context);
        }
        td.setText(msg);
        td.createDefaultSHORT().show();
    }

    /**
     * 短时间系统样式吐司
     *
     * @return 吐司
     */
    private Toast createDefaultSHORT() {
        View contentView = View.inflate(context, R.layout.toast_dialog_default_text, null);
        TextView tvMsg = contentView.findViewById(R.id.tv_toast_msg);
        if (toast == null) {
            toast = new Toast(context);
        }
        toast.setView(contentView);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        tvMsg.setText(msg);
        return toast;
    }

    /**
     * 长时间系统样式吐司
     *
     * @param msg 吐司文字
     */
    public static void longShow(String msg,Context context) {
        if (td == null) {
            td = new ToastUtil(context);
        }
        td.setText(msg);
        td.createDefaultLONG().show();
    }

    /**
     * 长时间系统样式吐司
     *
     * @return 吐司
     */
    private Toast createDefaultLONG() {
        View contentView = View.inflate(context, R.layout.toast_dialog_default_text, null);
        TextView tvMsg = contentView.findViewById(R.id.tv_toast_msg);
        if (toast == null) {
            toast = new Toast(context);
        }
        toast.setView(contentView);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        tvMsg.setText(msg);
        return toast;
    }

    /**
     * 长时间的一个自定义样式吐司提示
     *
     * @param msg 吐司文字
     */
    public static void longShowStyle(String msg,Context context) {
        if (td == null) {
            td = new ToastUtil(context);
        }
        td.setText(msg);
        td.createLong().show();
    }

    /**
     * 长时间的一个自定义样式吐司提示
     *
     * @return 吐司
     */
    private Toast createLong() {
        View contentView = View.inflate(context, R.layout.toast_dialog_text, null);
        TextView tvMsg = contentView.findViewById(R.id.tv_toast_msg);
        if (toast == null) {
            toast = new Toast(context);
        }
        toast.setView(contentView);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        tvMsg.setText(msg);
        return toast;
    }

    /**
     * 短时间的一个自定义样式吐司提示
     *
     * @param msg 吐司文字
     */
    public static void shortShowStyle(String msg,Context context) {
        if (td == null) {
            td = new ToastUtil(context);
        }
        td.setText(msg);
        td.createShort().show();
    }

    /**
     * 短时间的一个自定义样式吐司提示
     *
     * @return 吐司
     */
    private Toast createShort() {
        View contentView = View.inflate(context, R.layout.toast_dialog_text, null);
        TextView tvMsg = contentView.findViewById(R.id.tv_toast_msg);
        if (toast == null) {
            toast = new Toast(context);
        }
        toast.setView(contentView);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        tvMsg.setText(msg);
        return toast;
    }

    /**
     * 长时间的一个自定义样式带图片吐司提示
     *
     * @param msg 吐司文字
     * @param id  图片id
     */
    public static void longShowStyleIc(String msg, int id,Context context) {
        if (td == null) {
            td = new ToastUtil(context);
        }
        td.setText(msg);
        td.setID(id);
        td.createLongIc().show();
    }

    /**
     * 长时间的一个默认样式带图片吐司提示
     *
     * @param msg 吐司文字
     */
    public static void longShowStyleIc(String msg,Context context) {
        if (td == null) {
            td = new ToastUtil(context);
        }
        td.setText(msg);
        td.setID(R.mipmap.toast_icon_img);
        td.createLongIc().show();
    }

    /**
     * 长时间带图片吐司提示
     *
     * @return 吐司
     */
    private Toast createLongIc() {
        View contentView = View.inflate(context, R.layout.toast_dialog_img, null);
        TextView tvMsg = contentView.findViewById(R.id.tv_toast_msg);
        ImageView ivMsg = contentView.findViewById(R.id.iv_toast_msg);
        if (toast == null) {
            toast = new Toast(context);
        }
        toast.setView(contentView);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        tvMsg.setText(msg);
        ivMsg.setImageResource(id);
        return toast;
    }

    /**
     * 短时间的一个自定义样式带图片吐司提示
     *
     * @param msg 吐司文字
     * @param id  图片id
     */
    public static void shortShowStyleIc(String msg, int id,Context context) {
        if (td == null) {
            td = new ToastUtil(context);
        }
        td.setText(msg);
        td.setID(id);
        td.createShortIc().show();
    }

    /**
     * 短时间的一个默认样式带图片吐司提示
     *
     * @param msg 吐司文字
     */
    public static void shortShowStyleIc(String msg,Context context) {
        if (td == null) {
            td = new ToastUtil(context);
        }
        td.setText(msg);
        td.setID(R.mipmap.toast_icon_img);
        td.createShortIc().show();
    }

    /**
     * 短时间带图片吐司提示
     *
     * @return 吐司
     */
    private Toast createShortIc() {
        View contentView = View.inflate(context, R.layout.toast_dialog_img, null);
        TextView tvMsg = contentView.findViewById(R.id.tv_toast_msg);
        ImageView ivMsg = contentView.findViewById(R.id.iv_toast_msg);
        if (toast == null) {
            toast = new Toast(context);
        }
        toast.setView(contentView);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        tvMsg.setText(msg);
        ivMsg.setImageResource(id);
        return toast;
    }
}