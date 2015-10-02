package com.example.johnj_000.rapidturns;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginUsuario extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_usuario);
        Button botonIngresar=(Button)findViewById(R.id.idBotonIngresar);
        Button botonRegistroAdmin=(Button)findViewById(R.id.idRegistroAdmin);
        Button botonRegistroUsuario=(Button)findViewById(R.id.idRegistroUsuario);
        botonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario=((EditText)findViewById(R.id.idUsuarioLogin)).getText().toString();
                String contraseña=((EditText)findViewById(R.id.idContraseñaLogin)).getText().toString();
                Intent nuevoForm= new Intent(LoginUsuario.this,MainActivity.class);
                startActivity(nuevoForm);

            }
        });
        botonRegistroAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        botonRegistroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_usuario, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
