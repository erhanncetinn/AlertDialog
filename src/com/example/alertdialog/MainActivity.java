package com.example.alertdialog;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void btnShowMessage_Click(View v){
		AlertDialogErhan.showMessage(this, 2000,"This is Title" , "Hello Alert Dialog Message !!");
	}
	
	public void btnExitWithDialog_Click(View v){
		AlertDialogErhan.showDialogBeforeExit(this, "Bye bye", "Are sure want to exit?");
	}
	
}
