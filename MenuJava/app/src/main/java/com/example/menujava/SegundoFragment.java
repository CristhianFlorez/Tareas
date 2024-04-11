package com.example.menujava;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SegundoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_segundo, container, false);

        // Obtener referencia al Spinner desde el layout del fragmento
        Spinner spinner = view.findViewById(R.id.spinner);

        // Obtener las opciones desde el array de recursos
        String[] opciones = getResources().getStringArray(R.array.opciones_imagenes);

        // Crear un adaptador para el Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_spinner_item, opciones);

        // Especificar el diseño del dropdown
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Establecer el adaptador para el Spinner
        spinner.setAdapter(adapter);

        return view;
    }
}
