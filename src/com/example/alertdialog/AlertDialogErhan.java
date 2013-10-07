package com.example.alertdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;

public final class AlertDialogErhan {

	public static void showMessage(Context v,int duration,String title,String message){
		final AlertDialog alertMessage = new AlertDialog.Builder(v).create();
		alertMessage.setTitle(title);
		alertMessage.setMessage(message);
		alertMessage.show();
		new Handler().postDelayed(new Runnable() {
	        @Override
	        public void run() {
	        	alertMessage.cancel();
	        }
	    }, duration);
	}
	
	public static void showDialogBeforeExit(final Context v,String title,String message){
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				v);
 
			// set title
			alertDialogBuilder.setTitle(title);
 
			// set dialog message
			alertDialogBuilder
				.setMessage(message)
				.setCancelable(false)
				.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, close
						// current activity
						((Activity) v).finish();
						dialog.cancel();
					}
				  })
				.setNegativeButton("No",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, just close
						// the dialog box and do nothing
						dialog.cancel();
					}
				});
 
				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();
 
				// show it
				alertDialog.show();
	}
	
}