package com.regi.bloodhound;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<String> _currentWeather = new MutableLiveData<>();
    private MutableLiveData<String> _lastUpdatedWeather = new MutableLiveData<>();

    public MutableLiveData<String> getCurrentWeather() {
        if(_currentWeather.getValue() == null){
            _currentWeather.postValue("Updating weather...");
        }
        return _currentWeather;
    }

    public MutableLiveData<String> getLastUpdatedWeather() {
        return _lastUpdatedWeather;
    }

    void loadWeather() {
        _currentWeather.postValue("not a test");
        _lastUpdatedWeather.postValue("meh?");
    }
}