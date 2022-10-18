package seedu.duke.biometrics;

import seedu.duke.exception.IllegalValueException;
import seedu.duke.food.Food;

import java.util.ArrayList;

public class WeightAndFatList {

    private ArrayList<WeightAndFat> weightAndFatArrayList;

    public WeightAndFatList() {
        weightAndFatArrayList = new ArrayList<>();
    }

    public void addWeightAndFat(WeightAndFat weightAndFat) {
        weightAndFatArrayList.add(weightAndFat);
    }

    public int getSize() {
        return weightAndFatArrayList.size();
    }

    public ArrayList<WeightAndFat> getWeightAndFatList() {
        return weightAndFatArrayList;
    }
}