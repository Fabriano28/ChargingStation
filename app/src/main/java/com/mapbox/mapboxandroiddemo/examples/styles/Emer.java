package com.mapbox.mapboxandroiddemo.examples.styles;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\n"},
        d2 = {"Lcom/mapbox/mapboxandroiddemo/examples/styles/Emergency;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "call", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}
)
public final class Emer extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_emergency);

        Button loc1 = (Button) findViewById(R.id.loc1);

        loc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Emer.this, EnRoute.class));
            }
        });

        ImageButton home1 = (ImageButton) findViewById(R.id.Home1);

        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Emer.this, MainActivity.class));
            }
        });

        ImageButton work1 = (ImageButton) findViewById(R.id.Workshop1);

        work1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Emer.this, Work.class));
            }
        });
    }

    public final void call(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intent dialIntent = new Intent("android.intent.action.DIAL");
        dialIntent.setData(Uri.parse("tel:123456789"));
        this.startActivity(dialIntent);

    }
}
