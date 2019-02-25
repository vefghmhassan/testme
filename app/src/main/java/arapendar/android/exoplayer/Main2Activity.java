package arapendar.android.exoplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.google.android.exoplayer2.ui.PlayerView;

import arapendar.android.exoeasyuse.ExoEasy;

public class Main2Activity extends AppCompatActivity {
PlayerView playerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        playerView=findViewById(R.id.videoFullScreenPlayer);
        ExoEasy.intializ(playerView,"https://hw7.cdn.asset.aparat.com/aparat-video/3c43a0ccb6152162ae76366945ea3e6913874679-144p__45679.mp4",this);
       // ExoEasyVidoePlayer.intializ(playerView,"https://hw7.cdn.asset.aparat.com/aparat-video/3c43a0ccb6152162ae76366945ea3e6913874679-144p__45679.mp4",this);
    }
}
