package com.example.imagerecognition77229152;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.imagerecognition77229152.databinding.ActivityRegisterBinding;
import com.example.imagerecognition77229152.model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {
    ActivityRegisterBinding binding;
    private FirebaseAuth mAuth;
    FirebaseDatabase database;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        progressDialog = new ProgressDialog(RegisterActivity.this);
        progressDialog.setTitle("Creating Account");
        progressDialog.setMessage("Wait a while for Image Recognition");


        mAuth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();


      binding.btSubmit.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              progressDialog.show();
              mAuth.createUserWithEmailAndPassword(binding.email.getText().toString(),binding.pwd.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>()
              {
                  @Override
                  public void onComplete(@NonNull Task<AuthResult> task) {
                      if(task.isSuccessful()){

                          progressDialog.hide();

                          User user = new User(binding.firstname.getText().toString(),binding.lastname.getText().toString(),binding.email.getText().toString(),binding.phone.getText().toString(),binding.pwd.getText().toString());
                          String id = task.getResult().getUser().getUid();

                          database.getReference().child(id).setValue(user);
                          ;



                          Toast.makeText(RegisterActivity.this, "Now youre ready for Image Recognition", Toast.LENGTH_SHORT).show();
                      }
                      else{
                          Toast.makeText(RegisterActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                      }
                  }
              });

          }
      });
    }
}