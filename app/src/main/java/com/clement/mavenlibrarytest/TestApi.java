package com.clement.mavenlibrarytest;

import android.content.Context;
import android.widget.Toast;

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
        Toast.makeText(context, "Hello world", Toast.LENGTH_LONG).show();
    }
}
