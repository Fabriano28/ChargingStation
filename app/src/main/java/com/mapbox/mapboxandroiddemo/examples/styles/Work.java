package com.mapbox.mapboxandroiddemo.examples.styles;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"},
        d2 = {"Lcom/mapbox/mapboxandroiddemo/examples/styles/Workshop;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}
)
public final class Work extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_work_shop);

        ImageButton home2 = (ImageButton) findViewById(R.id.Home2);

        home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Work.this, MainActivity.class));
            }
        });

        ImageButton emer2 = (ImageButton) findViewById(R.id.Emergency2);

        emer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Work.this, Emer.class));
            }
        });

    }
}
