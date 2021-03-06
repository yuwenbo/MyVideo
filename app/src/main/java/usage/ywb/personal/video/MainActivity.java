package usage.ywb.personal.video;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import usage.ywb.personal.video.player.ui.activity.VideoListActivity;
import usage.ywb.personal.video.record.RecordActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.list_btn).setOnClickListener(this);
        findViewById(R.id.record_btn).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.list_btn:
                intent = new Intent(this, VideoListActivity.class);
                break;
            case R.id.record_btn:
                intent = new Intent(this, RecordActivity.class);
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }

}
