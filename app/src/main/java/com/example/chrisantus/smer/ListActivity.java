package com.example.chrisantus.smer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


public class ListActivity extends AppCompatActivity {
    TextView textView100;

    //양식
    //계란피자의 재료
    String[] eggpizza_ing = {"- - - - - - - -", "계란", "소세지", "베이컨", "올리브", "그린빈", "치즈", "토마토소스"};
    //식빵피자의 재료
    String[] breadpizza_ing = {"- - - - - - - -", "식빵", "옥수수", "베이컨", "양파", "파프리카", "토마토", "치즈", "케찹", "마요네즈"};
    //토마토파스타의 재료
    String[] tomatopasta_ing = {"- - - - - - - -", "스파게티 면", "토마토소스", "새우", "브로콜리", "양파", "마늘", "소금"};
    //크림 파스타의 재료
    String[] creampasta_ing = {"- - - - - - - -", "스파게티 면", "버섯", "토마토", "양파", "마늘", "생크림", "우유", "올리브 오일", "후추", "소금", "치즈"};
    //홍콩식 프렌치 토스트
    String[] frenchtoast_ing = {"- - - - - - - -", "식빵", "계란", "소금", "버터", "연유", "아몬드"};
    //신라면 투움바 파스타 재료
    String[] shinpasta_ing = {"- - - - - - - -", "라면", "새우", "양파", "마늘", "버터", "치즈", "우유", "후추", "소금", "파슬리"};
    //두부까스 재료
    String[] dooboogasu_ing = {"- - - - - - - -", "두부", "부침가루", "계란", "돈까스소스", "올리고당", "양파", "빵가루"};
    //콘치즈
    String[] corncheese_ing = {"- - - - - - - -", "옥수수콘 통조림", "양파", "당근", "파프리카", "피망", "치즈", "마요네즈", "설탕", "소금", "후추", "버터", "파슬리"};
    //목살스테이크
    String[] steak_ing = {"- - - - - - - -", "소고기 목살", "버섯", "호박", "양파", "소금", "후추", "밀가루", "버터", "케찹", "설탕", "간장", "식초"};
    //바나나버터 토스트
    String[] bananatoast_ing = {"- - - - - - - -", "식빵", "버터", "바나나", "버터", "아몬드", "계피분"};
    //두부 딸기 샐러드
    String[] tofustrawberrysalad_ing = {"- - - - - - - -", "두부", "딸기", "상추", "간장", "식초", "매실진액", "깨", "참기름"};
    //식빵 맛탕
    String[] breadmattang_ing = {"- - - - - - - -", "식빵", "견과류", "아몬드", "식용유", "설탕", "올리고당"};
    //몬테크리스토 샌드위치
    String[] montecristo_ing = {"- - - - - - - -", "식빵", "달걀", "치즈", "햄", "햄 슬라이스", "빵가루", "잼", "버터"};
    //맥앤치즈
    String[] macandcheese_ing = {"- - - - - - - -", "마카로니", "치즈", "버터", "밀가루", "우유"};
    //닭가슴살 카레
    String[] chickencurry_ing = {"- - - - - - - -", "닭가슴살", "식용유", "당근", "감자", "양파", "고추", "파", "마늘", "버섯", "카레", "치즈", "소금", "후추"};
    //

    //중식,일식
    //Fragment 1
    String[] fragment1_ing = {"- - - - - - - -", "닭가슴살", "소금", "후추", "마늘", "다시마", "양파", "파", "간장", "설탕"};
    //Fragment 2
    String[] fragment2_ing = {"- - - - - - - -", "새우", "양파", "고추", "당근", "파", "튀김가루", "감자전분가루", "간장", "식초", "설탕", "굴소스"};
    //Fragment 3
    String[] fragment3_ing = {"- - - - - - - -", "계란", "식빵", "맛술", "혼다시", "설탕", "소금", "식용유", "마요네즈"};
    //Fragment 4
    String[] fragment4_ing = {"- - - - - - - -", "새우", "밥", "양파", "마늘", "파", "식용유"};
    //Fragment 5 하는중
    String[] fragment5_ing = {"닭가슴살", "소금", "후추", "마늘", "다시마", "양파", "파", "간장", "설탕"};
    //Fragment 6
    String[] fragment6_ing = {"닭가슴살", "소금", "후추", "마늘", "다시마", "양파", "파", "간장", "설탕"};
    //Fragment 7
    String[] fragment7_ing = {"닭가슴살", "소금", "후추", "마늘", "다시마", "양파", "파", "간장", "설탕"};
    //Fragment 8
    String[] fragment8_ing = {"닭가슴살", "소금", "후추", "마늘", "다시마", "양파", "파", "간장", "설탕"};
    //Fragment 9
    String[] fragment9_ing = {"닭가슴살", "소금", "후추", "마늘", "다시마", "양파", "파", "간장", "설탕"};
    //Fragment 10
    String[] fragment10_ing = {"닭가슴살", "소금", "후추", "마늘", "다시마", "양파", "파", "간장", "설탕"};
    //Fragment 11
    String[] fragment11_ing = {"닭가슴살", "소금", "후추", "마늘", "다시마", "양파", "파", "간장", "설탕"};
    //Fragment 12
    String[] fragment12_ing = {"닭가슴살", "소금", "후추", "마늘", "다시마", "양파", "파", "간장", "설탕"};
    //Fragment 13
    String[] fragment13_ing = {"닭가슴살", "소금", "후추", "마늘", "다시마", "양파", "파", "간장", "설탕"};
    //Fragment 14
    String[] fragment14_ing = {"닭가슴살", "소금", "후추", "마늘", "다시마", "양파", "파", "간장", "설탕"};
    //Fragment 15
    String[] fragment15_ing = {"닭가슴살", "소금", "후추", "마늘", "다시마", "양파", "파", "간장", "설탕"};
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView listview;
        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listView1);
        listview.setAdapter(adapter);

        textView100 = findViewById(R.id.ttt);

        int count = 0;


        Intent intent = getIntent();
        String[] selected_ingredient = intent.getStringArrayExtra("three_ingredient");

        //리스트에 더하기
        //계란피자
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < eggpizza_ing.length; b++) {
                if (selected_ingredient[a].equals(eggpizza_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.eggpizza1),
                                "계란 피자", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //식빵피자
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < breadpizza_ing.length; b++) {
                if (selected_ingredient[a].equals(breadpizza_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.breadpizza1),
                                "식빵 피자", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //토마토파스타
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < tomatopasta_ing.length; b++) {
                if (selected_ingredient[a].equals(tomatopasta_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.tomatopasta1),
                                "토마토 파스타", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //크림 파스타
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < creampasta_ing.length; b++) {
                if (selected_ingredient[a].equals(creampasta_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.creampasta1),
                                "크림 파스타", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //홍콩식 프렌치 토스트
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < frenchtoast_ing.length; b++) {
                if (selected_ingredient[a].equals(frenchtoast_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.frenchtoast1),
                                "홍콩식 프렌치 토스트", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //신라면 투움바 파스타
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < shinpasta_ing.length; b++) {
                if (selected_ingredient[a].equals(shinpasta_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.shinramyunpasta1),
                                "신라면 투움바 파스타", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //두부까스
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < dooboogasu_ing.length; b++) {
                if (selected_ingredient[a].equals(dooboogasu_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.dooboogasu1),
                                "두부까스", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //콘치즈
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < corncheese_ing.length; b++) {
                if (selected_ingredient[a].equals(corncheese_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.corncheese1),
                                "콘치즈", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //목살스테이크
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < steak_ing.length; b++) {
                if (selected_ingredient[a].equals(steak_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.steak1),
                                "목살 스테이크", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //바나나버터 토스트
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < bananatoast_ing.length; b++) {
                if (selected_ingredient[a].equals(bananatoast_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bananatoast1),
                                "바나나버터 토스트", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //두부 딸기 샐러드
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < tofustrawberrysalad_ing.length; b++) {
                if (selected_ingredient[a].equals(tofustrawberrysalad_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.tofustrawberrysalad1),
                                "두부 딸기 샐러드", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //식빵 맛탕
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < breadmattang_ing.length; b++) {
                if (selected_ingredient[a].equals(breadmattang_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.breadmattang1),
                                "식빵 맛탕", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //계란피자
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < montecristo_ing.length; b++) {
                if (selected_ingredient[a].equals(montecristo_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.montecristosandwich1),
                                "몬테크리스토 샌드위치", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //맥앤치즈
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < macandcheese_ing.length; b++) {
                if (selected_ingredient[a].equals(macandcheese_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.macandcheese1),
                                "맥앤치즈", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //치킨 카레
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < chickencurry_ing.length; b++) {
                if (selected_ingredient[a].equals(chickencurry_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.chickencurry1),
                                "닭가슴살 카레", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //중식,일식
        //fragment1
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < fragment1_ing.length; b++) {
                if (selected_ingredient[a].equals(fragment1_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.oya),
                                "오야꼬동", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //fragment2
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < fragment2_ing.length; b++) {
                if (selected_ingredient[a].equals(fragment2_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.shrimp),
                                "깐풍새우", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //fragment3
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < fragment3_ing.length; b++) {
                if (selected_ingredient[a].equals(fragment3_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.tamago),
                                "타마고산도", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;

        //fragment4
        for (int a = 0; a < selected_ingredient.length; a++) {
            for (int b = 0; b < fragment4_ing.length; b++) {
                if (selected_ingredient[a].equals(fragment4_ing[b])) {
                    count++;
                    if (count == 3) {
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.hirice),
                                "구운새우 하이라이스 덮밥", selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);
                    }
                }
            }
        }
        //reset count
        count = 0;


        //리스트 메뉴 클릭리스너
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //선택된 아이템의 포지션을 읽음
                ListViewItem item = (ListViewItem) parent.getItemAtPosition(position);
                String titleStr = item.getTitle();

                //계란 피자선택시
                if (titleStr.equals("계란 피자")) {
                    Intent intent = new Intent(ListActivity.this, EggPizza.class);
                    startActivity(intent);
                }
                //식빵 피자선택시
                if (titleStr.equals("식빵 피자")) {
                    Intent intent = new Intent(ListActivity.this, BreadPizza.class);
                    startActivity(intent);
                }
                //토마토 파스타선택시
                if (titleStr.equals("토마토 파스타")) {
                    Intent intent = new Intent(ListActivity.this, TomatoPasta.class);
                    startActivity(intent);
                }
                //크림 파스타선택시
                if (titleStr.equals("크림 파스타")) {
                    Intent intent = new Intent(ListActivity.this, CreamPasta.class);
                    startActivity(intent);
                }
                //홍콩식 프렌치 토스트 선택시
                if (titleStr.equals("홍콩식 프렌치 토스트")) {
                    Intent intent = new Intent(ListActivity.this, FrenchToast.class);
                    startActivity(intent);
                }
                //신라면 투움바 파스타 선택시
                if (titleStr.equals("신라면 투움바 파스타")) {
                    Intent intent = new Intent(ListActivity.this, ShinPasta.class);
                    startActivity(intent);
                }
                //두부까스 선택시
                if (titleStr.equals("두부까스")) {
                    Intent intent = new Intent(ListActivity.this, DoobooGasu.class);
                    startActivity(intent);
                }
                //콘치즈 선택시
                if (titleStr.equals("콘치즈")) {
                    Intent intent = new Intent(ListActivity.this, CornCheese.class);
                    startActivity(intent);
                }
                //목살스테이크 선택시
                if (titleStr.equals("목살 스테이크")) {
                    Intent intent = new Intent(ListActivity.this, Steak.class);
                    startActivity(intent);
                }
                //바나나버터 토스트 선택시
                if (titleStr.equals("바나나버터 토스트")) {
                    Intent intent = new Intent(ListActivity.this, BananaToast.class);
                    startActivity(intent);
                }
                //두부 딸기 샐러드 선택시
                if (titleStr.equals("두부 딸기 샐러드")) {
                    Intent intent = new Intent(ListActivity.this, TofuStrawberrySalad.class);
                    startActivity(intent);
                }
                //식빵 맛탕 선택시
                if (titleStr.equals("식빵 맛탕")) {
                    Intent intent = new Intent(ListActivity.this, BreadMattang.class);
                    startActivity(intent);
                }
                //몬테크리스토 샌드위치 선택시
                if (titleStr.equals("몬테크리스토 샌드위치")) {
                    Intent intent = new Intent(ListActivity.this, Montecristo.class);
                    startActivity(intent);
                }
                //맥앤치즈 선택시
                if (titleStr.equals("맥앤치즈")) {
                    Intent intent = new Intent(ListActivity.this, MacandCheese.class);
                    startActivity(intent);
                }
                //맥앤치즈 선택시
                if (titleStr.equals("맥앤치즈")) {
                    Intent intent = new Intent(ListActivity.this, MacandCheese.class);
                    startActivity(intent);
                }
                //닭가슴살 카레 선택시
                if (titleStr.equals("닭가슴살 카레")) {
                    Intent intent = new Intent(ListActivity.this, ChickenCurry.class);
                    startActivity(intent);
                }


                //중식,일식
                //오야꼬동 선택시
                if (titleStr.equals("오야꼬동")) {
                    Intent intent = new Intent(ListActivity.this, FragmentOne.class);
                    startActivity(intent);
                }
                //깐풍새우 선택시
                if (titleStr.equals("깐풍새우")) {
                    Intent intent = new Intent(ListActivity.this, FragmentTwo.class);
                    startActivity(intent);
                }
                //타마고산도 선택시
                if (titleStr.equals("타마고산도")) {
                    Intent intent = new Intent(ListActivity.this, FragmentThree.class);
                    startActivity(intent);
                }
                //구운새우 하이라이스 덮밥 선택시
                if (titleStr.equals("구운새우 하이라이스 덮밥")) {
                    Intent intent = new Intent(ListActivity.this, FragmentFour.class);
                    startActivity(intent);
                }
            }
        });

        textView100.setText(selected_ingredient[0] + " / " + selected_ingredient[1] + " / " + selected_ingredient[2]);


    }
}
