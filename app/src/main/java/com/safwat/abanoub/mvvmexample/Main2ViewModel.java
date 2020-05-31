package com.safwat.abanoub.mvvmexample;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

//MVVM with View Binding
public class Main2ViewModel extends ViewModel {

    public MutableLiveData<String> movieName =new MutableLiveData<>();

    public void onButtonClicked() {

        Movie movie=getMovieFromDatabase();
        movieName.setValue(movie.name);
    }

    public Movie getMovieFromDatabase(){
        return new Movie("Cast Away", "");
    }
}
