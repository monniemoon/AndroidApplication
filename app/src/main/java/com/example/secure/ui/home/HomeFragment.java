package com.example.secure.ui.home;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.secure.R;

import androidmads.library.qrgenearator.QRGContents;
import androidmads.library.qrgenearator.QRGEncoder;

public class HomeFragment extends Fragment {
    EditText val;
    Button generateQR;
    ImageView imgQR;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        val = root.findViewById(R.id.editTextNumber);
        generateQR = root.findViewById(R.id.generateQR);
        imgQR = root.findViewById(R.id.qrSnapShot);


        generateQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String database = val.getText().toString();
                QRGEncoder qrgEncoder = new QRGEncoder(database, null, QRGContents.Type.TEXT, 500); // sega e text moje da stane email i tn.
                try {
                    Bitmap bitmap = qrgEncoder.getBitmap();
                    imgQR.setImageBitmap(bitmap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        return root;
    }

}