package com.example.lab07_real_myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class FragmentSender extends Fragment {
    private EditText editTextSender;
    private Button buttonSender;
    private TextView textView;

    public FragmentSender() {
        // Required empty public constructor
    }

    public static FragmentSender newInstance(String param1, String param2) {
        FragmentSender fragment = new FragmentSender();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View main = inflater.inflate(R.layout.fragment_sender, container, false);
        buttonSender = main.findViewById(R.id.buttonSender);
        editTextSender = main.findViewById(R.id.editTextSender);
        buttonSender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = getActivity().findViewById(R.id.textViewReciver);
                textView.setText(editTextSender.getText().toString());
            }
        });
        return main;
    }
}