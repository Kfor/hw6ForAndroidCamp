package com.example.mytodolist;

public enum State {//设置是否完成的两个状态
    TODO(0),DONE(1);

    public final int intValue;

    State(int intValue){
        this.intValue = intValue;
    }

    public static State from(int intValue){
        for(State state:State.values()){
            if(state.intValue==intValue){//如果有值，返回对应
                return state;
            }
        }
        return TODO;//默认为为完成
    }
}
