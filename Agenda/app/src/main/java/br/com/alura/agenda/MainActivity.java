package br.com.alura.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
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
                Arrays.asList("Alex","Caio","Joao"));
        TextView student1 = findViewById(R.id.textView);
        TextView student2 = findViewById(R.id.textView2);
        TextView student3 = findViewById(R.id.textView3);

        student1.setText(students.get(0));
        student2.setText(students.get(1));
        student3.setText(students.get(2));

    }
}
