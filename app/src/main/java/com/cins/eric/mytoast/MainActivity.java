package com.cins.eric.mytoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton = (Button) findViewById(R.id.btn_showtoast);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JoinToast.showJoinToast(getApplicationContext());
            }
        });


        CheckBox checkBox = (CheckBox) findViewById(R.id.ck_show);

    }

    public void showtoast() {
        /*Toast toast=Toast.makeText(getApplicationContext(), "显示带图片的toast", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        //创建图片视图对象
        ImageView imageView= new ImageView(getApplicationContext());
        //设置图片
        imageView.setImageResource(R.mipmap.ic_launcher);
        //获得toast的布局
        LinearLayout toastView = (LinearLayout) toast.getView();
        //设置此布局为横向的
        toastView.setOrientation(LinearLayout.VERTICAL);
        //将ImageView在加入到此布局中的第一个位置
        toastView.addView(imageView, 0);
        toast.show();*/

        //Inflater意思是充气
//LayoutInflater这个类用来实例化XML文件到其相应的视图对象的布局
        LayoutInflater inflater = getLayoutInflater();
//通过制定XML文件及布局ID来填充一个视图对象
        View layout = inflater.inflate(R.layout.bk_join_toast,null);

        ImageView image = (ImageView) layout.findViewById(R.id.icon);
//设置布局中图片视图中图片
        image.setImageResource(R.mipmap.ic_launcher);

      //  TextView title = (TextView) layout.findViewById(R.id.text);
//设置标题
       // title.setText("标题栏");

        TextView text = (TextView) layout.findViewById(R.id.text);
//设置内容
        text.setText(R.string.join);

        Toast toast= new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER , 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

    }
}
