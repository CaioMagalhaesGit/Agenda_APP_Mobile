package br.com.alura.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> students = new ArrayList<>(
                Arrays.asList("Alex","Caio","Joao","Levi","Jose"));
       ListView StudentList = findViewById(R.id.activity_main_studentList);
        StudentList.setAdapter(new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, students));
    }
}
