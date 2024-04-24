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

        //App.instance = new App();
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

        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM) {
            if (!flag) {
                if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
                    binding.themeBtn.setIcon(getDrawable(nightIcon));
                } else if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO) {
                    binding.themeBtn.setIcon(getDrawable(R.drawable.vectorlight_press));
                }
            } else if (flag) {
                binding.themeBtn.setIcon(getDrawable(R.drawable.follow_system));
            }
        } else if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            binding.themeBtn.setIcon(getDrawable(nightIcon));
        } else if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO) {
            binding.themeBtn.setIcon(getDrawable(R.drawable.vectorlight_press));
        }

        appAboutFragment = new AppAboutFragment();
        duaForRichnessFragment = new DuaForRichnessFragment();

        binding.themeBtn.setOnClickListener(v -> {

            if (!flag) {

                if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM) {
                    binding.themeBtn.setIcon(getDrawable(R.drawable.vectornightpress));
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "checkedButton", R.id.setNightTheme);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightMode", 3);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightIcon", R.drawable.vectornightpress);

                } else if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO) {
                    binding.themeBtn.setIcon(getDrawable(R.drawable.vectornightpress));
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "checkedButton", R.id.setNightTheme);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightMode", 3);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightIcon", R.drawable.vectornightpress);
                } else if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
                    binding.themeBtn.setIcon(getDrawable(R.drawable.vectorlight_press));
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "checkedButton", R.id.setLightTheme);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightMode", 2);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightIcon", R.drawable.vectorlight_press);
                }
            } else if (flag) {

                if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
                    /*
                     */
                    binding.themeBtn.setIcon(getDrawable(R.drawable.follow_system));
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "checkedButton", R.id.setFollowSystemTheme);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightMode", 1);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightIcon", R.drawable.follow_system);

                } else if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM) {
                    binding.themeBtn.setIcon(getDrawable(R.drawable.vectorlight_press));
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "checkedButton", R.id.setLightTheme);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightMode", 2);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightIcon", R.drawable.vectorlight_press);

                } else if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO) {
                    binding.themeBtn.setIcon(getDrawable(R.drawable.vectornightpress));
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "checkedButton", R.id.setNightTheme);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightMode", 3);
                    SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightIcon", R.drawable.vectornightpress);
                }
            }

            recreate();
        });

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