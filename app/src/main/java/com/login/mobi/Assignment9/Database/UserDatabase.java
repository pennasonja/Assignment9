package com.login.mobi.Assignment9.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.login.mobi.Assignment9.Models.User;

@Database(entities = {User.class}, version = 1, exportSchema = false)

public abstract class UserDatabase extends RoomDatabase {

    public abstract UserDao getUserDao();

}
