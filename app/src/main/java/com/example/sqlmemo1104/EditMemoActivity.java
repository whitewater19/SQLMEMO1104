package com.example.sqlmemo1104;
//新增跟編輯備忘都在這個Activity中執行(因為要共用,所以會寫判斷式)
//11會附帶一個activity_edit_meno介面
//12直Layout有TextView(ID:txtTitle,text改名:新增便條),有一MultlineText(ID:edtMemo)
//有一橫Layout有TextView(ID:textView,text改名:選擇顏色:),有Spinner(ID:sp_colors)
//有一橫Layout有Button(ID:btn_back,text改名:返回),有Button(ID:btn_ok,text改名:確定)
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
//18implements View.OnClickListener,紅,執行方法onclick就好,出現步驟19
public class EditMemoActivity extends AppCompatActivity implements View.OnClickListener {

//16宣告
    private EditText edtMemo;
    private Button btn_back, btn_ok;
    private Spinner sp_color;

//29

//24
    Intent intent;

    @Override//不知道為何自己畫線,不知是否有影響
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_memo);

//17
        edtMemo = findViewById(R.id.edtMemo);
        btn_back = findViewById(R.id.btn_back);
        //因為有兩個按鈕,要有兩個setonclicklistener,不想打兩次可以寫implements,
//18到第一行
//20
        btn_back.setOnClickListener(this);
    }

    @Override//不知道為何自己畫線,不知是否有影響
//19
    public void onClick(View v) {
//21
        //老師說2個以上寫swich,以下if
        if(v.getId() == R.id.btn_back){
//22返回MainActivity複製步驟23
            intent = new Intent(EditMemoActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
//24紅1,到宣告區宣告Intent
//紅2,MainActivity對調Activity
//25新增ColorData類別

        }else {
            //判斷要新增還是編輯備忘
        }
    }
}

