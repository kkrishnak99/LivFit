package plkk.developers.com.livfit;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME ="User.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME ="User";
    public static final String COL_ID = "_id";
    public static final String COL_1="Name";
    public static final String COL_2="Username";
    public static final String COL_3="Password";
    public static final String COL_4="Height";
    public static final String COL_5="Weight";
    public static final String COL_6="Gender";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE " + TABLE_NAME + " ( " + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL_1 + " TEXT NOT NULL, "
                + COL_2 + " TEXT NOT NULL, "
                + COL_3 + " TEXT NOT NULL, "
                + COL_4 + " INTEGER NOT NULL, "
                + COL_5 + " INTEGER NOT NULL, "
                + COL_6 + " INTEGER NOT NULL ); ";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);

    }

    public boolean addData(Users users){
        ContentValues contentValues= new ContentValues();
        contentValues.put(COL_1,users.getFullname());
        contentValues.put(COL_2,users.getUsername());
        contentValues.put(COL_3,users.getPassword());
        contentValues.put(COL_4,users.getHeight());
        contentValues.put(COL_5,users.getWeight());
        contentValues.put(COL_6,users.getGender());
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        long result = sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
        sqLiteDatabase.close();
        if(result==-1)
            return false;
        else
            return true;

    }

    public boolean checkUser(String username){
        String[] columns = {
                COL_ID
        };
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        String selection = COL_2 + " = ?";
        String[] selectionArgs = {username};
        Cursor cursor = sqLiteDatabase.query(TABLE_NAME,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null);
        int cursorCount = cursor.getCount();
        cursor.close();
        sqLiteDatabase.close();
        if(cursorCount>0){
            return true;
        }
        return false;
    }

    public boolean checkUser(String username, String password){
        String[] columns = {
                COL_ID
        };
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        String selection = COL_2 + " = ? " + " AND " + COL_3 + " = ?";
        String[] selectionArgs = {username, password};
        Cursor cursor = sqLiteDatabase.query(TABLE_NAME,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null);
        int cursorCount = cursor.getCount();
        cursor.close();
        sqLiteDatabase.close();
        if(cursorCount > 0){
            return true;
        }
        return false;
    }

    public int getID(String username, String password) {
        String[] columns = {
                COL_ID
        };
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        String selection = COL_2 + " = ? " + " AND " + COL_3 + " = ?";
        String[] selectionArgs = {username, password};
        Cursor cursor = sqLiteDatabase.query(TABLE_NAME,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null);
        int id;
        cursor.moveToFirst();
        int index = cursor.getColumnIndex(COL_ID);
        id = cursor.getInt(index);
        cursor.close();
        return id;
    }

    public float get_height(String id) {
        String[] columns = {
                COL_4
        };
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        String selection = COL_ID + " = ? ";
        String[] selectionArgs = {id};
        Cursor cursor = sqLiteDatabase.query(TABLE_NAME,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null);
        float height;
        cursor.moveToFirst();
        int index = cursor.getColumnIndex(COL_4);
        height = cursor.getFloat(index);
        cursor.close();
        return height;
    }

    public float get_weight(String id) {
        String[] columns = {
                COL_5
        };
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        String selection = COL_ID + " = ? ";
        String[] selectionArgs = {id};
        Cursor cursor = sqLiteDatabase.query(TABLE_NAME,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null);
        float weight;
        cursor.moveToFirst();
        int index = cursor.getColumnIndex(COL_5);
        weight = cursor.getFloat(index);
        cursor.close();
        return weight;
    }

    public int get_gender(String id) {
        String[] columns = {
                COL_6
        };
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        String selection = COL_ID + " = ? " ;
        String[] selectionArgs = {id};
        Cursor cursor = sqLiteDatabase.query(TABLE_NAME,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null);
        int gender;
        cursor.moveToFirst();
        int index = cursor.getColumnIndex(COL_6);
        gender = cursor.getInt(index);
        cursor.close();
        return gender;
    }
    public String get_name(String id) {
        String[] columns = {
                COL_1
        };
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        String selection = COL_ID + " = ? " ;
        String[] selectionArgs = {id};
        Cursor cursor = sqLiteDatabase.query(TABLE_NAME,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null);
        String fullname;
        cursor.moveToFirst();
        int index = cursor.getColumnIndex(COL_1);
        fullname = cursor.getString(index);
        cursor.close();
        return fullname;
    }
    public void UpdateValues ( int id, float height, float weight){
        ContentValues cv = new ContentValues();
        cv.put(COL_4, height);
        cv.put(COL_5, weight);
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.update(TABLE_NAME,cv,"_id="+id,null);
    }
    }
