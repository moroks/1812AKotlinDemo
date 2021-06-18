package com.huluobo.lc.a1812akotlindemo.contract

/**
 * @author Lc
 * @description: 协议层,负责处理当前页面的功能,和UI的返回
 * @date :2021/6/18 10:58
 */
interface SplashContract {
    interface Presenter : BasePresenter {
        fun checkLoginStatus()//检查登录状态
    }

    interface View {
        fun onNotLoggedIn()//没有登录的UI处理
        fun onLoggedIn()//已经登录的UI处理
    }
//
//    interface Model{
//
//    }
}