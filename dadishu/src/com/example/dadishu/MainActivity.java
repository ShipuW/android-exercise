package com.example.dadishu;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	private ImageButton start;
	private TextView time;
	private TextView score;
	private ImageButton hole_1;
	private ImageButton hole_2;
	private ImageButton hole_3;
	private ImageButton hole_4;
	private ImageButton hole_5;
	private ImageButton hole_6;
	private ImageButton hole_7;
	private ImageButton hole_8;
	private ImageButton hole_9;
	private ImageButton chuizi_1;
	private ImageButton chuizi_2;
	private ImageButton chuizi_3;
	private ImageButton chuizi_4;
	private ImageButton chuizi_5;
	private ImageButton chuizi_6;
	private ImageButton chuizi_7;
	private ImageButton chuizi_8;
	private ImageButton chuizi_9;
	private ImageButton ds_1;
	private ImageButton ds_2;
	private ImageButton ds_3;
	private ImageButton ds_4;
	private ImageButton ds_5;
	private ImageButton ds_6;
	private ImageButton ds_7;
	private ImageButton ds_8;
	private ImageButton ds_9;
	private Handler hd;
	private Timer timer;
	private String flag;
	private int num;
	private int dishu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		start = (ImageButton) findViewById(R.id.start);
		time = (TextView) findViewById(R.id.timer_tv);
		score = (TextView) findViewById(R.id.score_tv);
		hole_1 = (ImageButton) findViewById(R.id.hole_1);
		hole_2 = (ImageButton) findViewById(R.id.hole_2);
		hole_3 = (ImageButton) findViewById(R.id.hole_3);
		hole_4 = (ImageButton) findViewById(R.id.hole_4);
		hole_5 = (ImageButton) findViewById(R.id.hole_5);
		hole_6 = (ImageButton) findViewById(R.id.hole_6);
		hole_7 = (ImageButton) findViewById(R.id.hole_7);
		hole_8 = (ImageButton) findViewById(R.id.hole_8);
		hole_9 = (ImageButton) findViewById(R.id.hole_9);
		chuizi_1 = (ImageButton) findViewById(R.id.chuizi_1);
		chuizi_2 = (ImageButton) findViewById(R.id.chuizi_2);
		chuizi_3 = (ImageButton) findViewById(R.id.chuizi_3);
		chuizi_4 = (ImageButton) findViewById(R.id.chuizi_4);
		chuizi_5 = (ImageButton) findViewById(R.id.chuizi_5);
		chuizi_6 = (ImageButton) findViewById(R.id.chuizi_6);
		chuizi_7 = (ImageButton) findViewById(R.id.chuizi_7);
		chuizi_8 = (ImageButton) findViewById(R.id.chuizi_8);
		chuizi_9 = (ImageButton) findViewById(R.id.chuizi_9);
		ds_1 = (ImageButton) findViewById(R.id.ds_1);
		ds_2 = (ImageButton) findViewById(R.id.ds_2);
		ds_3 = (ImageButton) findViewById(R.id.ds_3);
		ds_4 = (ImageButton) findViewById(R.id.ds_4);
		ds_5 = (ImageButton) findViewById(R.id.ds_5);
		ds_6 = (ImageButton) findViewById(R.id.ds_6);
		ds_7 = (ImageButton) findViewById(R.id.ds_7);
		ds_8 = (ImageButton) findViewById(R.id.ds_8);
		ds_9 = (ImageButton) findViewById(R.id.ds_9);

		hd = new MyHandler();
		num = 0;
		flag = "over";

		start.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				time.setText("60");

				TimerTask task = new TimerTask() {
					public void run() {

						Message msg1 = hd.obtainMessage();
						msg1.obj = (flag);
						hd.sendMessage(msg1);
					}
				};

				flag = "start";
				timer = new Timer(true);
				// 每500ms计数一次
				timer.schedule(task, 500, 500);
			}
		});

		hole_1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (flag.equals("start"))
					chuizi_1.setVisibility(View.VISIBLE);
				if (dishu == 1) {

					int s = Integer.parseInt(score.getText().toString() + "");
					s++;
					score.setText(s + "");
				}
			}
		});
		hole_2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (flag.equals("start"))
					chuizi_2.setVisibility(View.VISIBLE);
				if (dishu == 2) {

					int s = Integer.parseInt(score.getText().toString() + "");
					s++;
					score.setText(s + "");
				}
			}
		});
		hole_3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (flag.equals("start"))
					chuizi_3.setVisibility(View.VISIBLE);
				if (dishu == 3) {

					int s = Integer.parseInt(score.getText().toString() + "");
					s++;
					score.setText(s + "");
				}
			}
		});
		hole_4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (flag.equals("start"))
					chuizi_4.setVisibility(View.VISIBLE);
				if (dishu == 4) {

					int s = Integer.parseInt(score.getText().toString() + "");
					s++;
					score.setText(s + "");
				}
			}
		});
		hole_5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (flag.equals("start"))
					chuizi_5.setVisibility(View.VISIBLE);
				if (dishu == 5) {

					int s = Integer.parseInt(score.getText().toString() + "");
					s++;
					score.setText(s + "");
				}
			}
		});
		hole_6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (flag.equals("start"))
					chuizi_6.setVisibility(View.VISIBLE);
				if (dishu == 6) {

					int s = Integer.parseInt(score.getText().toString() + "");
					s++;
					score.setText(s + "");
				}
			}
		});
		hole_7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (flag.equals("start"))
					chuizi_7.setVisibility(View.VISIBLE);
				if (dishu == 7) {

					int s = Integer.parseInt(score.getText().toString() + "");
					s++;
					score.setText(s + "");
				}
			}
		});
		hole_8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (flag.equals("start"))
					chuizi_8.setVisibility(View.VISIBLE);
				if (dishu == 8) {

					int s = Integer.parseInt(score.getText().toString() + "");
					s++;
					score.setText(s + "");
				}
			}
		});
		hole_9.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (flag.equals("start"))
					chuizi_9.setVisibility(View.VISIBLE);
				if (dishu == 9) {

					int s = Integer.parseInt(score.getText().toString() + "");
					s++;
					score.setText(s + "");
				}
			}
		});
	}

	class MyHandler extends Handler {

		@Override
		public void handleMessage(Message msg) {

			super.handleMessage(msg);

			

			if (num == 1) {

				unvisiblechuizi();
				dishu = -1;
				num = 0;
				dishu = getid();
				visibledishu(dishu);
			} else {

				unvisibledishu();
				unvisiblechuizi();
				num ++;
				int t = Integer.parseInt(time.getText().toString() + "");
				t--;
				time.setText(t + "");
			}
			
			if (Integer.parseInt(time.getText().toString() + "") == 0) {

				timer.cancel();
				unvisiblechuizi();
				unvisibledishu();
				Dialog dl = new AlertDialog.Builder(MainActivity.this).setTitle("游戏结束")
						.setMessage("你获得了" + score.getText() + "分,继续努力")
						.setPositiveButton("确定", null).show();
				dl.setCancelable(false);
				score.setText("0");
				flag = "over";
			}

		}

	}

	// 产生一个随机数
	public int getid() {

		int id = (int) ((int) 10 * Math.random());
		if (id == 0 || id == 10)
			getid();
		return id;
	}

	// 使指定的地鼠显示
	public void visibledishu(int id) {

		switch (id) {

		case 1:
			ds_1.setVisibility(View.VISIBLE);
			break;
		case 2:
			ds_2.setVisibility(View.VISIBLE);
			break;
		case 3:
			ds_3.setVisibility(View.VISIBLE);
			break;
		case 4:
			ds_4.setVisibility(View.VISIBLE);
			break;
		case 5:
			ds_5.setVisibility(View.VISIBLE);
			break;
		case 6:
			ds_6.setVisibility(View.VISIBLE);
			break;
		case 7:
			ds_7.setVisibility(View.VISIBLE);
			break;
		case 8:
			ds_8.setVisibility(View.VISIBLE);
			break;
		case 9:
			ds_9.setVisibility(View.VISIBLE);
			break;
		default:
			break;
		}
	}

	public void unvisibledishu() {

		ds_1.setVisibility(View.INVISIBLE);
		ds_2.setVisibility(View.INVISIBLE);
		ds_3.setVisibility(View.INVISIBLE);
		ds_4.setVisibility(View.INVISIBLE);
		ds_5.setVisibility(View.INVISIBLE);
		ds_6.setVisibility(View.INVISIBLE);
		ds_7.setVisibility(View.INVISIBLE);
		ds_8.setVisibility(View.INVISIBLE);
		ds_9.setVisibility(View.INVISIBLE);
	}

	public void unvisiblechuizi() {

		chuizi_1.setVisibility(View.INVISIBLE);
		chuizi_2.setVisibility(View.INVISIBLE);
		chuizi_3.setVisibility(View.INVISIBLE);
		chuizi_4.setVisibility(View.INVISIBLE);
		chuizi_5.setVisibility(View.INVISIBLE);
		chuizi_6.setVisibility(View.INVISIBLE);
		chuizi_7.setVisibility(View.INVISIBLE);
		chuizi_8.setVisibility(View.INVISIBLE);
		chuizi_9.setVisibility(View.INVISIBLE);
	}
}
