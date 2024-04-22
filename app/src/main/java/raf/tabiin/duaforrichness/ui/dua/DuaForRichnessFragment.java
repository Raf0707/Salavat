package raf.tabiin.duaforrichness.ui.dua;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import raf.tabiin.duaforrichness.R;
import raf.tabiin.duaforrichness.databinding.FragmentDuaForRichnessBinding;

public class DuaForRichnessFragment extends Fragment {

    FragmentDuaForRichnessBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDuaForRichnessBinding.inflate(getLayoutInflater());



        return binding.getRoot();
    }
}