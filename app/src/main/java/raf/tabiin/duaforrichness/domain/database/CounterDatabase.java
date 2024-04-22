package raf.tabiin.duaforrichness.domain.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import raf.tabiin.duaforrichness.domain.dao.CounterDao;
import raf.tabiin.duaforrichness.domain.models.CounterItem;
import raf.tabiin.duaforrichness.domain.dao.CounterDao;

@Database(entities = {CounterItem.class}, version = 1)
public abstract class CounterDatabase extends RoomDatabase {
    public abstract CounterDao counterDao();
    private static CounterDatabase INSTANCE;
    public static synchronized CounterDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            CounterDatabase.class, "counter_database")
                    .allowMainThreadQueries().build(); //.fallbackToDestructiveMigration()
        }
        return INSTANCE;
    }
}

