package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddEditStudentActivity extends Activity {
    private EditText nameText;
    private EditText emailText;
    private EditText phoneText;
    private StudentDatabaseHelper dbHelper;
    private long id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_student);

        dbHelper = new StudentDatabaseHelper(this);
        nameText = findViewById(R.id.nameEditText);
        emailText = findViewById(R.id.emailEditText);
        phoneText = findViewById(R.id.phoneEditText);

        id = getIntent().getLongExtra("id", -1);
        if (id != -1) {
            Cursor cursor = dbHelper.getReadableDatabase().query("students", null, "_id = ?", new String[]{String.valueOf(id)}, null, null, null);
            if (cursor.moveToFirst()) {
                nameText.setText(cursor.getString(1));
                emailText.setText(cursor.getString(2));
                phoneText.setText(cursor.getString(3));
            }
            cursor.close();
        }
    }

    public void saveStudent(View view) {
        String name = nameText.getText().toString();
        String email = emailText.getText().toString();
        String phone = phoneText.getText().toString();

        if (id == -1) {
            dbHelper.getWritableDatabase().execSQL("INSERT INTO students (name, email, phone) VALUES (?, ?, ?)", new String[]{name, email, phone});
        } else {
            dbHelper.getWritableDatabase().execSQL("UPDATE students SET name = ?, email = ?, phone = ? WHERE _id = ?", new String[]{name, email, phone, String.valueOf(id)});
        }

        Intent intent = new Intent(this, StudentListActivity.class);
        startActivity(intent);
    }

    public void deleteStudent(View view) {
        if (id != -1) {
            dbHelper.getWritableDatabase().execSQL("DELETE FROM students WHERE _id = ?", new String[]{String.valueOf(id)});
            Intent intent = new Intent(this, StudentListActivity.class);
            startActivity(intent);
        }
    }
}
