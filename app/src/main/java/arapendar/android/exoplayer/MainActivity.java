package arapendar.android.exoplayer;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

//
//    public static final int MIN_BUFFER_DURATION = 3000;
//    //Max Video you want to buffer during PlayBack
//    public static final int MAX_BUFFER_DURATION = 5000;
//    //Min Video you want to buffer before start Playing it
//    public static final int MIN_PLAYBACK_START_BUFFER = 1500;
//    //Min video You want to buffer when user resumes video
//    public static final int MIN_PLAYBACK_RESUME_BUFFER = 5000;
//    public static final String DEFAULT_VIDEO_URL = "https://androidwave.com/media/androidwave-video-exo-player.mp4";
//ProgressBar progress;
//    PlayerView videoFullScreenPlayer;
//
//    String videoUri;
//    SimpleExoPlayer player;
//    Handler mHandler;
//    boolean active=false;
//    Runnable mRunnable;
//    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // progress=findViewById(R.id.progress);
    }
//        videoFullScreenPlayer=findViewById(R.id.videoFullScreenPlayer);
//
//        if (ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE==0){
//            hideSystemUI();
//
//
//        }
//       videoUri="https://hw7.cdn.asset.aparat.com/aparat-video/3c43a0ccb6152162ae76366945ea3e6913874679-144p__45679.mp4";
//
//
//        FloatingActionButton idme=findViewById(R.id.idme);
//        idme.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (!active) {
//                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//                    hideSystemUI();
//                }else {
//                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//                    showSystemUI();
//                }
//
//            }
//        });
//       // videoUri=DEFAULT_VIDEO_URL;
//setUp();
//
//    }
//    private void setUp() {
//        initializePlayer();
//        if (videoUri == null) {
//            return;
//        }
//        buildMediaSource(Uri.parse(videoUri));
//    }
//    private void initializePlayer() {
//        if (player == null) {
//            // 1. Create a default TrackSelector
//            LoadControl loadControl = new DefaultLoadControl(
//                    new DefaultAllocator(true, 16),
//                  MIN_BUFFER_DURATION,
//                  MAX_BUFFER_DURATION,
//                   MIN_PLAYBACK_START_BUFFER,
//                    MIN_PLAYBACK_RESUME_BUFFER, -1, true);
//
//            BandwidthMeter bandwidthMeter = new DefaultBandwidthMeter();
//            TrackSelection.Factory videoTrackSelectionFactory =
//                    new AdaptiveTrackSelection.Factory(bandwidthMeter);
//            TrackSelector trackSelector =
//                    new DefaultTrackSelector(videoTrackSelectionFactory);
//            // 2. Create the player
//            player = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(this), trackSelector, loadControl);
//            videoFullScreenPlayer.setPlayer(player);
//        }
//    }
//    private void buildMediaSource(Uri mUri) {
//        // Measures bandwidth during playback. Can be null if not required.
//        DefaultBandwidthMeter bandwidthMeter = new DefaultBandwidthMeter();
//        // Produces DataSource instances through which media data is loaded.
//        DataSource.Factory dataSourceFactory = new DefaultDataSourceFactory(this,
//                Util.getUserAgent(this, getString(R.string.app_name)), bandwidthMeter);
//        // This is the MediaSource representing the media to be played.
//        MediaSource videoSource = new ExtractorMediaSource.Factory(dataSourceFactory)
//                .createMediaSource(mUri);
//        // Prepare the player with the source.
//        player.prepare(videoSource);
//        player.setPlayWhenReady(true);
//        player.addListener(this);
//
//    }
//
//    @Override
//    public void onTimelineChanged(Timeline timeline, Object manifest, int reason) {
//
//    }
//
//    @Override
//    public void onTracksChanged(TrackGroupArray trackGroups, TrackSelectionArray trackSelections) {
//
//    }
//
//    @Override
//    public void onLoadingChanged(boolean isLoading) {
//
//    }
//
//    @Override
//    public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
//        switch (playbackState) {
//
//            case Player.STATE_BUFFERING:
//               progress.setVisibility(View.VISIBLE);
//                break;
//            case Player.STATE_ENDED:
//                // Activate the force enable
//                break;
//            case Player.STATE_IDLE:
//
//                break;
//            case Player.STATE_READY:
//                progress.setVisibility(View.GONE);
//
//                break;
//            default:
//                // status = PlaybackStatus.IDLE;
//                break;
//        }
//    }
//
//    @Override
//    public void onRepeatModeChanged(int repeatMode) {
//
//    }
//
//    @Override
//    public void onShuffleModeEnabledChanged(boolean shuffleModeEnabled) {
//
//    }
//
//    @Override
//    public void onPlayerError(ExoPlaybackException error) {
//
//    }
//
//    @Override
//    public void onPositionDiscontinuity(int reason) {
//
//    }
//
//    @Override
//    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
//
//    }
//
//    @Override
//    public void onSeekProcessed() {
//
//    }
//    private void hideSystemUI() {
//        // Enables regular immersive mode.
//        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
//        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
//        active=true;
//        View decorView = getWindow().getDecorView();
//        decorView.setSystemUiVisibility(
//                View.SYSTEM_UI_FLAG_IMMERSIVE
//                        // Set the content to appear under the system bars so that the
//                        // content doesn't resize when the system bars hide and show.
//                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                        // Hide the nav bar and status bar
//                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
//
//    }
//
//    // Shows the system bars by removing all the flags
//// except for the ones that make the content appear under the system bars.
//    private void showSystemUI() {
//        active=false;
//        View decorView = getWindow().getDecorView();
//        decorView.setSystemUiVisibility(
//                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
//    }
}
