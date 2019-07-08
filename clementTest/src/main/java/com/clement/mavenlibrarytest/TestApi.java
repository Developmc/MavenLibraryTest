package com.clement.mavenlibrarytest;

import android.content.Context;
import android.widget.Toast;

import com.google.gson.Gson;

/**
 * Author: tp-clement
 * Create: 2019/7/5
 * Desc: 测试将开源库通过aar的方式发布到Jcenter
 */
public class TestApi {

    /**
     * 测试提示
     */
    public static void doTest(Context context) {
        //测试第三方远程依赖库
        String userJson = "{'name':'clement'}";
        User user = new Gson().fromJson(userJson, User.class);
        Toast.makeText(context, user.getName(), Toast.LENGTH_LONG).show();
    }
}
