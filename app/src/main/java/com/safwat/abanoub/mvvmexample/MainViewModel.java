package com.safwat.abanoub.mvvmexample;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

//MVVM without View Binding
public class MainViewModel extends ViewModel {

    MutableLiveData<String> movieName =new MutableLiveData<>();

    public void onButtonClicked() {

        Movie movie=getMovieFromDatabase();
        movieName.setValue(movie.name);
    }

    public Movie getMovieFromDatabase(){
        return new Movie("Cast Away", "");
    }
}
