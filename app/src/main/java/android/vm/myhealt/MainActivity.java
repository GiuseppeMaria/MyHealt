package android.vm.myhealt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Francesco on 25/01/2017.
 */

public class MainActivity extends Activity {

    TextView welcomeTv;
    Button changeTextBtn;
    EditText changeTextEdit;
    Activity activity = this;
    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity);
        welcomeTv = (TextView) findViewById(R.id.welcome_tv);
        changeTextBtn = (Button) findViewById(R.id.change_text_btn);
        changeTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //welcomeTv.setText(changeTextEdit.getText());
                username = changeTextEdit.getText().toString();
                Intent intent = new Intent(activity,SecondActivity.class);
                intent.putExtra("username",username);
                startActivity(intent);
            }
        });
        changeTextEdit=(EditText) findViewById(R.id.change_text_edit);

        }
    }

