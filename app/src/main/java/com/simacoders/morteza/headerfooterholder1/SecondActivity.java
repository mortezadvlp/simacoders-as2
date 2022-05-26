package com.simacoders.morteza.headerfooterholder1;

import android.os.Bundle;
import android.support.annotation.Nullable;

public class SecondActivity extends HolderActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFrameLayout(R.layout.layout2);

        setTextViewComment("You are in Second Activity");
    }
}
