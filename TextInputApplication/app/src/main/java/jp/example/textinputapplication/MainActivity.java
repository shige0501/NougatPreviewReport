package jp.example.textinputapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private static final String[] mCitys = {
        "Hokkaido", "Aomori", "Iwate", "Miyagi", "Akita", "Yamagata", "Fukushima", "Ibaraki", "Tochigi", "Gunma",
        "Saitama", "Chiba", "Tokyo", "Kanagawa", "Niigata", "Toyama", "Ishikawa", "Fukui", "Yamanashi", "Nagano",
        "Gifu", "Shizuoka", "Aichi", "Mie", "Shiga", "Kyoto", "Ohsaka", "Hyogo", "Nara", "Wakayama",
        "Tottori", "Shimane", "Okayama", "Hiroshima", "Yamaguchi", "Tokushima", "Kagawa", "Ehime", "Kohchi", "Fukuoka",
        "Saga", "Nagasaki", "Kumamoto", "Ohita", "Miyazaki", "Kagoshima", "Okinawa"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, mCitys);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        View headerView = View.inflate(this, R.layout.list_header, null);
        listView.addHeaderView(headerView);
    }
}
