package com.letseat.letseat;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 * Created by Reilly on 10/17/2015.
 */
public class LetsEatModel<T> {
    private List<T> options;
    private List<T> chosenOptions;
    private List<T> choices;
    private int numPeople;

    public LetsEatModel(List<T> options, int numPeople) {
        this.options = options;
        chosenOptions = new ArrayList<>();
        choices = new ArrayList<>();
        this.numPeople = numPeople;
    }

    public boolean addChoice(T choice) {
        if (choices.size() == numPeople * 2) {
            return false;
        }
        return choices.add(choice);
    }

    // Removes and returns 2 random possible choices
    // If there is only 1 choice, returns the 1 choice
    // If there are no choices, throws NoSuchElementException
    public List<T> getChoices() {
        return getSample(choices);
    }

    // If there are 2 or more unchosen options, returns 2 unchosen options
    // If there is only 1 unchosen option, returns 1 unchosen option and 1 random chosen option
    // If there are no unchosen options, returns 2 random chosen options
    public List<T> getOptions() {
        List<T> sample;
        try {
            sample = getSample(options);
            chosenOptions.addAll(sample);
            if (sample.size() == 1) {
                Random r = new Random();
                sample.add(chosenOptions.get(r.nextInt(chosenOptions.size())));
            }
        } catch (NoSuchElementException exception) {
            sample = new ArrayList<>();
            Random r = new Random();
            for (int i = 0; i < 2; i++) {
                sample.add(chosenOptions.get(r.nextInt(chosenOptions.size())));
            }
        }
        return sample;
    }

    private List<T> getSample(List<T> list) {
        if (list.size() == 0) {
            throw new NoSuchElementException();
        }

        List<T> result = new ArrayList<>();
        Random r = new Random();

        int i = r.nextInt(list.size());
        result.add(list.remove(i));
        if (list.size() != 0) {
            i = r.nextInt(list.size());
            result.add(list.remove(i));
        }

        return result;
    }
}
