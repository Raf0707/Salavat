package raf.tabiin.duaforrichness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.splashscreen.SplashScreen;

import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.google.android.material.color.DynamicColors;

import raf.tabiin.duaforrichness.databinding.ActivityMainBinding;
import raf.tabiin.duaforrichness.ui.about_app.AppAboutFragment;
import raf.tabiin.duaforrichness.ui.counter.MainSwipeFragment;
import raf.tabiin.duaforrichness.ui.dua.DuaForRichnessFragment;
import raf.tabiin.duaforrichness.util.SharedPreferencesUtils;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    DuaForRichnessFragment duaForRichnessFragment;
    AppAboutFragment appAboutFragment;
    Boolean flag = false;

    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int nightIcon = SharedPreferencesUtils.getInteger(this, "nightIcon", R.drawable.vectornightpress);

        App.instance.setNightMode();

        SplashScreen splashScreen = SplashScreen.installSplashScreen(this);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        view = findViewById(R.id.view);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.containerFragment, new DuaForRichnessFragment())
                    .commit();
        }

        if (SharedPreferencesUtils.getBoolean(this, "useDynamicColors"))
            DynamicColors.applyToActivityIfAvailable(this);

        if (SharedPreferencesUtils.getBoolean(this, "addFollowSystemIcon"))
            flag = true;

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        appAboutFragment = new AppAboutFragment();
        duaForRichnessFragment = new DuaForRichnessFragment();

        binding.navView.setSelectedItemId(R.id.duaforreachness);

        binding.navView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {

                case R.id.duaforreachness:

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.containerFragment, new DuaForRichnessFragment())
                            .commit();

                    return true;

                case R.id.counter:

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.containerFragment, new MainSwipeFragment())
                            .commit();

                    return true;

                case R.id.about_app:

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.containerFragment, new AppAboutFragment())
                            .commit();
                    return true;
            }
            return false;
        });
    }

}