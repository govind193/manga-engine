
package com.govind.manga;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Offline AI Manhwa Generator\n\nProject Setup Successful 🚀");
        textView.setTextSize(20);
        textView.setPadding(40, 100, 40, 40);

        setContentView(textView);
    }
}
