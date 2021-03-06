package com.zero.shareby.chats;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zero.shareby.R;
import com.zero.shareby.customAdapter.ChatPagerAdapter;

public class ChatActivity extends AppCompatActivity  {
    private static final String TAG = "ChatsActivity";

    ViewPager viewPager;
    ChatPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ActionBar actionBar=getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        viewPager= findViewById(R.id.chat_view_pager);
        pagerAdapter=new ChatPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        TabLayout tab=findViewById(R.id.chat_tab_layout);
        tab.setupWithViewPager(viewPager);
    }


    @Override
    protected void onResume() {
        super.onResume();
        viewPager.setCurrentItem(1);

    }

    @Override
    protected void onPause() {
        super.onPause();

    }



}
