package hardik.lib.toasterlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import hardik.lib.toasterlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage.showToast(MainActivity.this, "Yeah, here we go :) We are able to generate a toast using Hardik's Toast-Lib library");
    }
}
