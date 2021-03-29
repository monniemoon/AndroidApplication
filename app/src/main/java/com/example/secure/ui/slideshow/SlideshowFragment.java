package com.example.secure.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.secure.R;
import com.example.secure.qrScanner;

public class SlideshowFragment extends Fragment {
    ImageView v1, v2, v3;
    Switch w1, w2;

    TextView q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);

        v1 = root.findViewById(R.id.imageView);
        v2 = root.findViewById(R.id.imageView2);
        v3 = root.findViewById(R.id.imageView5);

        w1 = root.findViewById(R.id.switch1);
        w2 = root.findViewById(R.id.switch2);

        q1 = root.findViewById(R.id.textView);
        q2 = root.findViewById(R.id.textView3);
        q3 = root.findViewById(R.id.textView2);
        q4 = root.findViewById(R.id.textView4);
        q5 = root.findViewById(R.id.textView5);
        q6 = root.findViewById(R.id.textView6);
        q7 = root.findViewById(R.id.textView7);
        q8 = root.findViewById(R.id.textView8);
        q9 = root.findViewById(R.id.textView10);
        q10 = root.findViewById(R.id.textView9);
        q11 = root.findViewById(R.id.textView11);
        q12 = root.findViewById(R.id.textView12);
        q13 = root.findViewById(R.id.textView13);
        q14 = root.findViewById(R.id.textView14);
        q15 = root.findViewById(R.id.textView15);






        return root;
    }

}