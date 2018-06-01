package com.example.chrisantus.smer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class IngredientActivity extends AppCompatActivity {
    String[] ingredient = {"- - - - - - - -", "계란", "소세지", "베이컨", "올리브", "그린빈", "토마토소스",
            "식빵", "옥수수", "양파", "파프리카", "토마토", "치즈", "케찹", "마요네즈",
            "스파게티 면", "새우", "브로콜리", "마늘", "소금",
            "버섯", "생크림", "우유", "올리브 오일", "후추",
            "버터", "연유", "아몬드",
            "라면", "파슬리",
            "두부", "부침가루", "돈까스소스", "올리고당",
            "옥수수콘 통조림", "당근",
            "소고기 목살", "밀가루", "식초",
            "바나나", "계피분",
            "딸기", "상추", "간장", "매실진액", "깨", "참기름",
            "견과류", "식용유",
            "햄", "햄 슬라이스", "빵가루", "잼",
            "마카로니",
            "닭가슴살", "감자", "파", "카레",

            "다시마", "설탕",
            "튀김가루", "감자전분가루", "굴소스",
            "맛술", "혼다시",
            "밥"};

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient);

        button = findViewById(R.id.button1);


        //선택된 3개의 재료를 담을 곳
        final String[] selected_ing = {"", "", ""};
        //

        final Spinner spinner1 = findViewById(R.id.spinner1);
        final Spinner spinner2 = findViewById(R.id.spinner2);
        final Spinner spinner3 = findViewById(R.id.spinner3);

        //1. 재료 스트링 어레이와 어댑터 연결
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ingredient);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //2. 어댑터를 스피너1,2,3에 연결
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);

        //스피너1 선택 하면 스트링 저장
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //선택재료 어레이에 넣기
                selected_ing[0] = (String) spinner1.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //스피너2 선택 하면 스트링 저장
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //선택재료 어레이에 넣기
                selected_ing[1] = (String) spinner2.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //스피너3 선택 하면 스트링 저장
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //선택재료 어레이에 넣기
                selected_ing[2] = (String) spinner3.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                //리스트 액티비티실행
                Intent intent = new Intent(getApplicationContext(), ListActivity.class);
                intent.putExtra("three_ingredient", selected_ing);
                startActivity(intent);
            }
        });
    }
}
