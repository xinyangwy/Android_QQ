package zj.dzh.qq;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn_login);//绑定登录按钮
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.app.AlertDialog dialog;
                android.app.AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("账号或密码错误")                 //设置对话框的标题
                        .setIcon(R.mipmap.ic_launcher)               //设置对话框标题图标
                        .setMessage("请输入正确的账号和密码")                //设置对话框的提示信息
                        //添加"确定"按钮
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();                             //关闭对话框
                                MainActivity.this.finish();                   //关闭MainActivity
                            }
                        })
                        //添加“取消”按钮
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();                             //关闭对话框
                            }
                        });
                dialog = builder.create();
                dialog.show();
            }
        });
    }
}
