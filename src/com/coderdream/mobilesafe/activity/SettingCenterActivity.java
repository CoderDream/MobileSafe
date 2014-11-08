package com.coderdream.mobilesafe.activity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;

import com.coderdream.mobilesafe.R;

public class SettingCenterActivity extends Activity {
	// 程序的自动更新
	private SharedPreferences sp;// 用于存储自动更新是否开启的boolean值
	private TextView tv_setting_autoupdate_status;// 自动更新的是否开启对应的TextView控件的显示文字
	private CheckBox cb_setting_autoupdate;// 显示自动更新是否开启的勾选框

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.setting_center);
		super.onCreate(savedInstanceState);
		// 获取Sdcard下的config.xml文件，如果该文件不存在，那么将会自动创建该文件，文件的操作类型为私有类型
		sp = getSharedPreferences("config", MODE_PRIVATE);
		// 标记自动更新状态是否开启对应的Checkbox控件
		cb_setting_autoupdate = (CheckBox) findViewById(R.id.cb_setting_autoupdate);
		// 显示当前自动更新是否开启对应的TextView控件
		tv_setting_autoupdate_status = (TextView) findViewById(R.id.tv_setting_autoupdate_status);
		// 初始化自动更新的ui，默认状态下是开启的
		boolean autoupdate = sp.getBoolean("autoupdate", true);
		if (autoupdate) {
			tv_setting_autoupdate_status.setText("自动更新已经开启");
			// 因为autoupdate变量为true，则表示自动更新开启，所以，Checkbox的状态应该是勾选状态的，即为true
			cb_setting_autoupdate.setChecked(true);
		} else {
			tv_setting_autoupdate_status.setText("自动更新已经关闭");
			// 因为autoupdate变量为false，则表示自动更新未开启，所以，Checkbox的状态应该是未勾选状态的，即为false
			cb_setting_autoupdate.setChecked(false);
		}
		/**
		 * 当Checkbox的状态发生改变时执行以下代码
		 */
		cb_setting_autoupdate.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			// 参数一：当前的Checkbox 第二个参数：当前的Checkbox是否处于勾选状态
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// 获取编辑器
				Editor editor = sp.edit();
				// 持久化存储当前Checkbox的状态，当下次进入时，依然可以保存当前设置的状态
				editor.putBoolean("autoupdate", isChecked);
				// 将数据真正提交到sp里面
				editor.commit();
				if (isChecked) {// Checkbox处于选中效果
					// 当Checkbox处于勾选状态时，表示我们的自动更新已经开启，同时修改字体颜色
					tv_setting_autoupdate_status.setTextColor(Color.WHITE);
					tv_setting_autoupdate_status.setText("自动更新已经开启");
				} else {// Checkbox处于未勾选状态
						// 当Checkbox未处于勾选状态时，表示我们的自动更新已经开启，同时修改字体颜色
					tv_setting_autoupdate_status.setTextColor(Color.RED);
					tv_setting_autoupdate_status.setText("自动更新已经关闭");
				}
			}
		});

	}

}
