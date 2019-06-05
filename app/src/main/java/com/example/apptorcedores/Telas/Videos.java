package com.example.apptorcedores.Telas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.apptorcedores.R;
import com.example.apptorcedores.YTVideo;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubeInitializationResult;


public class Videos extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerView;
    YouTubePlayerView youTubePlayerView2;
    YouTubePlayer.OnInitializedListener onInitializedListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        playVideo1();
        playVideo2();
    }


    public void telaPrincipal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void playVideo1() {
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {

            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("xBoao8XTOSg");
                youTubePlayer.play();
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
            }
        };

        youTubePlayerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                youTubePlayerView.initialize(YTVideo.getApiKey(), onInitializedListener);
            }
        });
    }

    public void playVideo2() {
        youTubePlayerView2 = (YouTubePlayerView) findViewById(R.id.youtube_player2);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {

            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("gsqZOAcVK-w");
                youTubePlayer.play();
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
            }
        };

        youTubePlayerView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                youTubePlayerView2.initialize(YTVideo.getApiKey(), onInitializedListener);
            }
        });
    }

}





