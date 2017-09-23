package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

       TextView stories;
       Button Topbutton;
       Button Downbutton;
       int mStoryIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        stories= (TextView) findViewById(R.id.storyTextView);
        Topbutton= (Button) findViewById(R.id.buttonTop);
        Downbutton= (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        Topbutton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mStoryIndex=mStoryIndex+1;
                if ( mStoryIndex == 2 || mStoryIndex ==4) {
                    stories.setText(R.string.T3_Story);
                    Topbutton.setText(R.string.T3_Ans1);
                    Downbutton.setText(R.string.T3_Ans2);
                }

                else if (mStoryIndex ==3 || mStoryIndex ==5) {
                    stories.setText(R.string.T6_End);
                    Topbutton.setVisibility(View.GONE);
                    Downbutton.setVisibility(View.GONE);
                }

            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        Downbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStoryIndex=mStoryIndex+2;
                if ( mStoryIndex == 3) {
                    stories.setText(R.string.T2_Story);
                    Topbutton.setText(R.string.T2_Ans1);
                    Downbutton.setText(R.string.T2_Ans2);
                }

                else if (mStoryIndex ==4 || mStoryIndex ==6) {
                    stories.setText(R.string.T5_End);
                    Topbutton.setVisibility(View.GONE);
                    Downbutton.setVisibility(View.GONE);
                }

                else if (mStoryIndex ==5){
                    stories.setText(R.string.T4_End);
                    Topbutton.setVisibility(View.GONE);
                    Downbutton.setVisibility(View.GONE);
                }


            }
        });

    }
}
