package com.example.android.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.android.navigation.databinding.FragmentTitleBinding;

public class RulesFragment extends Fragment {

    private NavController mNavController3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable Bundle savedInstanceState) {
        FragmentRulesBinding binding = FragmentTitleBinding.inflate(inflater);
        mNavController3 = NavHostFragment.findNavController(this);
        binding.playButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNavController3.navigate(R.id.action_rulesFragment_to_gameFragment);
            }
        });

        return binding.getRoot();
    }
}
