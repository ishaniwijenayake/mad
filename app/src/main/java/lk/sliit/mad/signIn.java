package lk.sliit.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class signIn extends AppCompatActivity {

    EditText un1;
    EditText pw1;
    EditText un2;
    EditText pw2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        un1=findViewById(R.id.un1);
        pw1=findViewById(R.id.pw1);
        un2=findViewById(R.id.un2);
        pw2=findViewById(R.id.pw2);


    }


    public void login(View view){

        String un=un1.getText().toString();
        String pw=pw1.getText().toString();

        SharedPreferences sharePref = PreferenceManager.getDefaultSharedPreferences(this);
        String uname = sharePref.getString("un",null);
        String password = sharePref.getString("pw",null);
        Log.i("VOLLEYun", uname);
        Log.i("VOLLEYu", un);
        Log.i("VOLLEYpw", uname);
        Log.i("VOLLEYp", un);
        if(un.equals(uname) && pw.equals(password)){

            Intent myinten = new Intent(this,dash.class);
            startActivity(myinten);
            finish();
        }


    }

    public void register(View view){

        String un=un2.getText().toString();
        String pw=pw2.getText().toString();

        SharedPreferences sharePref= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharePref.edit();
        editor.putString("un",un);
        editor.putString("pw",pw);
        editor.apply();


    }
}
