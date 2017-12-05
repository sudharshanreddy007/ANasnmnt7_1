package com.example.user.anasnmnt7_1;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button3);
        editText=(EditText)findViewById(R.id.editText2);
        //A EditText is an overlay over TextView that configures itself to be editable.
        // It is the predefined subclass of TextView that includes rich editing capabilities.
        //creating the object
        button.setOnClickListener(new View.OnClickListener() {
            //A Button is a Push-button which can be pressed, or clicked, by the user to perform an action
            //To specify an action when the button is pressed, set a click listener on the button object

            @Override
            public void onClick(View view) {
                // Code here executes on main thread after user presses button

                Uri uri = Uri.parse("http://www.google.com");
                Intent browserIntent = new Intent(Intent.ACTION_WEB_SEARCH);
                //The intent itself, an Intent object, is a passive data structure holding an abstract description of an
                // operation to be performed.
                //ACTION_WEB_SEARCH preforms web search action

                String msg=editText.getText().toString();
                //(SearchManager.QUERY) is the text to search for. If it is a url starts with http or https,
                // the site will be opened. If it is plain text,
                // Google search will be applied.
                    browserIntent.putExtra(SearchManager.QUERY,msg);
                    startActivity(browserIntent);
               //for moving activity from one to other.

            }
        });

    }

}