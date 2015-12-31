package com.coderdream.mobilesafe.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.coderdream.mobilesafe.R;
import com.coderdream.mobilesafe.adapter.MainAdapter;

public class MainActivity extends Activity {

	/**
	 * 显示主界面中的九大模块的GridView
	 */
	private GridView gv_main;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		gv_main = (GridView) findViewById(R.id.gv_main);
		// 为gv_main对象设置一个适配器，该适配器的作用是用于为每个item填充对应的数据
		gv_main.setAdapter(new MainAdapter(this));
		// 为GridView对象中的item设置点击时的监听事件
		gv_main.setOnItemClickListener(new OnItemClickListener() {
			// 参数一：item的父控件，也就是GridView
			// 参数二：当前点击的item
			// 参数三：当前点击的item在GridView中的位置
			// 参数四：id的值为点击了GridView的哪一项对应的数值，点击了GridView第9项，那id就等于8
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				switch (position) {
				// 手机防盗：跳转到”手机防盗“对应的Activity界面
				case 0:
					Intent lostprotectedIntent = new Intent(MainActivity.this,
							LostProtectedActivity.class);
					startActivity(lostprotectedIntent);
					break;

				// 设置中心：跳转到”设置中心“对应的Activity界面
				case 8:
					Intent settingIntent = new Intent(MainActivity.this,
							SettingCenterActivity.class);
					startActivity(settingIntent);
					break;
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}