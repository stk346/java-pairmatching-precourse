package pairmatching.domain;

import java.util.ArrayList;
import java.util.List;

public class Pair {

    private String firstCrew;
    private String secondCrew;
    private String thirdCrew;

    public Pair(String firstCrew, String secondCrew) {
        this.firstCrew = firstCrew;
        this.secondCrew = secondCrew;
    }

    public void addPair(String thirdCrew) {
        this.thirdCrew = thirdCrew;
    }

    public List<String> getPair() {
        List<String> pair = new ArrayList<>();
        pair.add(firstCrew);
        pair.add(secondCrew);
        if (thirdCrew != null) {
            pair.add(thirdCrew);
        }
        return pair;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (firstCrew.equals(pair.firstCrew) || firstCrew.equals(pair.secondCrew)) {
            return true;
        }
        if (secondCrew.equals(pair.secondCrew) || secondCrew.equals(pair.firstCrew)) {
            return true;
        }
        if (whenThirdCrewExist()) return true;
        return thirdCrew != null ? thirdCrew.equals(pair.thirdCrew) : pair.thirdCrew == null;
    }

    private boolean whenThirdCrewExist() {
        if (thirdCrew != null) {
            if (thirdCrew.equals(firstCrew) || thirdCrew.equals(secondCrew) || thirdCrew.equals(thirdCrew)) {
                return true;
            }
            if (firstCrew.equals(firstCrew) || firstCrew.equals(secondCrew) || firstCrew.equals(thirdCrew)) {
                return true;
            }
            if (secondCrew.equals(firstCrew) || secondCrew.equals(secondCrew) || secondCrew.equals(thirdCrew)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = firstCrew.hashCode();
        result = 31 * result + secondCrew.hashCode();
        result = 31 * result + (thirdCrew != null ? thirdCrew.hashCode() : 0);
        return result;
    }
}
