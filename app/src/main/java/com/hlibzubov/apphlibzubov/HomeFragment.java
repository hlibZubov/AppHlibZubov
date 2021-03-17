package com.hlibzubov.apphlibzubov;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment implements NotesAdapter.OnRecyclerItemClick {

    private RecyclerView recyclerView;
    private NotesAdapter notesAdapter;
    private List<NotesModel> modelList;

    private String[] head ={
            "Zadzwon do Filipa",
            "Napisz do Wiktora",
            "Mail do Jana",
            "Zadzwon do Filipa",
            "Lista Bedronka",
            "Zadzwon do Filipa"};
    private String[] decs ={"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris finibus at diam ac lacinia. Pellentesque iaculis gravida leo et pretium.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris finibus at diam ac lacinia. Pellentesque iaculis gravida leo et pretium.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris finibus at diam ac lacinia. Pellentesque iaculis gravida leo et pretium.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris finibus at diam ac lacinia. Pellentesque iaculis gravida leo et pretium.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris finibus at diam ac lacinia. Pellentesque iaculis gravida leo et pretium.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris finibus at diam ac lacinia. Pellentesque iaculis gravida leo et pretium."};
    private String[] time ={"11:00","18:15","1:45","08:15","16:15","21:30"};


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;




    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recyclear);

        modelList = new ArrayList<>();
        for (int i = 0;  i < head.length; i++){
            NotesModel notesModel = new NotesModel();
            notesModel.setHead(head[i]);
            notesModel.setDesc(decs[i]);
            notesModel.setTime(time[i]);
            modelList.add(notesModel);
        }
        notesAdapter = new NotesAdapter(modelList, getContext());
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(notesAdapter);
        notesAdapter.setOnRecyclerItemClick(this);
        return view;
    }

    @Override
    public void onClick(int pos) {
        switch (pos){
            case 0:
                openActivity1();
                break;
            case 1:
                openActivity2();
                break;
            case 2:
                openActivity3();
                break;
            case 3:
                openActivity4();
                break;
            case 4:
                openActivity5();
                break;
            case 5:
                openActivity6();
                break;
        }
    }

    public void openActivity1(){
        Intent intent  = new Intent();
        startActivity(intent);
    }
    public void openActivity2(){
        Intent intent = new Intent();
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent();
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent = new Intent();
        startActivity(intent);
    }
    public void openActivity5(){
        Intent intent = new Intent();
        startActivity(intent);
    }
    public void openActivity6(){
        Intent intent = new Intent();
        startActivity(intent);
    }
}