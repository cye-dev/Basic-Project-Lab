package org.techtwon.test;

import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class VetNavi extends AppCompatActivity {
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private VetFragmentDiagnosis vet_fragmentDiagnosis = new VetFragmentDiagnosis();
    private VetFragmentMyPage vet_fragmentMyPage = new VetFragmentMyPage();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vet_navigation);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, vet_fragmentDiagnosis).commitAllowingStateLoss();
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setOnItemSelectedListener(new ItemSelectedListener());

    }
    class ItemSelectedListener implements BottomNavigationView.OnItemSelectedListener{
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch(menuItem.getItemId())
            {

                case R.id.vet_Diagnosis:
                    transaction.replace(R.id.frameLayout, vet_fragmentDiagnosis).commitAllowingStateLoss();
                    break;
                case R.id.vet_MyPage:
                    transaction.replace(R.id.frameLayout, vet_fragmentMyPage).commitAllowingStateLoss();
                    break;
            }
            return true;
        }
    }
}