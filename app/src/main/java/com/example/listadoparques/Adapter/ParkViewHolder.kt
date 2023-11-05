package com.example.listadoparques.Adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listadoparques.Park
import com.example.listadoparques.databinding.ItemParkBinding

class ParkViewHolder(view: View): RecyclerView.ViewHolder(view){
    val binding = ItemParkBinding.bind(view)
    fun render(parkModel:Park){
        binding.Nombre.text = parkModel.nombre
        binding.Info.text = parkModel.info
        Glide.with(binding.Foto.context).load(parkModel.photo)
            .into(binding.Foto)

        //Evento de hacer clic sobre la imagen del parque
        binding.Foto.setOnClickListener{
            Toast.makeText(binding.Foto.context, parkModel.nombre,
                Toast.LENGTH_LONG).show()
    }

        //evento de hacer clic, sobre todo el parque:
        itemView.setOnClickListener{
            Toast.makeText(binding.Foto.context, parkModel.nombre  ,
                Toast.LENGTH_LONG).show()}
    }
}