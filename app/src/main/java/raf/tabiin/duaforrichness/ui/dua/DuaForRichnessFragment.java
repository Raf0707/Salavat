package raf.tabiin.duaforrichness.ui.dua;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.snackbar.Snackbar;

import raf.tabiin.duaforrichness.R;
import raf.tabiin.duaforrichness.databinding.FragmentDuaForRichnessBinding;

public class DuaForRichnessFragment extends Fragment {

    FragmentDuaForRichnessBinding b;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        b = FragmentDuaForRichnessBinding.inflate(getLayoutInflater());

        b.i1.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i1Arabic.getText().toString() + "\n"
                            + b.i1Transcript.getText().toString() + "\n"
                            + b.i1Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v, " скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i2.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i2Arabic.getText().toString() + "\n"
                            + b.i2Transcript.getText().toString() + "\n"
                            + b.i2Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i3.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i3Arabic.getText().toString() + "\n"
                            + b.i3Transcript.getText().toString() + "\n"
                            + b.i3Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i4.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i4Arabic.getText().toString() + "\n"
                            + b.i4Transcript.getText().toString() + "\n"
                            + b.i4Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i5.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i5Arabic.getText().toString() + "\n"
                            + b.i5Transcript.getText().toString() + "\n"
                            + b.i5Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i6.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i6Arabic.getText().toString() + "\n"
                            + b.i6Transcript.getText().toString() + "\n"
                            + b.i6Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i7.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i7Arabic.getText().toString() + "\n"
                            + b.i7Transcript.getText().toString() + "\n"
                            + b.i7Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i8.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i8Arabic.getText().toString() + "\n"
                            + b.i8Transcript.getText().toString() + "\n"
                            + b.i8Translate.getText().toString()
                            + b.i8Hadith.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i9.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i9Arabic.getText().toString() + "\n"
                            + b.i9Transcript.getText().toString() + "\n"
                            + b.i9Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i91.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i91Arabic.getText().toString() + "\n"
                            + b.i91Transcript.getText().toString() + "\n"
                            + b.i91Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i10.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i10Arabic.getText().toString() + "\n"
                            + b.i10Transcript.getText().toString() + "\n"
                            + b.i10Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i11.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i11Arabic.getText().toString() + "\n"
                            + b.i11Transcript.getText().toString() + "\n"
                            + b.i11Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i12.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i12Arabic.getText().toString() + "\n"
                            + b.i12Transcript.getText().toString() + "\n"
                            + b.i12Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i13.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i13Arabic.getText().toString() + "\n"
                            + b.i13Transcript.getText().toString() + "\n"
                            + b.i13Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i14.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i14Arabic.getText().toString() + "\n"
                            + b.i14Transcript.getText().toString() + "\n"
                            + b.i14Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i15.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i15Arabic.getText().toString() + "\n"
                            + b.i15Transcript.getText().toString() + "\n"
                            + b.i15Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i16.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i16Arabic.getText().toString() + "\n"
                            + b.i16Transcript.getText().toString() + "\n"
                            + b.i16Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i17.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i17Arabic.getText().toString() + "\n"
                            + b.i17Transcript.getText().toString() + "\n"
                            + b.i17Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });


        b.i18.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i18Arabic.getText().toString() + "\n"
                            + b.i18Transcript.getText().toString() + "\n"
                            + b.i18Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i19.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i19Arabic.getText().toString() + "\n"
                            + b.i19Transcript.getText().toString() + "\n"
                            + b.i19Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i20.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i20Arabic.getText().toString() + "\n"
                            + b.i20Transcript.getText().toString() + "\n"
                            + b.i20Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i21.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i21Arabic.getText().toString() + "\n"
                            + b.i21Transcript.getText().toString() + "\n"
                            + b.i21Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i22.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i22Arabic.getText().toString() + "\n"
                            + b.i22Transcript.getText().toString() + "\n"
                            + b.i22Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i23.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i23Arabic.getText().toString() + "\n"
                            + b.i23Transcript.getText().toString() + "\n"
                            + b.i23Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i24.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i24Arabic.getText().toString() + "\n"
                            + b.i24Transcript.getText().toString() + "\n"
                            + b.i24Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i25.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i25Arabic.getText().toString() + "\n"
                            + b.i25Transcript.getText().toString() + "\n"
                            + b.i25Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i26.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i26Arabic.getText().toString() + "\n"
                            + b.i26Transcript.getText().toString() + "\n"
                            + b.i26Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i27.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i27Arabic.getText().toString() + "\n"
                            + b.i27Transcript.getText().toString() + "\n"
                            + b.i27Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i28.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i28Arabic.getText().toString() + "\n"
                            + b.i28Transcript.getText().toString() + "\n"
                            + b.i28Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i29.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i29Arabic.getText().toString() + "\n"
                            + b.i29Transcript.getText().toString() + "\n"
                            + b.i29Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i30.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i30Arabic.getText().toString() + "\n"
                            + b.i30Transcript.getText().toString() + "\n"
                            + b.i30Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i31.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i31Arabic.getText().toString() + "\n"
                            + b.i31Transcript.getText().toString() + "\n"
                            + b.i31Translate.getText().toString()  + "\n \n Мусульманские приложения для Андроид в каталоге RuStore https://apps.rustore.ru/developer/ZPBnoCoBczpBFPZK0munW8NSpRTEayCj");

            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        return b.getRoot();
    }
}