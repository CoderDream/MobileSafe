package com.coderdream.mobilesafe.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
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
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}