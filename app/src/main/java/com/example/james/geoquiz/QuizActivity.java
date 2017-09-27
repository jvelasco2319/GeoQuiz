package com.example.james.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.MenuItemHoverListener;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import static com.example.james.geoquiz.R.styleable.MenuItem;

//appCompatActivity is a subclass of androids activity class that provides compatibility
//support for older versions of android
public class QuizActivity extends AppCompatActivity {

    //create variables for the buttons
    private Button mTrueButton;
    private Button mFalseButton;

    //this bundle is called whenan instance of the activity subclass is created
    //when activity is created, needs a UI to manage.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setcontentview calls the activity_quiz layout
        setContentView(R.layout.activity_quiz);

        mTrueButton = (Button) findViewById(R.id.true_button);

        //this onclickistener waits until the button is pressed
        //and then it does the action within the public void onClick
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //does nothing yet
            }
        });




        mFalseButton = (Button) findViewById(R.id.false_button);

    }

}

    /*
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.quiz, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
/*
}
