package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.LoginText);
        password = findViewById(R.id.PasswordText);
        login = findViewById(R.id.Sign);
        View.OnClickListener oclSign = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // Если введенные логин и пароль будут словом "admin",
                // показываем Toast сообщение об успешном входе:
                if (username.getText().toString().equals("Keanu") &&
                        password.getText().toString().equals("breathtaking")) {
                    Toast.makeText(getApplicationContext(), "Вход выполнен!",Toast.LENGTH_SHORT).show();

                    // Выполняем переход на другой экран:
                    Intent intent = new Intent(MainActivity.this,Second.class);
                    startActivity(intent);
                }

                // В другом случае выдаем сообщение с ошибкой:
                else {
                    Toast.makeText(getApplicationContext(), "Неправильные данные!",Toast.LENGTH_SHORT).show();

                }

            }
        };
        login.setOnClickListener(oclSign);
    }

}
