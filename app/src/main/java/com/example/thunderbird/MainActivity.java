package com.example.thunderbird;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	Button continueButton;
	TextView helloView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		continueButton = (Button) findViewById(R.id.continueButton);
		helloView = (TextView) findViewById(R.id.helloWorld);

		continueButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				helloView.setText("Hello Colton!");
			}
		});
	}
}
