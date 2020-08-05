package com.zy.readerapplication.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @author seven
 * @description use SharePreference
 * @date 2020/7/3.
 */
public class SharedPreferencesUtils {

    private static SharedPreferences preferences = null;
    private static SharedPreferencesUtils utils;

    private SharedPreferencesUtils(Context context) {
        preferences = context.getApplicationContext().getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
    }

    public static SharedPreferencesUtils getInstance(Context context) {
        synchronized (SharedPreferencesUtils.class){
            if (utils == null) {
                utils = new SharedPreferencesUtils(context);
            }
            return utils;
        }
    }
    public SharedPreferences getSharedPreferences() {
        return preferences;
    }

    public void put(String key, Object object) {
        SharedPreferences.Editor editor = preferences.edit();
        if (object instanceof String) {
            editor.putString(key, (String) object);
        }else if (object instanceof Long) {
            editor.putLong(key, (Long) object);
        }else if (object instanceof Integer) {
            editor.putInt(key, (int) object);
        }else if (object instanceof Boolean) {
            editor.putBoolean(key, (Boolean) object);
        }else if (object instanceof Float) {
            editor.putFloat(key, (Float) object);
        }
        editor.apply();
    }

    public Object get(String key, Object object) {
        if (object instanceof String) {
            return preferences.getString(key, (String) object);
        } else if (object instanceof Long) {
            return preferences.getLong(key, (Long) object);
        } else if (object instanceof Integer) {
            return preferences.getInt(key, (Integer) object);
        } else if (object instanceof Boolean) {
            return preferences.getBoolean(key, (Boolean) object);
        } else if (object instanceof Float) {
            return preferences.getFloat(key, (Float) object);
        }
        return null;
    }

    public void clearPreferences() {
        preferences.edit().clear().apply();
    }

    public void remove(String key) {
        preferences.edit().remove(key).apply();
    }

    public String getString(String key, String def) {
        return preferences.getString(key, def);
    }

    public long getLong(String key, long def) {
        return preferences.getLong(key, def);
    }

    public int getInt(String key, int def) {
        return preferences.getInt(key, def);
    }

    public boolean getBoolean(String key, boolean def) {
        return preferences.getBoolean(key, def);
    }

    public float getFloat(String key, float def) {
        return preferences.getFloat(key, def);
    }

}
