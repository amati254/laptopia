package com.example.amati.laptopia;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    public static final String [] COMPUTER_PURPOSES = new String[]{
            "GAMING LAPTOPS",
            "PROGRAMMING LAPTOPS",
            "BUSINESS LAPTOPS",
            "BUDGET LAPTOPS"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new
                ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, COMPUTER_PURPOSES));
        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        getListView().setTextFilterEnabled(true);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(getApplicationContext(), GamingActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(), ProgrammingActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(), BusinessActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(), CasualActivity.class));
                        break;

                    default:
                        break;
                }
            }
        });
    }
}
