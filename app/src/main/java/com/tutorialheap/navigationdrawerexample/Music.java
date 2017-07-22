       package com.tutorialheap.navigationdrawerexample;

       import android.os.Bundle;
       import android.support.annotation.Nullable;
       import android.support.v4.app.Fragment;
       import android.view.LayoutInflater;
       import android.view.View;
       import android.view.ViewGroup;


       /**
        * Created by A.D. on 22/07/17.
        */


       public class Music extends Fragment {

           @Nullable
           @Override
           public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
                return inflater.inflate(R.layout.music_fragment, container, false);
           }


           @Override
           public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
               super.onViewCreated(view, savedInstanceState);
               getActivity().setTitle("Music");
           }
       }