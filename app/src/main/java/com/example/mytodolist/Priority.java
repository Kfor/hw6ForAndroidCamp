package com.example.mytodolist;

import android.graphics.Color;

public enum Priority {//这个enum是用来设置不同优先级的背景颜色的，相当于初始化了Hight，Medium，Low三个值+色的实例
    High(2, Color.RED),Medium(1,Color.GREEN),Low(0,Color.WHITE);

    public final int intValue;
    public final int color;

    Priority(int intValue,int color){
        this.intValue = intValue;
        this.color = color;
    }
    public static Priority from(int intValue){
        for (Priority priority:Priority.values()){//如果有指定的优先等级，返回对应的实例
            if(priority.intValue==intValue){
                return priority;
            }
        }
        return Priority.Low;//否则默认为Low
    }
}
