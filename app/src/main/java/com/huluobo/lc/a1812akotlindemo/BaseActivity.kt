package com.huluobo.lc.a1812akotlindemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * @author Lc
 * @description: 作用:封装公共功能和方法,减少代码量 利于项目的扩展
 * @date :2021/6/18 10:26
 */
abstract class BaseActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        init()
    }

    open fun init(){
        //初始化一些公共功能,比如摇一摇,侧边滑动返回,子类可以复写,完成自己的初始化工作
    }

    abstract fun getLayoutResId(): Int
}