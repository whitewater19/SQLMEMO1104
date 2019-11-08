package com.example.sqlmemo1104;

public class ColorData {
    String name;//名稱
    String code;//色碼
//26產生建構子全選兩個

    public ColorData(String name, String code) {
        this.name = name;
        this.code = code;
    }

//27產生getter and setter
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
//28回EditMemoActivity類別,到宣告區新增陣列
}
