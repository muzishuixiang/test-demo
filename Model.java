package com.lxg.utils;

import javax.jws.WebParam;
import java.util.Map;

public class Model {
    int id;
    String name;
    Model(){
        System.out.println("父类构造函数执行");
    }
   int getmax(int i , int j){
       return ++id;
   }
}
