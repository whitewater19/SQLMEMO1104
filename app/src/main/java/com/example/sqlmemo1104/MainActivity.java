package com.example.sqlmemo1104;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
//1概念建立資料庫跟資料表(就是DbHelper類別、DbAdapter類別,稍後會分別建立)
//2主介面刪原增ListView定位
//3左layout增itemView介面(colorView是spinner進階練習)
//4Layout改水平給ID: bg_memo
//5複製3圖到mipmap(add、edit、rubbish)
//6itemView介面有直Layout有兩TextView一date一meno
//7一ImageView(ID: btnEdit)
//8左layout增colorView介面
//9水平Layout有一ImageView(ID:ticket)有一TextView(ID:color_name,text改名Pink)
//10建一EditMenoActivity
public class MainActivity extends AppCompatActivity {
    Intent intent;//回步驟14

//    private DbAdapter dbAdapter;
//    Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//13要載入menu要右鍵產生Override兩方法(兩個一起選)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_add:
//14去宣告intent
//23複製3行
                intent = new Intent(MainActivity.this, EditMemoActivity.class);
                startActivity(intent);
                finish();
                return true;
//15可做測試,然後回EditMemo類別畫面宣告區
        }
        return super.onOptionsItemSelected(item);
    }
}
