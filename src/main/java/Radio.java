public class Radio {
    private int currentStation;
    private int volume;
    private int allStations = 10;

    public int getAllStations() {
        return allStations;
    }

    public Radio(int allStations) {
        this.allStations = allStations;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > allStations - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == allStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = allStations - 1;
        } else {
            currentStation--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void upVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void downVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}