package lombok.animals;

import lombok.Builder;
import lombok.extern.java.Log;
import lombok.foods.HorseFood;

import java.util.logging.Logger;

/**
 * Created by kicsen on 2016. 12. 12..
 */
@Log

public class Horse extends AbstractAnimal {
    @Builder
    public Horse(String name, long weightInGram, double happiness) {
        super(name, weightInGram, happiness);
    }

    public void logOwnInfo() {
        log.info(this.toString());
    }

    public void feed(HorseFood food) {
        super.feed(food);
    }

    protected int getMoveHappinessDecrease() {
        return 1;
    }

    public String toString() {
        return "Horse(super=" + super.toString() + ")";
    }

    public boolean equals(Object o) {
        return super.equals(o);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
