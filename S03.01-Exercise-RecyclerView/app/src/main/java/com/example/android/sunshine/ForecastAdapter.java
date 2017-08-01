package com.example.android.sunshine;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.TextView;

/**
 * Created by cfung on 7/31/17.
 *
 *
 * // Within ForecastAdapter.java /////////////////////////////////////////////////////////////////
 // completed (15) Add a class file called ForecastAdapter
 // completed (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>

 // completed (23) Create a private string array called mWeatherData

 // TODO (47) Create the default constructor (we will pass in parameters in a later lesson)

 // completed (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
 // completed (17) Extend RecyclerView.ViewHolder

 // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////
 // completed (18) Create a public final TextView variable called mWeatherTextView

 // completed (19) Create a constructor for this class that accepts a View as a parameter
 // TODO (20) Call super(view) within the constructor for ForecastAdapterViewHolder
 // completed (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
 // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////
 *
 *
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>{

    private String [] mWeatherData = null;

    public ForecastAdapter(){

    }

    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{

        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View itemView){
            super(itemView);

            mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);

        }



    }

}
