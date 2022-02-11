package com.example.registrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.example.registrationapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Context context;

  private  ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //setContentView(R.layout.activity_main);

     binding = ActivityMainBinding.inflate(getLayoutInflater());
     context = this;



      binding.sumitBtn.setOnClickListener(this);
      binding.clearBtn.setOnClickListener(this);

    }

    void validationRegistration()
    {
        String firstName = binding.etfname.getText().toString();
        String LastName = binding.etlname.getText().toString();
        String MobilNo  = binding.etmobile.getText().toString();
        String EmailNo = binding.etEmail.getText().toString();



      if (TextUtils.isEmpty( firstName))
      {
          binding.etfname.setText("please Enter Youer Firs Name");
      }

     else if (TextUtils.isEmpty(LastName))
        {
            binding.etlname.setText("please Enter Youer Last Name ");
        }

      else if (TextUtils.isEmpty(MobilNo))
      {
          binding.etmobile.setText("please Enter Youer Mobile No ");
      }
      else if (TextUtils.isEmpty(EmailNo))
      {
          binding.etEmail.setText("please Enter Youer E-mail ");
      }


    }

    @Override
    public void onClick(View view) {
        int id =view.getId();
        switch (view.getId())
        {
            case R.id.sumit_btn:
                validationRegistration();
                break;

        }

    }
}
