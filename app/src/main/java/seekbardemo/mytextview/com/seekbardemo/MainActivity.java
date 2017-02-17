package seekbardemo.mytextview.com.seekbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView question;
    private TextView Rating;
    private SeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question = (TextView) findViewById(R.id.questionID);
        Rating = (TextView) findViewById(R.id.seekBarAnswer);
        seekbar = (SeekBar) findViewById(R.id.seekBar);

        Rating.setText("Rating: " + seekbar.getProgress() + "/" + seekbar.getMax());

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                Rating.setText("Rating: " + progress + "/" + seekBar.getMax());
                
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Started Tracking!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Stopped Tracking!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
