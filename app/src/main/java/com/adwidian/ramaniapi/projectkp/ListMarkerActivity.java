package com.adwidian.ramaniapi.projectkp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListMarkerActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_marker);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerV);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        int [] gambar = {
                R.drawable.hospital_buildings,
                R.drawable.hospital_buildings,
                R.drawable.hospital_buildings,
                R.drawable.hospital_buildings,
                R.drawable.hospital_buildings,
                R.drawable.hospital_buildings,
                R.drawable.hospital_buildings,
                R.drawable.hospital_buildings,
                R.drawable.hospital_buildings,
                R.drawable.hospital_buildings,
                R.drawable.hospital_buildings,
                R.drawable.hospital_buildings,
                R.drawable.hospital_buildings
        };

        String [] nama_puskesmas = {
                "Puskesmas Pocol",
                "Puskesmas Pandanaran",
                "Puskesmas Bulu Lor",
                "Puskesmas Miroto",
                "Puskesmas Halmahera",
                "Puskesmas Pembantu Muktiharjo Kidul",
                "Puskesmas Gayamsari",
                "Puskesmas Gubug1",
                "RS Bhakti Wira Tamtama",
                "RS Hermina",
                "RSUP Kariadi",
                "RSU William Booth",
                "SMC Telogorejo"
        };

        String [] alamat = {
                "Jl. Imam Bonjol 114, Purwosari, Semarang Utara, Kota Semarang, Jawa Tengah 50132",
                "Jl. Pandanaran No.79, Pekunden, Semarang Tengah, Kota Semarang, Jawa Tengah 50134",
                "Jl. Banowati Sel. II, Bulu Lor, Semarang Utara, Kota Semarang, Jawa Tengah 50179",
                "JL. Taman Seteran Barat No.3, Miroto, Central Semarang, Semarang City, Central Java 50134",
                "Jl. Halmahera Raya No.38, Karangtempel, Semarang Tim., Kota Semarang, Jawa Tengah 50232",
                "Taman suryo kusumo semarang, Peterongan, Semarang Sel., Kota Semarang, Jawa Tengah 50242",
                "Jl.Slamet Riyadi, Gayamsari, Kota Semarang, Jawa Tengah 50248",
                "Jl. Semarang - Purwodadi No.53, Gubug, Kabupaten Grobogan, Jawa Tengah 58164",
                "Jl. DR. Sutomo IV No.17, Barusari, Semarang Sel., Kota Semarang, Jawa Tengah 50245",
                "Jalan Pandanaran No.24, Randusari, Semarang Selatan, Pekunden, Semarang Tengah, Kota Semarang, Jawa Tengah 50241",
                "Jalan Doktor Sutomo No.16, Randusari, Semarang Selatan, Kota Semarang, Jawa Tengah 50244",
                "Jalan Letjend S. Parman No.5, Petompon, Gajahmungkur, Kota Semarang, Jawa Tengah 50237",
                "Jl. Kh Ahmad Dahlan, Pekunden, Semarang Tengah, Kota Semarang, Jawa Tengah 50134"
        };

        Double [] latitude = {
                -6.973777,
                -6.986941,
                -6.975124,
                -6.983519,
                -6.994792,
                -7.000170,
                -6.999884,
                -6.991396,
                -6.987349,
                -6.985648,
                -6.993613,
                -6.996784,
                -6.987919
        };

        Double [] longitude = {
                110.414669,
                110.414635,
                110.406982,
                110.419010,
                110.437767,
                110.435669,
                110.448831,
                110.425618,
                110.407786,
                110.412866,
                110.407265,
                110.405100,
                110.426224
        };

        ArrayList<ModelFungsi> puskesmaslist = new ArrayList<>();

        for (int i=0; i<nama_puskesmas.length; i++){
            ModelFungsi puskesmas = new ModelFungsi(gambar[i],nama_puskesmas[i],alamat[i],latitude[i],longitude[i]);
            puskesmaslist.add(puskesmas);
        }

        Adapter adapter = new Adapter(this,puskesmaslist);
        recyclerView.setAdapter(adapter);
    }
}
