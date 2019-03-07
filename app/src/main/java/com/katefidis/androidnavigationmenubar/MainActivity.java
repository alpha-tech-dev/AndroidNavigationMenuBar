package com.katefidis.androidnavigationmenubar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private BottomBar bottomBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);

        bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_calls) {
                    // The tab with id R.id.tab_calls was selected,
                    // change your content accordingly.
                    textView.setText("Your Calls");
                } else if (tabId == R.id.tab_groups) {
                    // The tab with id R.id.tab_groups was selected,
                    // change your content accordingly.
                    textView.setText("Your Groups");
                } else if (tabId == R.id.tab_chats) {
                    // The tab with id R.id.tab_chats was selected,
                    // change your content accordingly.
                    textView.setText("Your Chats");
                }
            }
        });
    }
}
