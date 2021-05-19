package com.aboutinf.ghetler.mobileautomation.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aboutinf.ghetler.mobileautomation.R;

public class CustomerActivity extends AppCompatActivity {
    private AlertDialog.Builder alertHireMe;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertHireMe = new AlertDialog.Builder(CustomerActivity.this);
                alertHireMe.setTitle(getResources().getString(R.string.title));
                alertHireMe.setMessage(getResources().getString(R.string.message));
                alertHireMe.setCancelable(false);
                alertHireMe.setPositiveButton(getResources().getString(R.string.yes), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Exit our window activity
                        CustomerActivity.this.closeContextMenu();
                    }
                });
                alertHireMe.setNegativeButton(getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog dialog = alertHireMe.create();
                dialog.show();
            }
        });
    }
}