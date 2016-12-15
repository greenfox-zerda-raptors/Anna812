package lombok.animals;

import lombok.Builder;
import lombok.extern.java.Log;
import lombok.foods.Food;

import java.util.logging.Logger;

/**
 * Created by kicsen on 2016. 12. 12..
 */
@Log

public class Mouse extends AbstractAnimal {
    @Builder
    public Mouse(String name, long weightInGram, double happiness) {
        super(name, weightInGram, happiness);
    }

    public void logOwnInfo() {
        log.info(this.toString());
    }

    public void feed(Food food) {
        super.feed(food);
    }

    protected int getMoveHappinessDecrease() {
        return 3;
    }

    public String toString() {
        return "Mouse(super=" + super.toString() + ")";
    }

    public boolean equals(Object o) {
        return super.equals(o);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
