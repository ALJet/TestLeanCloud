package indi.aljet.testleancloud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVInstallation;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.PushService;
import com.avos.avoscloud.SaveCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AVInstallation.getCurrentInstallation()
                .saveInBackground(new SaveCallback() {
                    @Override
                    public void done(AVException e) {
                        String installtionId = AVInstallation
                                .getCurrentInstallation()
                                .getInstallationId();
                    }
                });

        PushService.setDefaultPushCallback(this,MainActivity.class);
    }
}
