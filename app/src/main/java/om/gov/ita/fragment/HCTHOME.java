package om.gov.ita.fragment;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import om.gov.ita.fragment.hct_students.HCTStudentFragment;
import om.gov.ita.fragment.hcthome.HCTHomeFragment;

public class HCTHOME extends AppCompatActivity implements HCTHomeFragment.OnFragmentInteractionListener,
        HCTStudentFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hcthome);
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        HCTHomeFragment fragment=new HCTHomeFragment();
        transaction.replace(R.id.container_main,fragment);
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
